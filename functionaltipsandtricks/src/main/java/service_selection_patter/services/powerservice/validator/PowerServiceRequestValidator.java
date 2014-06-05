package service_selection_patter.services.powerservice.validator;

import service_selection_patter.services.BussinessException;
import service_selection_patter.services.RequestValidator;

import javax.xml.bind.ValidationException;

public class PowerServiceRequestValidator implements RequestValidator {
    @Override
    public void validate(String request) throws ValidationException {
        if (!request.contains("power")) {
            throw new ValidationException("Not a valid power request");
        }
    }
}
