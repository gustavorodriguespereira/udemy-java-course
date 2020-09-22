package exercicios.estrutura_sequencial;

import java.util.Scanner;

public class exercicio_seq1 {
  public static void main(String[] args) {

    //        Aula de Exercicios - Estrutura Sequencial

    //        Exercicio 1
    //        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma
    //        desses números com uma
    //        mensagem explicativa, conforme exemplos.

      int A, B, soma;

      Scanner sc = new Scanner(System.in);

      A = sc.nextInt();
      B = sc.nextInt();

      soma = A + B;

      System.out.println("Soma = " + soma);
      sc.close();

  }
}
