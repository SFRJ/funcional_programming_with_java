package service_selection_patter.services;

import javax.xml.bind.ValidationException;

public interface RequestValidator {
    public void validate(String request) throws ValidationException;
}
