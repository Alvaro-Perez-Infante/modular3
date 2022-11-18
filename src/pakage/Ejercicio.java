package pakage;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int codigo;
		double calculo;
		double r = 0;
		double h = 0;

		codigo = Util.leerInt("¿Qué calculamos: ? (1)Volumen, (2)Area");
		r = Util.leerdouble("Introduzca el radio del cilindro: ");
		h = Util.leerdouble("Introduzca la altura del cilindro: ");

		calculo = calculoCilindro(codigo, r, h);
		Util.escribir("El resutlado es: " + calculo);

	}

	public static double calculoCilindro(int codigo, double r, double h) {

		double calculo = 0.0;

		if (codigo == 1) {

			calculo = (Math.PI * (r * r) * h);

		}

		if (codigo == 2) {

			calculo = (2 * Math.PI * r * (h + r));

		}

		return calculo;

	}

}
