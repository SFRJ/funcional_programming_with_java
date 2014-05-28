package service_selection_patter.services.sumservice;

import service_selection_patter.ServiceRequestType;
import service_selection_patter.services.ServiceInvoker;
import service_selection_patter.services.sumservice.invoker.SumServiceInvoker;
import service_selection_patter.services.ResponseMarshaller;
import service_selection_patter.services.sumservice.marshaller.SumServiceMarshaller;
import service_selection_patter.services.RequestMatcher;
import service_selection_patter.services.sumservice.matcher.SumServiceMatcher;
import service_selection_patter.services.sumservice.model.SumRequest;
import service_selection_patter.services.sumservice.model.SumResponse;
import service_selection_patter.services.RequestUnmarshaller;
import service_selection_patter.services.sumservice.unmarshaller.SumServiceUnmarshaller;
import service_selection_patter.services.RequestValidator;
import service_selection_patter.services.sumservice.validator.SumServiceValidator;

public class SumService implements ServiceRequestType {

    @Override
    public RequestMatcher requestMatcher() {
        return new SumServiceMatcher();
    }

    @Override
    public RequestValidator validator() {
        return new SumServiceValidator();
    }

    @Override
    public RequestUnmarshaller<SumRequest> unmarshaller() {
        return new SumServiceUnmarshaller();
    }

    @Override
    public ResponseMarshaller<SumResponse> marshaller() {
        return new SumServiceMarshaller();
    }

    @Override
    public ServiceInvoker<SumRequest, SumResponse> invoker() {
        return new SumServiceInvoker();
    }

}
