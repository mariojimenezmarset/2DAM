package pruebas;

public class Autocaravana extends Vivienda{
	
	boolean ubicacion_fija;
	
	public Autocaravana(double valor, double tamano, String nombre_dueno, 
    		String nombre_vivienda, String ubicacion, boolean servicios, boolean seguridad) {
		super(valor,tamano,nombre_dueno,nombre_vivienda,ubicacion,servicios,seguridad);
	}
	
	public void tiene_Ubicacion_Fija() {
		System.out.println("La Autocaravana tiene ubicacion fija: "+ubicacion_fija);
	}
	
	public String dameDescripcion() {
		return"La autocaravana tiene ubicacion movil "+ubicacion;
	}
}
