import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Ingrese un numero");//El Usuario agrega un numero
		int num = s.nextInt();
		System.out.println("Ingrese una cadena de texto");//El usuario agrega una cadena de texto
		String text = s.next ();
		
		int cont = 0;//Se establece una variable a utilizar en el ciclo
			
		
		while (cont < num)//Se establece el ciclo a evaluar
		{
			System.out.println(text);
			cont++;
		}
	}

}
