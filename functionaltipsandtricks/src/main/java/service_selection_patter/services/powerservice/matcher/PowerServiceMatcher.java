package service_selection_patter.services.powerservice.matcher;

import service_selection_patter.services.RequestMatcher;

public class PowerServiceMatcher implements RequestMatcher {
    @Override
    public boolean matches(String request) {
        return request.startsWith("power");
    }
}
