package service_selection_patter.services.powerservice.unmarshaller;

import service_selection_patter.services.powerservice.model.PowerRequest;
import service_selection_patter.services.RequestUnmarshaller;

import static java.lang.Integer.parseInt;

public class PowerServiceUnmarshaller implements RequestUnmarshaller<PowerRequest> {
    @Override
    public PowerRequest unmarshall(String stringRequest) {
        return new PowerRequest(parseInt(stringRequest.split(" ")[1]));

    }
}
