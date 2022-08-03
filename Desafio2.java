package Desafios_Java;
import java.util.Scanner;

/**Faça um programa em Java para ler um número que é um código de usuário. 
 * Caso este código seja diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser 
 * apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. 
 * Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta, 
 * deve ser mostrada a mensagem ‘Acesso permitido’
 */

public class Desafio2 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        Integer Código, Senha;
       

        System.out.println("Digite o Código do Usuário:");
        Código = teclado.nextInt();

        if (Código == 1234){
            System.out.println("Digite a Senha:");
            Senha = teclado.nextInt();
            if (Senha == 9999){
            System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Incorreta");
            }    

        } else {
            System.out.println("Usuário Inváldo");
        }  
    teclado.close();            
    }
}
