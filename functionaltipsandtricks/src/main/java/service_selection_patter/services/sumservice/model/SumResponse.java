package service_selection_patter.services.sumservice.model;

public class SumResponse {
    private final int result;

    public SumResponse(int result) {
        this.result = result;
    }

    public int result() {
        return result;
    }
}
