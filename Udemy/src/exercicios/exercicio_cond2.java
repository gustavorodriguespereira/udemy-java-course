package exercicios;

import java.util.Scanner;

public class exercicio_cond2 {
    public static void main(String[] args) {
//  Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if(numero%2 ==0){

            System.out.println("O numero " + numero + " é par");
        }else{

            System.out.println("O numero " + numero + " é impar");
        }
    }
}
