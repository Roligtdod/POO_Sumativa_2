package model;

public class Excursion extends Tour{
    private String lugar;
    private String calle;


    public Excursion(String id, String region, String tipo, String duracion, int valor, String lugar, String calle){
        super(id, region, tipo, duracion, valor);
        this.lugar = lugar;
        this.calle = calle;

    }

    @Override
    public void MostrarDatos() {
        super.MostrarDatos();
        System.out.println("Lugar: " + lugar);
        System.out.println("Calle: " + calle);
    }
}
