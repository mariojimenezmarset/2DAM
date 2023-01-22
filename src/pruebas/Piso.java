package pruebas;

class Piso extends Vivienda implements Interfaz_Piso{
	
	public Piso(double valor, double tamano, String nombre_dueno, 
    		String nombre_vivienda, String ubicacion, boolean servicios, boolean seguridad) {
		super(valor,tamano,nombre_dueno,nombre_vivienda,ubicacion,servicios,seguridad);
	}
	
	
	public String dameDescripcion() {
		return"El piso tiene un tamano de "+tamano+" cuyo dueno es "
				+ nombre_dueno+" cuya ubicacion es "+ubicacion;
	}
	
	public void metodoabstracto() {
		System.out.println("El precio final es "+precio_final);
	}
	
	static int num_columnas=9;
	
	public static void metodoestatico() {
		System.out.println("El numero de columnas en el piso es de "+num_columnas);
	}
	
}
