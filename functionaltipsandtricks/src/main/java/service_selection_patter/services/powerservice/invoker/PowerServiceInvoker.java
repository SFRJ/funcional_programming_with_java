package service_selection_patter.services.powerservice.invoker;

import service_selection_patter.services.ServiceInvoker;
import service_selection_patter.services.powerservice.model.PowerRequest;
import service_selection_patter.services.powerservice.model.PowerResponse;

import static java.lang.Math.pow;

public class PowerServiceInvoker implements ServiceInvoker<PowerRequest,PowerResponse> {
    @Override
    public PowerResponse execute(PowerRequest powerRequest) {
        return new PowerResponse((int) pow(powerRequest.operand(), 2));
    }
}
