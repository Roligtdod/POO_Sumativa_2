package app;

import data.DataManager;
import model.Tour;
import model.Trabajadores;

import java.util.Scanner;


public class Main {
private static Scanner scanner;
private static Trabajadores trabajador1 = new Trabajadores();


    static void main(String[] args) {
        scanner = new Scanner(System.in);

        MostrarMenu();
    }

    private static void MostrarMenu(){
        boolean salir = false;
        while(!salir){
            System.out.println("------------========Menu principal========------------");
            System.out.println("Bienvenido al sistema de catalogo de tours");
            System.out.println("1. Mostrar trabajadores");
            System.out.println("2. Agregar un nuevo trabajador");
            System.out.println("3. Tours a menos de $200.000");
            System.out.println("4. Salir");

            System.out.println("Seleccione que desea realizar: \n");
            int numero = scanner.nextInt();

            switch (numero){
                case 1:
                    Trabajadores TrabajadorC = DataManager.cargarDatos();
                    break;
                case 2:
                    DataManager.AgregarTrabajador();
                    break;
                case 3:
                    DataManager.FiltrarDatos();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Ingrese un numero valido");
            }
        }
    }
}
