package service_selection_patter;

public interface ServiceInvoker<REQUEST, RESPONSE> {
    RESPONSE execute(REQUEST request);
}
