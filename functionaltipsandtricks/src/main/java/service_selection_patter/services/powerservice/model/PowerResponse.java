package service_selection_patter.services.powerservice.model;

public final class PowerResponse {
    private final int result;

    public PowerResponse(int result) {
        this.result = result;
    }

    public int result() {
        return result;
    }
}
