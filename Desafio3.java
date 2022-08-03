package Desafios_Java;

// Scanner não havi sido importado
import java.util.Scanner;

/* Programa para ordenar quem é o menor e o maior número dentre os 3 números inseridos. */

public class Desafio3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            // Declarar valores com números inteiros (Int)
        int n1, n2, n3;

            // Entrada dos números
        System.out.println("Entre com o primeiro inteiro: ");
        n1 = sc.nextInt();
        System.out.println("Entre com o segundo inteiro: ");
        n2 = sc.nextInt();
        System.out.println("Entre com o terceiro inteiro: ");
        n3 = sc.nextInt();

            // Comparação do n1 com o n3
        if (n1 > n2) { 
            if (n1 > n3) {
                if (n2 < n3) {
                    System.out.println("O menor numero eh: " + n2);
                } else {
                    System.out.println("O menor numero eh: " + n3);
                }
                System.out.println("O maior numero eh: " + n1);
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O maior numero eh: " + n3);
            }
        } else {
            if (n2 > n3) {
                if (n1 < n3) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n3);
                }
                System.out.println("O maior numero eh: " + n2);
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O maior numero eh: " + n3);
            }
        }
        // Inclusão do fechamento do Scanner.   
    sc.close();
    } // Adição da chave do main.
}
