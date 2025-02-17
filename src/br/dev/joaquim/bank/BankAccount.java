package br.dev.joaquim.bank;

public class BankAccount {
  private int accountNumber;
  private double balance;
  private String accountHolderName;

  public BankAccount() {
  }
 /**
     * explica o construtor
     * @param accountNumber Numéro gerado randomicamente para identificação do cliente 
     * @param balance Valor armazenado na conta bancária
     * @throws InsufficientFoundsException gera caso a tentativa de saque for maior que o dinheiro depositado
     */
  public BankAccount(int accountNumber, double balance, String accountHolderName)  {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.accountHolderName = accountHolderName;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void deposit(double value) {

    if (value < 0) {
  
      throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
    }

    this.balance += value;
  }

  public void withdraw(double value) {

    if (value < 0) {
      throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
    }

    if (value > this.balance) {
   
      // Não deveria ser assim, não pode ter print a classe
      System.out.println("O valor R$ " + value + " é superior ao saldo [R$ " + balance + "]");
    }

    this.balance -= value;
  }

  @Override
  public String toString() {
    return "Conta " + accountNumber + " de " + accountHolderName + " têm R$ " + balance + " de saldo";
  }
}
