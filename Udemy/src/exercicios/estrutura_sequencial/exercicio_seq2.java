package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class exercicio_seq2 {
  public static void main(String[] args) {

    // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da
    // área deste círculo com quatro
    // casas decimais conforme exemplos.
    // Fórmula da área: area = π . raio2
    // Considere o valor de π = 3.14159

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      double raio = 0, area;

      raio = sc.nextDouble();
      area = 3.14159* pow(raio, 2);

      System.out.printf("area=%.4f%n",area);
        sc.close();
  }
}
