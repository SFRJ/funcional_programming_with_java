package service_selection_patter.services.powerservice;

import service_selection_patter.services.BussinessException;
import service_selection_patter.services.RequestValidator;
import service_selection_patter.services.ResponseMarshaller;
import service_selection_patter.services.ServiceInvoker;
import service_selection_patter.ServiceRequestType;
import service_selection_patter.services.powerservice.invoker.PowerServiceInvoker;
import service_selection_patter.services.powerservice.marshaller.PowerServiceMarshaller;
import service_selection_patter.services.powerservice.matcher.PowerServiceMatcher;
import service_selection_patter.services.RequestMatcher;
import service_selection_patter.services.powerservice.model.PowerRequest;
import service_selection_patter.services.powerservice.model.PowerResponse;
import service_selection_patter.services.powerservice.unmarshaller.PowerServiceUnmarshaller;
import service_selection_patter.services.RequestUnmarshaller;
import service_selection_patter.services.powerservice.validator.PowerServiceRequestValidator;

public class PowerService implements ServiceRequestType<PowerRequest, PowerResponse> {

    @Override
    public RequestMatcher requestMatcher() {
        return new PowerServiceMatcher();
    }

    @Override
    public RequestValidator validator() {
        return new PowerServiceRequestValidator();
    }

    @Override
    public RequestUnmarshaller<PowerRequest> unmarshaller() {
        return new PowerServiceUnmarshaller();
    }

    @Override
    public ResponseMarshaller<PowerResponse> marshaller() {
        return new PowerServiceMarshaller();
    }

    @Override
    public ServiceInvoker<PowerRequest, PowerResponse, BussinessException> invoker() {
        return new PowerServiceInvoker();
    }
}
