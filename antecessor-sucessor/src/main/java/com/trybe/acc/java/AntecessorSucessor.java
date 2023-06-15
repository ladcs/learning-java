package com.trybe.acc.java;

import java.util.Scanner;

/** 
 * Class main.
 * */
public class AntecessorSucessor {

  /** 
   * Metódo main.
   * */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número:");
    int numero = scan.nextInt();
    scan.close();
    int antecessor = numero - 1;
    int sucessor = numero + 1;

    System.out.println("O número " 
        + numero 
        + " tem "
        + antecessor 
        + " como seu antecessor e " 
        + sucessor 
        + " como seu sucessor.");
  }
}
