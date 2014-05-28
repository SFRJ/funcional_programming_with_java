package service_selection_patter.generics;

public interface RequestUnmarshaller<REQUEST> {
    public REQUEST unmarshall(String stringRequest);
}
