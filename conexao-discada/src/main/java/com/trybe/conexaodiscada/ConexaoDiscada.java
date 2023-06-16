package com.trybe.conexaodiscada;

import java.util.Random;

/** Define Class. */
public class ConexaoDiscada {

  /** Define main args.  */
  public static void main(String[] args) {
    boolean isConection = false;
    int numberTest = 0;
    do {
      isConection = conectou();
      if (isConection) {
        return;
      }
      numberTest += 1;
    } while (numberTest < 3);
  }

  // método enviado pelo programa do exercício
  static boolean conectou() {
    return conexaoDiscada.verdadeiroOuFalso();
  }

  static ConexaoDiscada conexaoDiscada = new ConexaoDiscada();

  // método enviado pelo programa do exercício
  boolean verdadeiroOuFalso() {
    return new Random().nextInt(2) == 1;
  }

}