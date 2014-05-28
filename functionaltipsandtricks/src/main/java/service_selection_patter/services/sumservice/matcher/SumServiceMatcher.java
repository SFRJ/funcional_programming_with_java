package service_selection_patter.services.sumservice.matcher;

import service_selection_patter.services.RequestMatcher;

public class SumServiceMatcher implements RequestMatcher {
    @Override
    public boolean matches(String request) {
        return request.startsWith("sum");
    }
}
