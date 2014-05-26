package service_selection_patter;

public class PowerRequest {
    private final int operand;

    public PowerRequest(int operand) {
        this.operand = operand;
    }

    public int operand() {
        return operand;
    }
}
