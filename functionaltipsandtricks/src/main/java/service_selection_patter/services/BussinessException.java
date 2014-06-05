package service_selection_patter.services;
/*
    Use checked exceptions to represent predictable business exceptional cases.
*/
public class BussinessException extends Exception {

    public BussinessException(String message) {
        super(message);
    }
}
