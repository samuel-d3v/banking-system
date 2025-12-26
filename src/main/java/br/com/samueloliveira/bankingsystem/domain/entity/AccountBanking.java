package br.com.samueloliveira.bankingsystem.domain.entity;

import br.com.samueloliveira.bankingsystem.domain.exception.InvalidDepositAmountException;

public abstract class AccountBanking implements Account {
    private final String name;
    protected double balance;

    public AccountBanking(String name, double value) {
        validationDeposit(value);

        this.name = name;
        this.balance = value;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void deposit(double value) {
        validationDeposit(value);

        this.balance = value;
    }

    public String toString(){
        return "A conta de: " + name + "tem um saldo de: " + balance;
    }

    public void validationDeposit(double value){
        if(value<=0){
            throw new InvalidDepositAmountException("O valor de deposito deve ser maior que zero. Valor recebido: "+ value);
        }
    }
}
