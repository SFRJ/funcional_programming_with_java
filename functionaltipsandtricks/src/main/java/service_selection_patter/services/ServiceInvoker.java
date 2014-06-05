package service_selection_patter.services;

public interface ServiceInvoker<REQUEST, RESPONSE, BUSSINESS_EXCEPTION extends Exception> {
    RESPONSE execute(REQUEST request) throws BUSSINESS_EXCEPTION;
}
