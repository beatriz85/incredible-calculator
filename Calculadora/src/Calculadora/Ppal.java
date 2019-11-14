package Calculadora;

import Utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		
		int op = 0, cero = 0;
		double num1 = 0, num2 = 0;
		
		System.out.println("Bienvenido a la calculadora Beartriz&Sosa, eliga que tipo de operacion necesita realizar.\n");

		do {
			System.out.println("Pulse 1 para sumar.\n" + "Pulse 2 para restar\n"
					+ "Pulse 3 para realizar multiplicaciones.\n" + "Pulse 4 para realizar divisiones.\n"
					+ "Para finalizar el programa pulse 0.");
			op = Leer.datoInt();

			switch (op) {
			case 1:
				System.out.println("Ha elegido la opción de sumar.\n" + "Elija su primer número.");
				num1 = Leer.datoDouble();
				System.out.println("Elija su segundo número.");
				num2 = Leer.datoDouble();
				num1 = num1 + num2;
				System.out.printf("El resultado de la suma es %.2f\n", num1);
				break;

			case 2:
				System.out.println("Ha elegido la opción de restar.\n" + "Elija su primer número.");
				num1 = Leer.datoDouble();
				System.out.println("Elija su segundo número.");
				num2 = Leer.datoDouble();
				num1 = num1 - num2;
				System.out.printf("El resultado de la operación es %.2f\n", num1);

				break;

			case 3:
				System.out.println("Ha elegido la opción de multiplicar\n" + "Escriba su primer número.");
				num1 = Leer.datoDouble();
				System.out.println("Eliga su segundo número.");
				num2 = Leer.datoDouble();
				num1 = num1 * num2;
				System.out.printf("El resultado de su multiplicación es %.2f\n", num1);
				break;

			case 4:
				System.out.println("Ha elegido la opción de dividir.\n" + "Escriba el dividendo");
				num1 = Leer.datoDouble();
				System.out.println("Escriba el divisor");
				num2 = Leer.datoDouble();
				if (num2 == 0) {
					System.out.println("Lo siento no puede dividir un numero por " + cero + "\n");
				} else {
					num1 = num1 / num2;
					System.out.printf("El resultado de su división es %.2f\n", num1);
				}
				break;

			case 0:

				System.out.println("\nSaliendo del programa...");
				break;

			default:
				System.out.println("Tecla incorrecta, por favor pruebe de nuevo.");
				break;
			}

		} while (op != 0);

	}

	}

}
