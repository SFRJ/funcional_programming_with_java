package service_selection_patter.registry;

import service_selection_patter.model.PowerRequest;
import service_selection_patter.model.PowerResult;
import service_selection_patter.model.ValidatorException;
import service_selection_patter.generics.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class PowerOperatorRequestType implements OperatorRequestType {

    @Override
    public RequestMatcher requestMatcher() {
        return new RequestMatcher() {
            @Override
            public boolean match(String request) {
                return request.startsWith("power");
            }
        };
    }

    @Override
    public RequestUnmarshaller<PowerRequest> unmarshaller() {
        return new RequestUnmarshaller<PowerRequest>() {
            @Override
            public PowerRequest unmarshall(String stringRequest) {
                String[] input = stringRequest.split(" ");
                String operand1 = input[1];
                return new PowerRequest(parseInt(operand1));
            }
        };
    }

    @Override
    public RequestValidator validator() {
        return new RequestValidator() {
            @Override
            public void validate(String request) throws ValidatorException {
                if (!request.contains("power")) {
                    throw new ValidatorException();
                }
            }
        };
    }

    @Override
    public ResponseMarshaller<PowerResult> marshaller() {
        return new ResponseMarshaller<PowerResult>() {
            @Override
            public String marshall(PowerResult powerResult) {
                return "power result " + powerResult.result();
            }
        };
    }

    @Override
    public ServiceInvoker<PowerRequest, PowerResult> invoker() {
        return new ServiceInvoker<PowerRequest, PowerResult>() {
            @Override
            public PowerResult execute(PowerRequest powerRequest) {
                return new PowerResult((int) pow(powerRequest.operand(), 2));
            }
        };
    }

}
