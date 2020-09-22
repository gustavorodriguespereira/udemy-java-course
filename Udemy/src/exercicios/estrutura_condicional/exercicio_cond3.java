package exercicios.estrutura_condicional;

import java.util.Scanner;

public class exercicio_cond3 {
  public static void main(String[] args) {

    // Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao
    // Multiplos" ou "Nao sao
    // Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem
    // poder ser digitados em
    // ordem crescente ou decrescente.

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    sc.nextLine();
    int num2 = sc.nextInt();

    if (num1 % num2 == 0 || num2 % num1 == 0){

        System.out.println("O " + num1 + " e o " + num2 + " são multiplos");
    }else{

        System.out.println("O " + num1 + " e o " + num2 + " não são multiplos");
    }
    sc.close();
  }
}
