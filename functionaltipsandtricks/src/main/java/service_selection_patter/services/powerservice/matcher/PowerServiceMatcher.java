package service_selection_patter.services.powerservice.matcher;

import service_selection_patter.services.RequestMatcher;

/**
 * Created by ocean on 28/05/14.
 */
public class PowerServiceMatcher implements RequestMatcher {
    @Override
    public boolean matches(String request) {
        return request.startsWith("power");
    }
}
