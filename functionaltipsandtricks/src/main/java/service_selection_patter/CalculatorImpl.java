package service_selection_patter;

public class CalculatorImpl implements Calculator {
    @Override
    public PowerResult power(PowerRequest request) {
        return new PowerResult(request.operand() * request.operand());
    }

    @Override
    public SumResult sum(SumRequest sumRequest) {
        return new SumResult(sumRequest.operand1() + sumRequest.operand2());
    }
}
