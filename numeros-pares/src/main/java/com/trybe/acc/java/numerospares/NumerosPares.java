package com.trybe.acc.java.numerospares;

/** Define Class. */
public class NumerosPares {

  /** Define main args.  */
  public static void main(String[] args) {
    for (int number = 4; number <= 20; number += 2) {
      imprime(number);
    }
  }

  // método enviado pelo programa do exercício
  public static void imprime(int numero) {
    System.out.println(numero);
  }
}
