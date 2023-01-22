package entrada_salida_datos;

import javax.swing.JOptionPane;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		
		//el método es static
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("Hola "+nombre_usuario+" , el ano que viene tendras "+edad_usuario+" anos");

	}

}
