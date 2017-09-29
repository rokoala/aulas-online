package aulas.online;

import java.util.Scanner;

public class Aula03 {
	
	public static void main(String[] args) {
		// Integer - Inteiro
		int age = 3;
		int age2 = (int) 3; //typecast
		Integer age3 = new Integer(3); //class - Wrapper Class
		
		// Float - Real
		float myFloat = 213.4f;
		float myFloat2 = (float) 213.4;
		Float myFloat3 = new Float(3);
		
		//Char - Caractere
		char letra = 'G';
		char letra2 = (char) 'G';
		Character letra3 = new Character('G');
		
		//Boolean - Lógico
		boolean myBool = false;
		boolean myBool2 = (boolean) false;
		Boolean myBool3 = new Boolean(false);
		
		System.out.print("My age:"+ 3+"\n"); //sem quebra de linha
		System.out.println("My float:"+ myFloat); // quebra de linha - ln - line
		System.out.printf("My Letra: %c\n",letra); // formatado
		System.out.format("My float %f\n",myFloat);
		
		System.out.println("========================");
		// Entrada de dados
		// necessita importar - import java.util.Scanner;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Digite o seu nome:");
		String nome = keyboard.nextLine();
		System.out.print("Digite um número:");
		float number = keyboard.nextFloat();
		
		System.out.printf("Resultado\n nome:%s \n número: %.1f",nome,number);
	}
	
}
