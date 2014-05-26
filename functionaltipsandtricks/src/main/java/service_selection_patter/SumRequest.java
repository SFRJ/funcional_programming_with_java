package service_selection_patter;

public class SumRequest {
    private final int operand1;
    private final int operand2;

    public SumRequest(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public int operand1() {
        return operand1;
    }

    public int operand2() {
        return operand2;
    }
}
