package pruebas;

public class Apartamento extends Vivienda{
	public Apartamento(String nombre_vivienda, double valor, double tamano, String ubicacion) {
		super(nombre_vivienda,valor,tamano,ubicacion);
    }
	
	public String dameDescripcion() {
		return"El nombre de la vivienda es "+nombre_vivienda+" tiene servicios -->"
				+servicios+" y seguridad "+seguridad;
	}
	
}
