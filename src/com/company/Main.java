package com.company;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String opcion;
		double numero1;
		double numero2;


		System.out.println("=======Calculadora Virtual=====");
		System.out.println("1: Multiplicación");
		System.out.println("2: División");
		System.out.println("3: Suma");
		System.out.println("4: Resta");
		System.out.println("5: Salir");
		System.out.println("\n Eliga la operación que desea realizar: ");
		Scanner scan = new Scanner(System.in);
		opcion = scan.nextLine();

			switch (opcion) {
				case "1":
					System.out.println("Introduzca primer factor: ");
					numero1 = scan.nextDouble();
					System.out.println("Introduzca segundo factor: ");
					numero2 = scan.nextDouble();
					Calculos calculos = new Calculos(numero1, numero2);
					System.out.println("El producto de la multiplicación es:" + calculos.getMultiplicacion());
					break;
				case "2":
					System.out.println("Introduzca Dividendo: ");
					numero1 = scan.nextDouble();
					System.out.println("Introduzca divisor: ");
					numero2 = scan.nextDouble();
					Calculos calculos1 = new Calculos(numero1, numero2);
					System.out.println("El resultado de la división es: " + calculos1.getDivision());
					break;
				case "3":
					System.out.println("Introduzca el primer numero: ");
					numero1 = scan.nextDouble();
					System.out.println("Introduzca segundo numero: ");
					numero2 = scan.nextDouble();
					Calculos calculos2 = new Calculos(numero1, numero2);
					System.out.println("La suma de los numeros introducidos es: " + calculos2.getSuma());
					break;
				case "4":
					System.out.println("Introduzca primer número: ");
					numero1 = scan.nextDouble();
					System.out.println("Introduzca segundo número: ");
					numero2 = scan.nextDouble();
					Calculos calculos3 = new Calculos(numero1, numero2);
					System.out.println("La resta de los numeros introducidos es: " + calculos3.getResta());
					break;
				case "5":
					System.exit(0);
					break;
				default:
					System.out.println("Ha elegido una opción invalida reinicie el programa y introduzca una opción valida");
					break;
			}

	}
}