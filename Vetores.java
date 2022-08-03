/* Proposta: Tem-se um conjunto de dados contendo a altura e o sexo de 10 pessoas. Fazer um programa que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
Dica: PODE ser usado Vetores, mas não de forma obrigatória */

package Desafios_Java;

public class Vetores {
    public static void main(String[] args){
        double maior = 1;
        double menor = 2;
        String sexo;

        double [] altura = new double [10];
        altura [0] = 1.90; altura [1] = 1.75; altura [2] = 1.60; altura [3] = 1.50; altura [4] = 1.57; altura [5] = 1.69; altura [6] = 1.84; altura [7] = 1.98; altura [8] = 1.63; altura [9] = 1.54;

        for (int i=0; i <10; i++){
            if (altura[i] > maior){
                maior = altura[i];
            }
        }
        for (int i=0; i <10; i++){
            if (altura[i] < menor){
                menor = altura[i];
            }
        }
        System.out.println( "Maior altura do grupo: " + maior);
        System.out.println( "Menor altura do grupo: " + menor);
        

        
    }
}
