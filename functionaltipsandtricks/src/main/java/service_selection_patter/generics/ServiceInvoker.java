package service_selection_patter.generics;

public interface ServiceInvoker<REQUEST, RESPONSE> {
    RESPONSE execute(REQUEST request);
}
