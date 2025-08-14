
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;


       double DOLAR = 0.26;
          double EURO = 0.24;
         double YEN = 38.50;
          double RUBLO = 24.50;

        while (!salir) {
            System.out.println("\n=== CONVERSOR DE MONEDAS ===");
            System.out.println("1. Soles a dólares");
            System.out.println("2. Soles a euros");
            System.out.println("3. Soles a yenes");
            System.out.println("4. Soles a rublos");
            System.out.println("5. Calculadora") ;
            System.out.println("6. Salir");
            System.out.print("Elija una opción (1-6): ");
            String valor = sc.nextLine();
            int opciones = Integer.parseInt(valor);
            if (opciones < 1 || opciones > 6) {
                System.out.println("Error: Ingrese un número del 1 al 6");
                continue;
            }
            if (opciones == 6) {
                salir = true;
                System.out.println("¡Saliendo de la aplicación este es un cambio pra probar el key sssh!");
                continue;
            }

            if (opciones == 5) {

                System.out.println("\n=== CALCULADORA ===");
                System.out.print("Ingrese primer número: ");
                double num1 = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese segundo número: ");
                double num2 = Double.parseDouble(sc.nextLine());
                System.out.print("Operación (+, -, *, /): ");
                String oper = sc.nextLine();

                double resultado = 0;
                switch (oper) {
                    case "+": resultado = num1 + num2; break;
                    case "-": resultado = num1 - num2; break;
                    case "*": resultado = num1 * num2; break;
                    case "/": resultado = num1 / num2; break;
                    default: System.out.println("Operación no válida");
                }
                System.out.printf("Resultado: %.2f %s %.2f = %.2f%n", num1, oper, num2, resultado);
                continue;
            }


            System.out.print("\nIngrese cantidad en Soles: ");
            double soles = Double.parseDouble(sc.nextLine());
            double conversion = 0;
            String moneda = "";

            switch (opciones) {
                case 1: conversion = soles * DOLAR; moneda = "Dólares"; break;
                case 2: conversion = soles * EURO; moneda = "Euros"; break;
                case 3: conversion = soles * YEN; moneda = "Yenes"; break;
                case 4: conversion = soles * RUBLO; moneda = "Rublos"; break;
            }

            System.out.printf("%.2f Soles = %.2f %s%n", soles, conversion, moneda);
        }

        sc.close();







    }
}