package service_selection_patter.generics;

public interface ResponseMarshaller<RESPONSE> {
    public String marshall(RESPONSE response);
}
