package service_selection_patter.services;

public interface ResponseMarshaller<RESPONSE> {
    public String marshall(RESPONSE response);
}
