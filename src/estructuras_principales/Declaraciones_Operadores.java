package estructuras_principales;

public class Declaraciones_Operadores {

	public static void main(String[] args) {
		
		//int a = 5;
		double a=5;
		//int b;
		double b;
		
		b=7;
		
		//int c=b+a;
		//c+=6;
		
		double c=b/a;
		
		System.out.println(c);
		
		final int d=5;
		//fallo por ser constante --> d=8;
		
		System.out.println(d);
		
		final double apulgadas=2.54;
		
		double cm=6;
		
		double resultado=cm/apulgadas;
		
		System.out.println("En "+cm+" cm hay "+resultado+" pulgadas");
		
		int operador1, operador2, result;
		
		operador1=8;
		operador2=7;
		
		result=operador1+operador2;
		
		System.out.println(result);

	}

}
