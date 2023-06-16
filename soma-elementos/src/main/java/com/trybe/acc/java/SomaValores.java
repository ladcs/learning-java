package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/** Define Class. */
public class SomaValores {
  /** Define main args. */

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    int lengthArray = 3;
    int[] arrayToSumNumber = new int [lengthArray]; 

    for (int numberPosicion = 0; numberPosicion < lengthArray; numberPosicion += 1) {
      System.out.println("Digite um número:");
      arrayToSumNumber[numberPosicion] = scan.nextInt();
    }
    scan.close();
    
    int soma = arrayToSumNumber[0] + arrayToSumNumber[2];

    String firstOut = "A soma é: ";
    String outPut = stringBuilder
        .append(firstOut)
        .append(soma)
        .toString();

    System.out.println(outPut);

  }

}