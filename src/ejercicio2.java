import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Ingrese un numero");
		int num = s.nextInt();
		System.out.println("Ingrese una cadena de texto");
		String text = s.next ();
		
		int cont = 0;
			
		
		while (cont < num)
		{
			System.out.println(text);
			cont++;
		}
	}

}
