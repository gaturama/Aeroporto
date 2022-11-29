public class Jato extends Aeronave{

    private int velocidade;
    private String cor;

    public Jato(

    int id,
    String marca,
    String modelo,
    int velocidade,
    String cor
    ){
        super(id, marca, modelo);
        this.velocidade = velocidade;
        this.cor = cor;
    }

    public int getVelocidade(){
        return velocidade;
    }
    public String getCor(){
        return cor;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
  
    @Override
    public String toString(){
        return "ID: " + super.getId() + "\n"
        + "Marca: " + super.getmarca() + "\n"
        + "Modelo: " + super.getModelo() + "\n"
        + "Velocidade: " + velocidade + "\n"
        + "Cor: " + cor;
    }
}