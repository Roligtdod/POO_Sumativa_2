package data;

import model.Tour;
import model.Trabajadores;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DataManager {
    private static final String FILE_PATH = "Tours.txt";
    private static ArrayList<Trabajadores> trabajadores = new ArrayList<>(); // para guardar los trabajadores despues de que se cree uno nuevo, en caso de que haya que seguir expandiendo el trabajo y se requiera para alguna funcion

    public static void GuardarDatos(Trabajadores trabajador){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))){
            bw.write("\n"+trabajador.getNombre()+";"+trabajador.getApellido()+";"
                    +trabajador.getCargo()+";"+trabajador.getId()+"\n");
            for (Tour tour : trabajador.getTourslist()) {
                bw.write(tour.toString());
            }
            bw.newLine();
            bw.close();

        }catch (IOException e) {
            System.out.println("Error al crear el trabajador");
        }
    }

    public static void GuardarTours(Tour tour){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))){
            bw.append(tour.toString()+"\n");
            bw.close();
        }catch (IOException e) {
            System.out.println("Error al agregar tour");
        }

    }

    public static Trabajadores cargarDatos(){
        Trabajadores trabajador = null;
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))){
            String nombre = br.readLine();
            String[] nombrecompleto = nombre.split(";");
            String linea;
            if(nombrecompleto.length == 4){
                if(nombre != null) {
                trabajador = new Trabajadores(nombrecompleto[0], nombrecompleto[1], nombrecompleto[2], nombrecompleto[3]);
                System.out.println("Lista de trabajadores y los tours que ofrecen: \n"
                        +trabajador.getNombre() + " " + trabajador.getApellido()+ " "+ "\nID del trabajador: " + trabajador.getId() +
                        "\nTours que ofrece: ");// Separa la primera fila para indicar nombre, apellido y cargo del trabajador
                    trabajadores.add(trabajador); // guarda el 1er trabajador para que no se repita
                while((linea = br.readLine()) != null){
                    String[] partes = linea.split(";");
                    nombrecompleto = null; // se borra lo que esta dentro del Array para poder compararlo en cada bucle de while creando un split correspondiente de nuevo
                    nombrecompleto = linea.split(";");
                    if(nombrecompleto.length == 4){
                        trabajador = new Trabajadores(nombrecompleto[0], nombrecompleto[1], nombrecompleto[2], nombrecompleto[3]);
                        trabajadores.add(trabajador); // guarda cada trabajador que se lea en el documento de texto
                        System.out.println("\n"+trabajador.getNombre() + " " + trabajador.getApellido()+ " "+ "\nID del trabajador: " + trabajador.getId() +
                                "\nTours que ofrece: ");
                        continue; // al detectar que se cumple una vez, contionua con la siguiente instrucción
                    }
                    if(partes.length == 3) {
                        Tour tour = new Tour(partes[0], partes[1], Integer.parseInt(partes[2]));
                        trabajador.getTourslist().add(tour); // agrega el tour al trabajador que este en ese momento
                        System.out.println(tour.Textobonito()); // imprime el texto que se lee por consola
                    }
                    }
                }
            }
                br.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return trabajador;
    }

    public static void FiltrarDatos(){
        Trabajadores trabajador = null;
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))){
            String nombre = br.readLine();
            String[] nombrecompleto = nombre.split(";");
            String linea;
            if(nombrecompleto.length == 4){
                trabajador = new Trabajadores(nombrecompleto[0], nombrecompleto[1], nombrecompleto[2], nombrecompleto[3]);
                if(nombre != null) {
                    while((linea = br.readLine()) != null){
                        String[] partes = linea.split(";");
                        if(partes.length == 3) {
                            Tour tour = new Tour(partes[0], partes[1], Integer.parseInt(partes[2]));
                            trabajador.getTourslist().add(tour);
                        }
                    }
                }
            }
            for(Tour tour : trabajador.getTourslist()){
                if(tour.getValor() <= 200000){
                    System.out.println(tour.Textobonito());
                }
            }

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void AgregarTrabajador(){
        Scanner scanner = new Scanner(System.in);
        Trabajadores trabajador = new Trabajadores();
        System.out.println("Ingrese el nombre del trabajador: ");
        trabajador.setNombre(scanner.nextLine());
        System.out.println("Ingrese el apellido del trabajador: ");
        trabajador.setApellido(scanner.nextLine());
        System.out.println("Ingrese el cargo del trabajador: ");
        trabajador.setCargo(scanner.nextLine());
        System.out.println("Ingrese el id del trabajador: ");
        trabajador.setId(scanner.nextLine());
        System.out.println("Ingrese la región del tour: ");
        String region = scanner.nextLine();
        System.out.println("Ingrese el tipo del tour: ");
        String tipo = scanner.nextLine();
        System.out.println("Ingrese el valor del tour: ");
        int valor = scanner.nextInt();
        scanner.nextLine();
        Tour tour = new Tour(region, tipo, valor);
        trabajador.getTourslist().add(tour);
        GuardarDatos(trabajador);
        boolean salir = false;
        System.out.println("Desea agregar otro tour? 1.- Si 2.-No:");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch(opcion) {
            case 1:
                while (!salir) {
                System.out.println("Ingrese la región del tour: ");
                region = scanner.nextLine();
                System.out.println("Ingrese el tipo del tour: ");
                tipo = scanner.nextLine();
                System.out.println("Ingrese el valor del tour: ");
                valor = scanner.nextInt();
                tour = new Tour(region, tipo, valor);
                GuardarTours(tour);
                trabajador.getTourslist().add(tour);
                System.out.println("Desea agregar otro tour? 1.- Si 2.-No:");
                opcion = scanner.nextInt();
                if(opcion == 2) {
                    salir = true;
                }
                scanner.nextLine();
                }
                case 2:
                salir = true;
        }
        trabajadores.add(trabajador);

    }
}
