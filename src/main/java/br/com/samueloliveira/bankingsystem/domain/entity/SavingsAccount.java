package br.com.samueloliveira.bankingsystem.domain.entity;

import br.com.samueloliveira.bankingsystem.domain.exception.InvalidDeductionException;

public class SavingsAccount extends AccountBanking{
    private double deductionPercentage = 1;
    public SavingsAccount(String name, double value, double deductionPercentage){
        super(name, value);

        validationDeduction(value);

        this.deductionPercentage = deductionPercentage;
    }

    public void deposit(double value){
        validationDeposit(value);

        this.balance += value - (deductionPercentage / 100 * value);
    }

    public void setDeductionPercentage(double value){
        validationDeduction(value);

        this.deductionPercentage = value;
    }

    public double getDeductionPercentage(){
        return deductionPercentage;
    }

    public void validationDeduction(double value){
        if(value<=0){
            throw new InvalidDeductionException("O valor da porcentagem de dedução deve ser maior que zero. O valor recebido: "+ value);
        }
    }
}
