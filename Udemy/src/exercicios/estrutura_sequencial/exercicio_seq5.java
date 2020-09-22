package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_seq5 {
  public static void main(String[] args) {

    // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor
    // unitário de cada peça 1, o
    // código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre
    // o valor a ser pago.

      Scanner sc = new Scanner(System.in);
      Locale.setDefault(Locale.US);

      int peca1, codigo1, peca2, codigo2;
      double valor1, valor2, pagar;

      peca1 = sc.nextInt();
      codigo1 = sc.nextInt();
      valor1 = sc.nextDouble();

      peca2 = sc.nextInt();
      codigo2 = sc.nextInt();
      valor2 = sc.nextDouble();

      pagar = peca1*valor1 + peca2*valor2;

      System.out.printf("Valor a pagar= R$ %.2f%n", pagar);
      sc.close();
  }
}
