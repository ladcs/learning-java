package com.trybe.acc.java;

/** Define Class. */

public class Lampada {

  /** Define main. */
  public static void main(String[] args) {
    StringBuilder stringBuild = new StringBuilder();
    Boolean isLigada = true;
    String output = stringBuild
        .append("A lampada ligada: ")
        .append(isLigada)
        .append("!")
        .toString();

    System.out.println(output);
  }
}