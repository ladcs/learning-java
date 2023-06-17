package com.trybe.acc.java;

import java.util.Scanner;

/** Define Class Main. */
public class Main {
  /** Define Method main. */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    String name = nameInTerminal(scan);
    double[] numbers = new double[4];
    numbers = numbersInTerminal(scan);
    scan.close();    
    
    Nota nota = new Nota();
    
    double avg = nota.calcularMedia(numbers[0], numbers[1], numbers[2], numbers[3]);
    
    String output = outputString(name, avg);
    
    System.out.println(output);
  }
  
  /** Define Method nameInTerminal. */
  public static String nameInTerminal(Scanner scan) {
    System.out.println("digite o seu nome");
    String name = scan.next();
    return name;
  }
  
  /** Define Method numbersInTerminal. */ 
  public static double[] numbersInTerminal(Scanner scan) {
    double[] numbers = new double[4];
    for (int index = 0; index < 4; index += 1) {
      System.out.println("prova " + (index + 1));
      numbers[index] = scan.nextDouble();
    }
    return numbers;
  }
  
  /** Define method outputString. */
  public static String outputString(String name, Double avg) {
    StringBuilder stringBuilder = new StringBuilder();
    String output = stringBuilder
        .append("Olá, ")
        .append(name)
        .append(", sua média é ")
        .append(avg)
        .toString();
    return output;
  }

}