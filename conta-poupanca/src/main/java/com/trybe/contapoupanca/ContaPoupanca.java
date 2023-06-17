package com.trybe.contapoupanca;

/** Define ContaPoupanca Class. */
public class ContaPoupanca {
  private double saldo;
  private String titularConta;
 
  /** Define constructor. */
  ContaPoupanca(String titularConta, double saldo) {
    this.saldo = saldo;
    this.titularConta = titularConta;
  }
  
  /** Define Method depositar. */
  public void depositar(double deposit) {
    this.saldo += deposit;
  }
  
  /** Define Method sacar. */
  public void sacar(double draw) {
    this.saldo -= draw;
  }
  
  /** Define Method mostrarSaldo. */
  public double mostrarSaldo() {
    return this.saldo;
  }
  
  /** Define Method mostrarTitularConta. */
  public String mostrarTitularConta() {
    return this.titularConta;
  }
}