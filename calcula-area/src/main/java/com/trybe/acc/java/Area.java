package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * Class main. 
 * */
public class Area {
  /**
   * Método main.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite a medida do lado do quadrado:");
    double lado = scan.nextDouble();
    double area = lado * lado;
    scan.close();
    System.out.println("A area do quadrado de lado " + lado + " é igual a " + area);
  }
}