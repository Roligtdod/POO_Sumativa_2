package model;
// Objeto que representa un tour, con sus atributos región, tipo y valor
public class Tour {
    private String region;
    private String tipo;
    private int valor;

    public Tour(String region, String tipo, int valor){
        this.region = region;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() { // Lo uso para escribir en el archivo de texto sin afectar a como se ve en la pantalla
        return
                region  + ";"+
                 tipo  + ";"+
                 valor ;
    }


    public String Textobonito(){
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "~~ Region: "+ region + " || Tipo: " + tipo + " || Valor: " + valor+" ~~" + // Se usa para mostrar en pantalla, sin afectar a la forma de escritura en archivo de texto
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" ;
    }
}
