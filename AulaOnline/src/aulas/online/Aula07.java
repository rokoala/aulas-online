package aulas.online;

import java.util.Scanner;

/**
 * Switch
 * @author rodrigo.koga
 *
 */
public class Aula07 {

	public static void main(String[] args) {
		
		System.out.println("Escreva um numero de 1 a 7: ");
		Scanner keyboard = new Scanner(System.in);
		int valor = keyboard.nextInt();
		switch (valor) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("valor não está entre 1 a 7");
				break;
		}
	}

}
