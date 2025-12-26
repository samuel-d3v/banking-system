package br.com.samueloliveira.bankingsystem.domain.entity;

public interface Account {
    double checkBalance();
    void deposit(double value);
}
