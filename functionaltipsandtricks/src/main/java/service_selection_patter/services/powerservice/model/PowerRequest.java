package service_selection_patter.services.powerservice.model;

public class PowerRequest {
    private final int operand;

    public PowerRequest(int operand) {
        this.operand = operand;
    }

    public int operand() {
        return operand;
    }
}
