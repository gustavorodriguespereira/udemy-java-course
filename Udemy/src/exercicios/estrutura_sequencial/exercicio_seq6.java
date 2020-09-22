package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class exercicio_seq6 {
  public static void main(String[] args) {
    // Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e
    // C. Em seguida, calcule e
    // mostre:
    // a) a área do triângulo retângulo que tem A por base e C por altura.
    // b) a área do círculo de raio C. (pi = 3.14159)
    // c) a área do trapézio que tem A e B por bases e C por altura.
    // d) a área do quadrado que tem lado B.
    // e) a área do retângulo que tem lados A e B.

      Scanner sc = new Scanner(System.in);
      Locale.setDefault(Locale.US);

      float a, b, c;
      float areaT, areaC, areaTrap, areaQ, areaR;

      a = sc.nextFloat();
      b = sc.nextFloat();
      c = sc.nextFloat();

      areaT = (a * c) / 2;
      areaC = (float) (3.14159* pow(c,2));
      areaTrap = (a + b)*c/2;
      areaQ = b * b;
      areaR = a * b;

      System.out.println("Triangulo= " + areaT);
      System.out.println("Circulo= " + areaC);
      System.out.println("Trapezio= " + areaTrap);
      System.out.println("Quadrado= " + areaQ);
      System.out.println("Retangulo= " + areaR);

      sc.close();

  }
}
