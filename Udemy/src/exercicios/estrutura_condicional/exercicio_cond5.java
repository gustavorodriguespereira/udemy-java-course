package exercicios.estrutura_condicional;

import java.util.Scanner;

public class exercicio_cond5 {
    public static void main(String[] args) {
//  Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//  seguir, calcule e mostre o valor da conta a pagar.

        Scanner sc = new Scanner(System.in);

        float cod1 = (float) 4.00;
        float cod2 = (float) 4.50;
        float cod3 = (float) 5.00;
        float cod4 = (float) 2.00;
        float cod5 = (float) 1.50;

        int pedido = sc.nextInt();
        int quantidade = sc.nextInt();

        if(pedido == 1){

            System.out.println("Total= " + cod1*quantidade);
        }else if(pedido == 2){

            System.out.println("Total= " + cod2*quantidade);
        }else if(pedido == 3){

            System.out.println("Total= " + cod3*quantidade);
        }else if(pedido == 4){

            System.out.println("Total= " + cod4*quantidade);
        }else if(pedido == 5){

            System.out.println("Total= " + cod5*quantidade);
        }
        sc.close();
    }
}
