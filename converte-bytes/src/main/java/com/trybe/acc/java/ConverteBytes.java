package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;
/**
 * Define Class.
 */

public class ConverteBytes {
  /**
   * Define main.
   */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite um número:");
    byte valor = scan.nextByte();
    scan.close();
    int qtdBits = 8 * valor;
    System.out.println(valor + " bytes correspondem a " + qtdBits + " bits");

  }
}