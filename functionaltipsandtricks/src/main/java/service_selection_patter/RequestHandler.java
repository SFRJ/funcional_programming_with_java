package service_selection_patter;

import service_selection_patter.services.BussinessException;
import service_selection_patter.services.ServiceInvoker;
import service_selection_patter.services.ResponseMarshaller;
import service_selection_patter.services.RequestMatcher;
import service_selection_patter.services.powerservice.PowerService;
import service_selection_patter.services.sumservice.SumService;
import service_selection_patter.services.RequestUnmarshaller;
import service_selection_patter.services.RequestValidator;

import javax.xml.bind.ValidationException;

public class RequestHandler {

    public <REQUEST, RESPONSE> String handleRequest(String request) {
        for (ServiceRequestType r : requestTypes()) {
            ServiceRequestType<REQUEST, RESPONSE> serviceRequestType = r;

            RequestMatcher requestMatcher = serviceRequestType.requestMatcher();
            RequestValidator validator = serviceRequestType.validator();
            RequestUnmarshaller<REQUEST> unmarshaller = serviceRequestType.unmarshaller();
            ServiceInvoker<REQUEST, RESPONSE, BussinessException> invoker = serviceRequestType.invoker();
            ResponseMarshaller<RESPONSE> marshaller = serviceRequestType.marshaller();

            try {
                if(requestMatcher.matches(request)) {
                    validator.validate(request);
                    REQUEST unmarshalledRequest = unmarshaller.unmarshall(request);
                    RESPONSE response = invoker.execute(unmarshalledRequest);
                    return marshaller.marshall(response);
                }
            } catch (ValidationException e) {
                return "Can't validate request";
            } catch (BussinessException bussiness_exception) {
                return  bussiness_exception.getMessage();
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
