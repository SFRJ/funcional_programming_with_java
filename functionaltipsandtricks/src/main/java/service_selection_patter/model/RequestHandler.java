package service_selection_patter.model;

import service_selection_patter.generics.OperatorRequestType;
import service_selection_patter.generics.RequestUnmarshaller;
import service_selection_patter.generics.ServiceInvoker;
import service_selection_patter.registry.PowerOperatorRequestType;
import service_selection_patter.registry.SumOperatorRequestType;
import service_selection_patter.registry.SupportedRequests;
import java.util.List;

public class RequestHandler {

    public <REQUEST, RESPONSE> String handleRequest(String request) {
        for (OperatorRequestType r : requestTypes()) {
            OperatorRequestType<REQUEST, RESPONSE> operatorRequestType = r;

            try {
                if(operatorRequestType.requestMatcher().match(request)) {
                    operatorRequestType.validator().validate(request);
                    RequestUnmarshaller<REQUEST> unmarshaller = operatorRequestType.unmarshaller();
                    REQUEST unmarshalledRequest = unmarshaller.unmarshall(request);
                    ServiceInvoker<REQUEST, RESPONSE> invoker = operatorRequestType.invoker();
                    return operatorRequestType.marshaller().marshall(invoker.execute(unmarshalledRequest));
                }
            } catch (ValidatorException e) {
                return "Can't validate request";
            }
            operatorRequestType.validator();
        }
        return "Service not supported!";
    }

    public List<OperatorRequestType<? extends Object, ? extends Object>> requestTypes() {
        SupportedRequests supportedRequests = new SupportedRequests();
        supportedRequests.addRequest(new SumOperatorRequestType());
        supportedRequests.addRequest(new PowerOperatorRequestType());
        return supportedRequests.getRequests();
    }

}
