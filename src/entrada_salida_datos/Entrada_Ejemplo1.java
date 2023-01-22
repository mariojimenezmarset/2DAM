package entrada_salida_datos;

import java.util.Scanner;

public class Entrada_Ejemplo1 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola "+nombre_usuario+", el ano que viene tendras "+(edad+1)+" anos");
		
		entrada.close();

	}

}
