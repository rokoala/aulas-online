package aulas.online;
/**
 * Operadores Aritméticos/ Math Class
 * 
 * @author rodrigo.koga
 *
 */
public class Aula04 {
	public static void main(String[] args) {
		int n1 = 2;
		int n2 = 4;
		float mean = (n1+n2)/2;
		System.out.println("A média é igual a "+mean);
		
		// importância da prevalência dos operadores
		int n3 = 2;
		int n4 = 4;
		float mean2 = n3+n4/2;
		System.out.println("A média é igual a "+mean2);
		
		// incremento depois
		int number = 1;
		int number2 = 2 + number++;
		System.out.println(number);
		
		
		// incremento antes
		int number3 = 1;
		int number4 = 2 + ++number3;
		System.out.println(number4);
		
		// operadores de atribuição
		int a = 3;
		int b = 3;
		a += b; // a = a + b; 
		System.out.println("a: "+a);
		
		a-=b;  // a = a - b;
		a*=b;  // a = a * b;
		a/=b;  // a = a / b;
		a%=b;  // a = a % b;
		
		System.out.println("==================");
		
		// Math Class
		System.out.println("PI: "+Math.PI);
		
		//pow - exponenciação
		System.out.println(Math.pow(5,2)); // 5^2
		
		//sqrt - raiz quadrada
		System.out.println(Math.sqrt(25));
		
		//cbrt - raiz cúbica
		System.out.println(Math.cbrt(27));
		
		// entre 0 e 1
		System.out.println(Math.random());
		
		// entre 6 e 12
		System.out.println((6 + Math.random()*(12-6)));
	}
}
