package model;
// Objeto que representa un tour, con sus atributos región, tipo y valor
public class Tour {
    private String id;
    private String region;
    private String tipo;
    private String duracion;
    private int valor;

    public Tour(String id, String region, String tipo, String duracion, int valor){
        this.id = id;
        this.region = region;
        this.tipo = tipo;
        this.duracion = duracion;
        this.valor = valor;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() { // Lo uso para escribir en el archivo de texto sin afectar a como se ve en la pantalla
        return
                id + ";"+ region  + ";"+ tipo  + ";"+ duracion + ";" + valor ;
    }

    public void MostrarDatos(){
        System.out.println("ID: " + id);
        System.out.println("Region: " + region);
        System.out.println("Tipo: "+tipo);
        System.out.println("Duración: "+duracion + "Hrs.");
        System.out.println("Valor: $"+valor);
    }


    public String Textobonito(){
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "~~ "+"ID: "+ id + " || Region: "+ region + " || Tipo: " + tipo +" || Duración: " +duracion + " || Valor: " + valor+" ~~" + // Se usa para mostrar en pantalla, sin afectar a la forma de escritura en archivo de texto
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" ;
    }
}
