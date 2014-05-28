package service_selection_patter.generics;

public interface OperatorRequestType<REQUEST, RESPONSE>  {
        RequestMatcher requestMatcher();

        RequestUnmarshaller<REQUEST> unmarshaller();

        RequestValidator validator();

        ResponseMarshaller<RESPONSE> marshaller();

        ServiceInvoker<REQUEST, RESPONSE> invoker();
}
