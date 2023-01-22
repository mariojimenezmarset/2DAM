package entrada_salida_datos;

import javax.swing.JOptionPane;

public class Entrada_Numeros {

	public static void main(String[] args) {
		
		//redondear a 2 decimales
		
		//double x=10000.0;
		
		//System.out.printf("%1.2f",x/3);
		
		//formato numerico y valor numerico
		//2 decimales al resultado de hacer la division
		
		String num1=JOptionPane.showInputDialog("Introduce un numero");
		
		double num2=Double.parseDouble(num1);
		
		System.out.print("La raiz de "+num2+" es ");
		
		System.out.printf("%1.4f",Math.sqrt(num2));

	}

}
