package Desafios_Java;
/**  Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em:
 *  Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
 * seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
Valor de C = 2.43
tempo médio: 15 minutos */

public class Desafio1{
    public static void main(String args[]){
        double K, Re, Ra, F, C;
        C = 2.43;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;
        F = C * 1.8 + 32;

        System.out.println("Sua temperatura em graus celsius é:" + C + "\nConvertendo em Kelvin fica:" + K + "\nConvertendo em Réaumur fica:" + Re + "\nConvertendo em Rankine fica:" + Ra + "\nConvertendo em Fahrenheit fica:" + F);
        
    }
}
