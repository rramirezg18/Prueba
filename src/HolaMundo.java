
import java.util.*;
public class HolaMundo {
	
	public static void main (String[] args) {
		System.out.println("Hola mundo");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		int num1 = entrada.nextInt();
		
		
		System.out.println("Ingrese otro numero");
		int num2 = entrada.nextInt();
		
		int suma = num1 + num2;
		
		System.out.println("La suma es: " + suma);
		
	}

}
