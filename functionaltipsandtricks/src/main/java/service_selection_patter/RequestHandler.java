package service_selection_patter;

import java.util.List;

import static java.util.Arrays.asList;

public class RequestHandler {

    public <REQUEST, RESPONSE> String handleRequest(String request) {
        for (OperatorRequestType r : requestTypes()) {
            OperatorRequestType<REQUEST, RESPONSE> operatorRequestType = r;

            try {
                if(operatorRequestType.requestMatcher().match(request)) {
                    operatorRequestType.validator().validate(request);
                    RequestUnmarshaller<REQUEST> unmarshaller = operatorRequestType.unmarshaller();
                    REQUEST unmarshalledRequest = unmarshaller.unmarshall(request);
                    ServiceInvoker<REQUEST, RESPONSE> invoker = operatorRequestType.invoker();
                    return operatorRequestType.marshaller().marshall(invoker.execute(unmarshalledRequest));
                }
            } catch (ValidatorException e) {
                return "Can't validate request";
            }
            operatorRequestType.validator();
        }
        return "Service not supported!";
    }

    public <A, B> List<OperatorRequestType<? extends Object, ? extends Object>> requestTypes() {
        return asList(getSumOperatorRequestType(), getPowerOperatorRequestType());
    }

    private OperatorRequestType<SumRequest, SumResult> getSumOperatorRequestType() {
        return new OperatorRequestType<SumRequest, SumResult>() {
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
            public RequestUnmarshaller<SumRequest> unmarshaller() {
                return new RequestUnmarshaller<SumRequest>() {
                    @Override
                    public SumRequest unmarshall(String stringRequest) {
                        String[] input = stringRequest.split(" ");
                        String operand1 = input[1];
                        String operand2 = input[2];
                        return new SumRequest(Integer.parseInt(operand1), Integer.parseInt(operand2));
                    }
                };
            }

            @Override
            public RequestValidator validator() {
                return new RequestValidator() {
                    @Override
                    public void validate(String request) throws ValidatorException {
                        return;
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

        };
    }

    private OperatorRequestType<PowerRequest, PowerResult> getPowerOperatorRequestType() {
        return new OperatorRequestType<PowerRequest, PowerResult>() {
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
                return null;
            }

            @Override
            public RequestValidator validator() {
                return null;
            }

            @Override
            public ResponseMarshaller<PowerResult> marshaller() {
                return null;
            }

            @Override
            public ServiceInvoker<PowerRequest, PowerResult> invoker() {
                return new ServiceInvoker<PowerRequest, PowerResult>() {
                    @Override
                    public PowerResult execute(PowerRequest powerRequest) {
                        return new PowerResult(powerRequest.operand() ^ 2);
                    }
                };
            }
        };
    }

}
