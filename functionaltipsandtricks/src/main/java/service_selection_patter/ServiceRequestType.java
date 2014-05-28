package service_selection_patter;

import service_selection_patter.services.ServiceInvoker;
import service_selection_patter.services.ResponseMarshaller;
import service_selection_patter.services.RequestMatcher;
import service_selection_patter.services.RequestUnmarshaller;
import service_selection_patter.services.RequestValidator;

/*
This interface describes a set of instructions all of which have to be implemented to
successfully make sure that a service processes requests and returns responses
*/
public interface ServiceRequestType<REQUEST, RESPONSE>  {
        RequestMatcher requestMatcher();

        RequestValidator validator();

        RequestUnmarshaller<REQUEST> unmarshaller();

        ServiceInvoker<REQUEST, RESPONSE> invoker();

        ResponseMarshaller<RESPONSE> marshaller();
}
