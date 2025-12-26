package br.com.samueloliveira.bankingsystem.domain.exception;

public class InvalidDepositAmountException extends RuntimeException{
    public InvalidDepositAmountException(String message){
        super(message);
    }
}
