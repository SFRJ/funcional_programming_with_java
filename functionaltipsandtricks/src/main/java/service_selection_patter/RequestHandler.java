package service_selection_patter;

import service_selection_patter.services.ServiceInvoker;
import service_selection_patter.services.ResponseMarshaller;
import service_selection_patter.services.RequestMatcher;
import service_selection_patter.errorhandling.ValidatorException;
import service_selection_patter.services.powerservice.PowerService;
import service_selection_patter.services.sumservice.SumService;
import service_selection_patter.services.RequestUnmarshaller;
import service_selection_patter.services.RequestValidator;

public class RequestHandler {

    public <REQUEST, RESPONSE, ERROR> String handleRequest(String request) {
        for (ServiceRequestType r : requestTypes()) {
            ServiceRequestType<REQUEST, RESPONSE> serviceRequestType = r;

            RequestMatcher requestMatcher = serviceRequestType.requestMatcher();
            RequestValidator validator = serviceRequestType.validator();
            RequestUnmarshaller<REQUEST> unmarshaller = serviceRequestType.unmarshaller();
            ServiceInvoker<REQUEST, RESPONSE> invoker = serviceRequestType.invoker();
            ResponseMarshaller<RESPONSE> marshaller = serviceRequestType.marshaller();

            try {
                if(requestMatcher.matches(request)) {
                    validator.validate(request);
                    REQUEST unmarshalledRequest = unmarshaller.unmarshall(request);
                    RESPONSE response = invoker.execute(unmarshalledRequest);
                    return marshaller.marshall(response);
                }
            } catch (ValidatorException e) {
                return "Can't validate request";
            }
        }
        return "Service not supported!";
    }

    public ServiceRequestType[] requestTypes() {
        return new ServiceRequestType[] {
                new PowerService(),
                new SumService()
        };
    }

}
