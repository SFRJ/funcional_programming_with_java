package service_selection_patter.services;

public interface RequestUnmarshaller<REQUEST> {
    public REQUEST unmarshall(String stringRequest);
}
