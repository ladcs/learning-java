package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/** Define Class. */
public class Relatorio {
  private int child;
  private int adult;
  private int old;
  
  Relatorio() {
    this.child = 0;
    this.adult = 0;
    this.old = 0;
  }
  
  /** Define Method  howMany. */
  public void howMany(short age) {
    if (age < 18) {
      this.child += 1;
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
    } else if (age < 50) {
      this.adult += 1;
      System.out.println("Pessoa adulta, catraca liberada!");
    } else {
      this.old += 1;
      System.out.println("Pessoa adulta a partir de 50 anos, catraca liberada!");
    }
  }
  
  /** Define Method printHowMany. */
  public void printHowMany() {
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    System.out.println("----- Quantidade -----");
    String childOut = stringBuilder
        .append("menores: ")
        .append(this.child)
        .toString();
    System.out.println(childOut);
    String adultOut = stringBuilder1
            .append("adultas: ")
            .append(this.adult)
            .toString();
    System.out.println(adultOut);
    String oldOut = stringBuilder2
            .append("a partir de 50: ")
            .append(this.old)
            .append("\n")
            .toString();
    System.out.println(oldOut);
  }
  
  /** Define Method howManyPorcent. */
  private String[] howManyPorcent(ArrayList<Short> ages) {
    int total = ages.size();
    Locale locale = new Locale("en", "US");
    DecimalFormat formatoDecimal = (DecimalFormat) NumberFormat.getNumberInstance(locale);
    formatoDecimal.applyPattern("##0.0#");
    String[] agesPorcent = new String[3];
    if (total == 0) {
      agesPorcent[0] = formatoDecimal.format(0L);
      agesPorcent[1] = formatoDecimal.format(0L);
      agesPorcent[2] = formatoDecimal.format(0L);
    } else {
      float childPorcent = (this.child * 100f) / total;
      float adultPorcent = (this.adult * 100f) / total;
      float oldPorcent = (this.old * 100f) / total;
      agesPorcent[0] = formatoDecimal.format(childPorcent);
      agesPorcent[1] = formatoDecimal.format(adultPorcent);
      agesPorcent[2] = formatoDecimal.format(oldPorcent);
    }
    return agesPorcent;
  }
  
  /** Define Method printHowManyPorcent. */
  public void printHowManyPorcent(ArrayList<Short> ages) {
    String[] toPrint = this.howManyPorcent(ages);
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    StringBuilder stringBuilder3 = new StringBuilder();
    System.out.println("----- Percentual -----");
    String childOut = stringBuilder1
        .append("menores: ")
        .append(toPrint[0])
        .append("%")
        .toString();
    System.out.println(childOut);
    String adultOut = stringBuilder2
        .append("adultas: ")
        .append(toPrint[1])
        .append("%")
        .toString();
    System.out.println(adultOut);
    String oldOut = stringBuilder3
        .append("a partir de 50 anos: ")
        .append(toPrint[2])
        .append("%")
        .append("\n")
        .toString();
    System.out.println(oldOut);
    int total = ages.size();
    String totalOut = stringBuilder
            .append("Total: ")
            .append(total)
            .toString();
    System.out.print(totalOut);
  }
}