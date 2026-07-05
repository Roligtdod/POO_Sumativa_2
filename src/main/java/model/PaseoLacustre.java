package model;

public class PaseoLacustre extends Tour{
    private String tipoEmbarcacion;

    public PaseoLacustre(String id, String region, String tipo, String duracion, int valor, String tipoEmbarcacion){
        super(id, region, tipo, duracion, valor);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void MostrarDatos() {
        super.MostrarDatos();
        System.out.println("Tipo de vehiculo: " + tipoEmbarcacion);
        System.out.println("-------------------------------------------");
    }
}
