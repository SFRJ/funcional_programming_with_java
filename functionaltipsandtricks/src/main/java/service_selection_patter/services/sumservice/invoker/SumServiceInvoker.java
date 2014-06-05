package service_selection_patter.services.sumservice.invoker;

import service_selection_patter.services.ServiceInvoker;
import service_selection_patter.services.sumservice.bussinessexception.SumServiceBussinessExcetion;
import service_selection_patter.services.sumservice.model.SumRequest;
import service_selection_patter.services.sumservice.model.SumResponse;

public class SumServiceInvoker implements ServiceInvoker<SumRequest,SumResponse,SumServiceBussinessExcetion> {

    @Override
    public SumResponse execute(SumRequest sumRequest) throws SumServiceBussinessExcetion {
        if(sumRequest.operand1() < 1 || sumRequest.operand2() < 2)
            throw new SumServiceBussinessExcetion("This calculator does not allow negative values");
        return new SumResponse(sumRequest.operand1() + sumRequest.operand2());
    }
}
