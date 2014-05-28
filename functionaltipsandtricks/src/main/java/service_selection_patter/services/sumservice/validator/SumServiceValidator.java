package service_selection_patter.services.sumservice.validator;

import service_selection_patter.errorhandling.ValidatorException;
import service_selection_patter.services.RequestValidator;

public class SumServiceValidator implements RequestValidator {
    @Override
    public void validate(String request) throws ValidatorException {
        if(!request.contains("sum"))
            throw new ValidatorException();
    }
}
