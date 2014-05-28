package service_selection_patter.services.powerservice.validator;

import service_selection_patter.errorhandling.ValidatorException;
import service_selection_patter.services.RequestValidator;

public class PowerServiceRequestValidator implements RequestValidator {
    @Override
    public void validate(String request) throws ValidatorException {
        if (!request.contains("power")) {
            throw new ValidatorException();
        }
    }
}
