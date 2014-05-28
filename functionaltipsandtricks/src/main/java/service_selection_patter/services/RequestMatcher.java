package service_selection_patter.services;

public interface RequestMatcher {
    boolean matches(String request);
}
