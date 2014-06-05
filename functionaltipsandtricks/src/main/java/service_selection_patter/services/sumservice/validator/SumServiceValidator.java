package service_selection_patter.services.sumservice.validator;

import service_selection_patter.services.RequestValidator;

import javax.xml.bind.ValidationException;

public class SumServiceValidator implements RequestValidator {
    @Override
    public void validate(String request) throws ValidationException {
        if(!request.contains("sum"))
            throw new ValidationException("Not a valid sum command");
    }
}
