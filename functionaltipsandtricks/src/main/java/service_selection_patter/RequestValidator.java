package service_selection_patter;

public interface RequestValidator {
    public void validate(String request) throws ValidatorException;
}
