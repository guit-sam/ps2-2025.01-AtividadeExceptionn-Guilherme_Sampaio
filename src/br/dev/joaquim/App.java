package br.dev.joaquim;

import br.dev.joaquim.bank.InsufficientFoundsException;

public class App {
  /**
   * Método principal que inicializa a interface do usuário
   * 
   * @param args nenhum argumento é requerido para a execução
   * @throws InsufficientFoundsException 
   */
  public static void main(String[] args) throws InsufficientFoundsException {
    UserInterface main = new UserInterface();
    main.start();
  }
}
