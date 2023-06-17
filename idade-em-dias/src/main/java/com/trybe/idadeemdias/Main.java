package com.trybe.idadeemdias;

import java.util.Scanner;

/** Define Class main.*/
public class Main {
  /** Define main args. */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Qual o seu nome?");
    String name = scan.next();
    System.out.println("Quantos anos você tem?");
    int anos = scan.nextInt();
    System.out.println("meses?");
    int meses = scan.nextInt();
    System.out.println("e dias?");
    int dias = scan.nextInt();
    
    Pessoa p = new Pessoa();
    int idade = p.calcularIdadeEmDias(anos, meses, dias);
    
    StringBuilder stringBuilder = new StringBuilder();
    
    String output = stringBuilder
        .append("Olá ")
        .append(name)
        .append(", sua idade em dias é ")
        .append(idade)
        .toString();

    scan.close();
    
    System.out.println(output);
  }

}