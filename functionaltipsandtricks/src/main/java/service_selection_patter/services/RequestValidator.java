package service_selection_patter.services;

import service_selection_patter.errorhandling.ValidatorException;

public interface RequestValidator {
    public void validate(String request) throws ValidatorException;
}
