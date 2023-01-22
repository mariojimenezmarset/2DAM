package poo;

//import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		//codigo de Uso_Coche
		/*
		Coche Renault=new Coche();	//Instanciar una clase, ejemplar de clase
		//Renault.ruedas=3;	//no se puede hacer por el encapsulamiento de la variable
		//System.out.println("Este coche tiene "+Renault.ruedas+" ruedas");
		
		Renault.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(Renault.dime_datos_generales());
		System.out.println(Renault.dime_color());
		
		Renault.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		System.out.println(Renault.dime_asientos());
		
		Renault.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
		System.out.println(Renault.dime_climatizador());
		
		System.out.println(Renault.dime_peso_coche());
		System.out.println("El precio final del coche es "+Renault.precio_coche());
		*/
		
		//codigo de Uso_Vehiculo
		//el diseno de la herencia no es bueno, pero si util para la explicacion de la herencia
		
		Coche micoche1=new Coche();
		micoche1.establece_color("Negro");
		Furgoneta mifurgo1=new Furgoneta(7,580);
		mifurgo1.establece_color("Blanco");
		mifurgo1.configura_asientos("Si");
		mifurgo1.configura_climatizador("Si");
		System.out.println(micoche1.dime_datos_generales()+". "+micoche1.dime_color());
		System.out.println(mifurgo1.dime_datos_generales()+". "+mifurgo1.dimeDatosFurgoneta());
		
	}

}
