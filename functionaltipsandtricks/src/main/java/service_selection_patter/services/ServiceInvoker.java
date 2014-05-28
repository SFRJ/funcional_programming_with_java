package service_selection_patter.services;

public interface ServiceInvoker<REQUEST, RESPONSE> {
    RESPONSE execute(REQUEST request);
}
