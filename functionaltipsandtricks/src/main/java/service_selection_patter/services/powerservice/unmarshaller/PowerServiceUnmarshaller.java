package service_selection_patter.services.powerservice.unmarshaller;

import service_selection_patter.services.powerservice.model.PowerRequest;
import service_selection_patter.services.RequestUnmarshaller;

import static java.lang.Integer.parseInt;

public class PowerServiceUnmarshaller implements RequestUnmarshaller<PowerRequest> {
    @Override
    public PowerRequest unmarshall(String stringRequest) {
        String[] input = stringRequest.split(" ");
        String operand1 = input[1];
        return new PowerRequest(parseInt(operand1));

    }
}
