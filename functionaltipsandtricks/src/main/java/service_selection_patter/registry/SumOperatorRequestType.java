package service_selection_patter.registry;

import service_selection_patter.model.SumRequest;
import service_selection_patter.model.SumResult;
import service_selection_patter.model.ValidatorException;
import service_selection_patter.generics.*;

import static java.lang.Integer.parseInt;

public class SumOperatorRequestType implements OperatorRequestType {

    @Override
    public RequestMatcher requestMatcher() {
        return new RequestMatcher() {
            @Override
            public boolean match(String request) {
                return request.startsWith("sum");
            }
        };
    }

    @Override
    public RequestValidator validator() {
        return new RequestValidator() {
            @Override
            public void validate(String request) throws ValidatorException {
                if(!request.contains("sum"))
                    throw new ValidatorException();
            }
        };
    }

    @Override
    public RequestUnmarshaller<SumRequest> unmarshaller() {
        return new RequestUnmarshaller<SumRequest>() {
            @Override
            public SumRequest unmarshall(String stringRequest) {
                String[] input = stringRequest.split(" ");
                String operand1 = input[1];
                String operand2 = input[2];
                return new SumRequest(parseInt(operand1), parseInt(operand2));
            }
        };
    }

    @Override
    public ResponseMarshaller<SumResult> marshaller() {
        return new ResponseMarshaller<SumResult>() {
            @Override
            public String marshall(SumResult sumResult) {
                return "sum result " + sumResult.result();
            }
        };
    }

    @Override
    public ServiceInvoker<SumRequest, SumResult> invoker() {
        return new ServiceInvoker<SumRequest, SumResult>() {
            @Override
            public SumResult execute(SumRequest sumRequest) {
                return new SumResult(sumRequest.operand1() + sumRequest.operand2());
            }
        };
    }

}
