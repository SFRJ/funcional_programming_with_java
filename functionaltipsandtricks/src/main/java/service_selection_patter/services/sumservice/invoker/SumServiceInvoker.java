package service_selection_patter.services.sumservice.invoker;

import service_selection_patter.services.ServiceInvoker;
import service_selection_patter.services.sumservice.model.SumRequest;
import service_selection_patter.services.sumservice.model.SumResponse;

public class SumServiceInvoker implements ServiceInvoker<SumRequest,SumResponse> {

    @Override
    public SumResponse execute(SumRequest sumRequest) {
        return new SumResponse(sumRequest.operand1() + sumRequest.operand2());
    }
}
