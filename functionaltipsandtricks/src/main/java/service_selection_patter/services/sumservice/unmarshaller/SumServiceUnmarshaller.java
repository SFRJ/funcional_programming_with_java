package service_selection_patter.services.sumservice.unmarshaller;

import service_selection_patter.services.sumservice.model.SumRequest;
import service_selection_patter.services.RequestUnmarshaller;

import static java.lang.Integer.parseInt;

public class SumServiceUnmarshaller implements RequestUnmarshaller<SumRequest> {
    @Override
    public SumRequest unmarshall(String stringRequest) {
        String[] input = stringRequest.split(" ");
        String operand1 = input[1];
        String operand2 = input[2];
        return new SumRequest(parseInt(operand1), parseInt(operand2));
    }
}
