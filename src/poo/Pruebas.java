package poo;

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados trabajador1=new Empleados("Benito");
		Empleados trabajador2=new Empleados("Paco");
		Empleados trabajador3=new Empleados("Antonio");
		Empleados trabajador4=new Empleados("Vicenta");
		trabajador1.cambiaSeccion("Recursos Humanos");
		System.out.println(trabajador1.devuelveDatos()+"\n"+trabajador2.devuelveDatos()
		+"\n"+trabajador3.devuelveDatos()+"\n"+trabajador4.devuelveDatos());
		System.out.println(Empleados.dameIdSiguiente());
	}

}

class Empleados{
	
	public Empleados(String nom) {
		nombre=nom;
		seccion="Administracion";
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	public void cambiaSeccion(String seccion) {
		this.seccion=seccion;
	}
	
	public String devuelveDatos() {
		return"El nombre es: "+nombre+" y la seccion es: "+seccion+" y el id es igual a "+Id;
	}
	
	public static String dameIdSiguiente() {	//metodo static, pertenece a la clase
		return"El IdSiguiente es "+IdSiguiente;
	}
	
	private final String nombre;	//pertenece al objeto
	private String seccion;			//pertenece al objeto
	private int Id; //no pertenece al objeto, pertenece a la propia clase
	private static int IdSiguiente=1;
}
