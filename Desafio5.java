package Desafios_Java;
import java.util.Scanner;

/* Proposta: Tem-se um conjunto de dados contendo a altura e o sexo de 10 pessoas. Fazer um programa que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
Dica: PODE ser usado Vetores, mas não de forma obrigatória
a\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */
public class Desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sexo, qtM=0, qtH=0;
        float altura, somaH=0, mediaH=0, maior=0, menor=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Escolha o sexo da pessoa (1-Mulher, 2-Homem:)");
            sexo = sc.nextInt();
            System.out.println("Digite a altura:");
            altura = sc.nextFloat();

            if(sexo == 1){
                qtM++;
            } else if (sexo == 2) {
                qtH++;
                somaH = somaH + altura;
            } else {
                System.out.println("Opção sexo inválida!");
            } 
            if (altura  > maior) {
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }
        }
        mediaH = somaH / qtH;
        System.out.println("A maior altura do grupo é de :" + maior + " m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " + mediaH + " m");
        System.out.println("O numero de mulheres é " + qtM);

        sc.close();
     }
}
