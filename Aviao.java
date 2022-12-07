public class Aviao extends Aeronave {
    
    private int capacidade;
    private String prefixo;

    private int idCompanhia;

    
    public Aviao(
        int id,
        String modelo,
        String marca,
        int capacidade,
        String prefixo,
        Companhia companhia

    ){
        super(id, modelo, marca);
        this.capacidade = capacidade;
        this.prefixo = prefixo;
       
      this.idCompanhia = companhia.getId();
        
        
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public String getPrefixo(){
        return prefixo;
    }
    public void setPrefixo(String prefixo){
        this.prefixo = prefixo;
    }
    
    
    
   @Override 
   public String toString(){
       return "Modelo: " + super.getModelo() + "\n"
               + "Marca: " + super.getmarca() + "\n"
               + "Capacidade: " + capacidade + "\n"
               + "Prefixo: " + prefixo + "\n"
               + "Companhia: " + this.idCompanhia + "\n";
   }
}
