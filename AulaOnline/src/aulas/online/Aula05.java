package aulas.online;

public class Aula05 {
	public static void main(String[] args) {
		String n1 = "Rodrigo";
		String n2 = "Rodrigo";
		String n3 = new String("Rodrigo");
		
		String result = (n1 == n2) ? "igual" : "diferente";
		System.out.println("Resultado 1: "+result);
		
		String result2 = (n1 == n3) ? "igual" : "diferente";
		System.out.println("Resultado 2: "+result2);
		
		// equals
		String result3 = (n1.equals(n3)) ? "igual" : "diferente";
		System.out.println("Resultado 3: "+result3);
		
		// Operadores lógicos
		// && - e
		// || - ou
		// ^ - xou
		// ! - false
	}
}
