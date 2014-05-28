package service_selection_patter.generics;

import service_selection_patter.model.ValidatorException;

public interface RequestValidator {
    public void validate(String request) throws ValidatorException;
}
