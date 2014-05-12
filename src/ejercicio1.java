import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Se agrego un scanner
		
		System.out.println("The Lord of The Ring");//Ingrese nombre de la pelicula
		
		System.out.println("Ingrese una calificacion (1,2,3,4,5)");//Indico al usuario a introducir calificacion
		int calificacion = s.nextInt();
		
		switch (calificacion)//Con este ciclo se evalua la calificacion ingresada del usuario
		{
		
		case 1:
			System.out.println("Pesima");
			break;
		case 2:
			System.out.println("Mala");
			break;
		case 3:
			System.out.println("Regular");
			break;
		case 4:
			System.out.println("Buena");
			break;
		case 5:
			System.out.println("Excelente");
		
		}
		
	}

}
