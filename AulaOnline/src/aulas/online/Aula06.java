package aulas.online;

import java.util.Scanner;

/**
 * Estruturas Condicionais
 * 
 * Verificar se a média da nota é maior que um valor
 * 
 * - realizar exercício para verificar se o valor é par ou impar
 * 
 * @author rodrigo.koga
 *
 */
public class Aula06 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Primeira nota: ");
		float n1 = keyboard.nextFloat();
		System.out.print("Segunda nota: ");
		float n2 = keyboard.nextFloat();
		
		float mean = (n1+n2)/2;
		System.out.println("Sua média foi :"+mean);
		if(mean > 5) {
			System.out.println("Parabéns você passou!");
		}else {
			System.out.println("Estude mais um pouco!");
		}
	}
}
