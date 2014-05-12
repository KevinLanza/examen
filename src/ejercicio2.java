import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Ingrese un numero");
		int num1 = s.nextInt();
		System.out.println("Ingrese una cadena de texto");
		String texto = s.next();
		int t = 0;
		
		while (t < num1)
			{
			System.out.println(t + num1);
			t++;
			}

	}

}
