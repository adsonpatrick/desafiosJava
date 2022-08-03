package Desafios_Java;
import java.util.Scanner;

/*Desafio 4:
Regra: implementar uma das estruturas de repetição na proposta
Proposta:
Fazer um programa em Java que armazene o nome, a idade e a altura dos usuários e 
no final mostre como saída quantas pessoas acima de 25 anos e maiores de 1.75 participaram da pesquisa.
Entrega: amanhã
Comentar o código!

*/

public class Desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nome;
        int Idade;
        float Altura;
        int cont = 0;

        System.out.println("Quantidade de pessoas cadastradas:");
        int quantPessoas = sc.nextInt();

        for (int i = 1; i <=quantPessoas; i++) {
            System.out.println("Nome:");
            Nome = sc.next();

            System.out.println("Idade:");
            Idade = sc.nextInt();

            System.out.println("Altura:");
            Altura = sc.nextFloat();

            if (Idade > 25 && Altura > 1.75) {
                cont++;
            }
        }
        System.out.println("O total de pessoas acima de 25 anos e acima de 1.75 são: " + cont);
    
        sc.close();
     }
    
}
