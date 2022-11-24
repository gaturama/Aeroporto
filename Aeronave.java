public abstract class Aeronave {
    
    private String modelo;
    private String companhia;

    protected Aeronave(
     String modelo,
     String companhia
    ) {
        this.modelo = modelo;
        this.companhia = companhia;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCompanhia() {
        return companhia;
    }
    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + "\n" +
               "Companhia: " + companhia + "\n";
    }
}