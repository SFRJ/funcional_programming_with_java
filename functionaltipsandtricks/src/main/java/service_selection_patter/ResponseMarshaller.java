package service_selection_patter;

public interface ResponseMarshaller<RESPONSE> {
    public String marshall(RESPONSE response);
}
