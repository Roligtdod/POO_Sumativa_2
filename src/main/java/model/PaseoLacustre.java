package model;

public class PaseoLacustre extends Tour{
    private String tipoEmbarcacion;

    public PaseoLacustre(String id, String region, String tipo, String duracion, int valor, String tipoEmbarcacion){
        super(id, region, tipo, duracion, valor);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void MostrarDatos() {
        System.out.println("Tipo de vehiculo: " + tipoEmbarcacion+"\n"); // no hereda el texto, ya que se repetiria de nuevo y ya lo herede en excursion
    }
}
