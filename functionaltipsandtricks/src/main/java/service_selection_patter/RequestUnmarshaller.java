package service_selection_patter;

public interface RequestUnmarshaller<REQUEST> {
    public REQUEST unmarshall(String stringRequest);
}
