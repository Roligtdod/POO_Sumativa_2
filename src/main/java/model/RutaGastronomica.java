package model;

public class RutaGastronomica extends Tour{
    private String numerosDeParadas;

    public RutaGastronomica(String id, String region, String tipo, String duracion, int valor, String numerosDeParadas){
        super(id, region, tipo, duracion, valor);
        this.numerosDeParadas = numerosDeParadas;
    }

    @Override
    public void MostrarDatos() {
        super.MostrarDatos();
        System.out.println("Numero de paradas: " + numerosDeParadas);
        System.out.println("-------------------------------------------");// no hereda el texto, ya que se repetiria de nuevo y ya lo herede en excursion
    }
}
