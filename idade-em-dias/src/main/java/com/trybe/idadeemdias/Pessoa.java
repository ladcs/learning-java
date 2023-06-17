package com.trybe.idadeemdias;

/**Define Class Pessoa. */
public class Pessoa {

  /** Method calcularIdadeEmDias. */
  public int calcularIdadeEmDias(int anos, int meses, int dias) {
    int years2days = anos * 365;
    int months2days = meses * 30;
    return years2days + months2days + dias;
  }
}