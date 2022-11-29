public class Helicoptero extends Aeronave {
    
    private int capacidade;
    private String cor;

    public Helicoptero(
        int id,
        String marca,
        String modelo,
        int capacidade,
        String cor
        ){
        super(id, modelo, marca);    
        this.capacidade = capacidade;
        this.cor = cor;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
         this.capacidade = capacidade;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Id: " + super.getId() + "\n"
            + "Modelo: " + super.getModelo() + "\n"
            + "Marca: " + super.getmarca() + "\n"
            + "Capacidade: " + capacidade + "\n"
            + "Cor: " + cor + "\n";
    }
}
