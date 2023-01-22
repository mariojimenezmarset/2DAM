package tiposenumerados;
import java.util.Scanner;

public class UsoTallas {
	//enum Talla{PEQUENA,MEDIANA,GRANDE,MUYGRANDE};
	enum Talla{
		PEQUENA("S"),MEDIANA("M"),GRANDE("L"),MUYGRANDE("XL");
		private Talla(String abreviatura) {
			this.abreviatura=abreviatura;
		}
		public String getAbreviatura() {
			return abreviatura;
		}
		public void setAbreviatura(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		private String abreviatura;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Talla s=Talla.PEQUENA;
		Talla m=Talla.MEDIANA;
		Talla l=Talla.GRANDE;
		Talla xl=Talla.MUYGRANDE;*/
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escribe una talla: PEQUENA, MEDIANA, GRANDE, MUYGRANDE");
		String respuesta=entrada.next().toUpperCase();
		Talla laTalla=Enum.valueOf(Talla.class, respuesta);
		System.out.println("Talla= "+laTalla);
		System.out.println("Abreviatura= "+laTalla.getAbreviatura());
		entrada.close();
	}
}
