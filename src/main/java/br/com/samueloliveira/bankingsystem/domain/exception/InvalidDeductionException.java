package br.com.samueloliveira.bankingsystem.domain.exception;

public class InvalidDeductionException extends RuntimeException{
    public InvalidDeductionException(String message){
        super(message);
    }
}
