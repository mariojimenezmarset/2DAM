package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		/*Empleado empleado1=new Empleado("Mario",1200,2003,03,17);
		empleado1.subeSueldo(67);
		System.out.println("Nombre: "+empleado1.dameNombre()+"\nSueldo: "+empleado1.dameSueldo()
		+"\nFecha de Alta: "+empleado1.dameFechaContrato());*/
		
		Jefatura jefe_RRHH=new Jefatura("Juan",55000,2006,9,25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados=new Empleado[6];
		misEmpleados[0]=new Empleado("Paco",85000,1990,12,17);
		misEmpleados[1]=new Empleado("Vicenta",95000,1980,22,15);
		misEmpleados[2]=new Empleado("Leonardo",56000,1780,12,19);
		misEmpleados[3]=new Empleado("Roberta");
		
		misEmpleados[4]=jefe_RRHH;	//Polimorfismo en accion. Principio de sustitucion
		misEmpleados[5]=new Jefatura("Maria",95000,1999,5,26);
		
		/*double num1=7.5;
		int num2=(int)num1;*/
		
		//casting para convertir un objeto de un tipo en otro
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		
		jefa_Finanzas.estableceIncentivo(55000);
		
		
		
		for(int i=0;i<6;i++) {
			misEmpleados[i].subeSueldo(5);
			//en los 2 ultimos, se llama a jefatura en vez de empleado, por lo que el sueldo es sumado al incentivo
		}
		
		//for each
		for(Empleado e:misEmpleados) {	//String e: ......
			System.out.println("Nombre: "+e.dameNombre()+"\nSueldo: "+e.dameSueldo()
					+"\nFecha de Alta: "+e.dameFechaContrato());
		}
		
		//for normal
		/*for(int i=0;i<4;i++) {
			System.out.println("Nombre: "+misEmpleados[i].dameNombre()+"\nSueldo: "+misEmpleados[i].dameSueldo()
					+"\nFecha de Alta: "+misEmpleados[i].dameFechaContrato());
		}*/

	}

}

class Empleado{
	
	public Empleado(String nom, double sue, int ano, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(ano, mes-1, dia);
		altaContrato=calendario.getTime();//metodo heredado de Calenda
	}
	
	public Empleado(String nom) {
		this(nom,30000,2000,01,01);
	}
	
	public String dameNombre() {
		return nombre;
	}
	public double dameSueldo(){
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
}

class Jefatura extends Empleado{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom,sue,agno,mes,dia);
	}
	
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	public double dameSueldo() {
		//este metodo esta sobreescribiendo para la clase Jefatura el metodo que hereda de la clase Empleado
		double sueldoJefe=super.dameSueldo();	//con super llama al dameSueldo de la clase padre
		return sueldoJefe+incentivo;
	}
	
	private double incentivo;
}

class Director extends Jefatura{
	
	public Director(String nom, double sue, int agno, int mes, int dia) {
		super(nom,sue,agno,mes,dia);
	}
}









