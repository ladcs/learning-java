package com.trybe.acc.java;

/** define Class Nota. */
public class Nota {
  /** define method calcularMedia. */
  public double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    double sum = nota1 + nota2 + nota3 + nota4;
    double avg = sum / 4;
    return avg;
  }
}