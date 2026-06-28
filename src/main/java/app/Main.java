package app;

import data.DataManager;
import model.*;

import java.util.Scanner;


public class Main {
private static Scanner scanner;
private static Trabajadores trabajador1 = new Trabajadores();


    static void main(String[] args) {
        scanner = new Scanner(System.in);

        Tour t1 = new Tour("123","RM", "Turistico","10",120000);
        Tour t2 = new Tour("130","Valparaiso", "Turistico","10",90000);


        Excursion ex1 = new Excursion(t1.getId(),t1.getRegion(),t1.getTipo(),t1.getDuracion(),t1.getValor(),"Templo Bahai", "Las torres 2000");
        Excursion ex2 = new Excursion(t2.getId(),t2.getRegion(),t2.getTipo(),t2.getDuracion(),t2.getValor(), "Cerro San Cristobal","El cerro 750");
        RutaGastronomica g1 = new RutaGastronomica(t1.getId(),t1.getRegion(),t1.getTipo(),t1.getDuracion(),t1.getValor(),"5");
        PaseoLacustre p1 = new PaseoLacustre(t1.getId(),t1.getRegion(),t1.getTipo(),t1.getDuracion(),t1.getValor(),"Terrestre");
        RutaGastronomica g2 = new RutaGastronomica(t2.getId(),t2.getRegion(),t2.getTipo(),t2.getDuracion(),t2.getValor(),"3");
        PaseoLacustre p2 = new PaseoLacustre(t2.getId(),t2.getRegion(),t2.getTipo(),t2.getDuracion(),t2.getValor(),"Marino");


        ex1.MostrarDatos();
        g1.MostrarDatos();
        p1.MostrarDatos();
        ex2.MostrarDatos();
        g2.MostrarDatos();
        p2.MostrarDatos();
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
