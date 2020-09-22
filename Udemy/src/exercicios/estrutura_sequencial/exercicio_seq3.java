package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_seq3 {
    public static void main(String[] args){
        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e
        // mostre a diferença do produto
        // de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        int a, b, c, d, prod;

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        prod = ((a*b)-(c*d));
        System.out.printf("DIFERENCA= " + prod);
        sc.close();
    }
}
