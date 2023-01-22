package bucles;

import javax.swing.*;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		
		String clave="Mario";
		
		String pass="";
		
		while(clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Introduce la contrasena, por favor");
			
			if(clave.equals(pass)==false) {
				System.out.println("Contrasena incorrecta");
			}
		}
		
		System.out.println("Contrasena correcta, acceso permitido");

	}

}
