package br.dev.joaquim.bank;
public class InsufficientFoundsException extends Exception {
 public InsufficientFoundsException(String mensagem){
    super(mensagem);
 }
}
