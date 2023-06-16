package com.trybe.acc.java;

/** Define Class. */
public class Fatorial {

  /** Define main args. */
  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    String firstOut = "O fatorial de 18 é igual a ";
    int number2Fatorial = 18;
    int beginFatorial = 2;
    long fatorial = 1L;
    
    do {
      fatorial *= beginFatorial;
      beginFatorial += 1;
    } while (beginFatorial <= number2Fatorial);
    String output = stringBuilder
        .append(firstOut)
        .append(fatorial)
        .toString();
    
    System.out.println(output);
  }
}
