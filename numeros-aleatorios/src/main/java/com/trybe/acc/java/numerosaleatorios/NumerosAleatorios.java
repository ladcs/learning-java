package com.trybe.acc.java.numerosaleatorios;

import java.util.Random;

public class NumerosAleatorios {
  /**
   * Método principal para a execuçao do código.
   */
  public static void main(String[] args) {
    int number = 0;
    while (number != 4) {
      number = numeroAleatorio();
      imprime(number);
    }
  }

  // Chame a função escrevendo `imprime()`.
  // método enviado pelo programa do exercício
  static void imprime(int numero) {
    System.out.println(numero);
  }

  // Chame a função escrevendo `numeroAleatorio()`.
  // método enviado pelo programa do exercício
  static int numeroAleatorio() {
    return numerosAleatorios.entreUmECinco();
  }

  static NumerosAleatorios numerosAleatorios = new NumerosAleatorios();

  // método enviado pelo programa do exercício
  int entreUmECinco() {
    return new Random().nextInt(5) + 1;
  }
}
