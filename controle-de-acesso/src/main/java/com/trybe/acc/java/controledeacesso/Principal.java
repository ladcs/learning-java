package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Scanner;

/** Define class principal. */
public class Principal {

  /** Define main args. */
  public static void main(String[] args) {
    Principal principal = new Principal();
    ArrayList<Short> ages = new ArrayList<Short>();
    short option = 1;
    short age = 0;
    Scanner scan = new Scanner(System.in);
    Relatorio p = new Relatorio();
    while (option == 1) {
      principal.viewMenu();
      option = principal.optionInMenu(scan);
      if (option == 1) {
        age = principal.questAge(scan);
        ages.add(age);
        p.howMany(age);
      }
    }
    scan.close();
    p.printHowMany();
    p.printHowManyPorcent(ages);
  }
  
  /** Method viewMenu. */
  public void viewMenu() {
    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Acessar o estabelecimento");
    System.out.println("2 - Finalizar sistema e mostrar relatório");
  }
  
  /** Method optionInMenu. */
  public short optionInMenu(Scanner scan) {
    String optionString = scan.next();
    short option = Short.valueOf(optionString); 
    if (option == 1 || option == 2) {
      return option;
    }
    System.out.println("Entre com uma opção válida");
    return this.optionInMenu(scan);
  }
  
  /** Method questAge. */
  public short questAge(Scanner scan) {
    System.out.println("Entre com a sua idade:");
    String ageString = scan.next();
    short age = Short.valueOf(ageString);
    if (age >= 0) {
      return age;
    }
    System.out.println("idade inválida, tente novamente");
    return this.questAge(scan);
  }
}