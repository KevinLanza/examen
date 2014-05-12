import java.util.Scanner;


public class ejercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Ingreso nuevo scanner
		
		System.out.print("Ingrese puntaje 1: ");//ingresar nota 1
		int nota1 = s.nextInt();
		
		System.out.print("Ingrese puntaje 2: ");//ingresar nota 2
		int nota2 = s.nextInt();
		
		System.out.print("Ingrese puntaje 3: ");//ingresar nota 3
		int nota3 = s.nextInt();
		
		int promedio = (nota1+nota2+nota3)/3;//calcular el promedio
		
			if (promedio >= 1000)//evaluacion de cada condicion
			System.out.println("Excelente");
			else if (promedio >= 700)
			System.out.println("Bueno");
			else if (promedio >= 500)
			System.out.println("Suficiente");
			else if (promedio < 500)
			System.out.println("Has perdido");
			
		
		
		
	}

}
