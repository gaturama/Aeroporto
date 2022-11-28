public class Aviao extends Aeronave {
    
    private int id;
    private String companhia;
    private String capacidade;
    private String prefixo;
    
    public Aviao(
        int id, 
        String companhia,
        String capacidade,
        String prefixo
    ){
       this.id = id;
            this.companhia = companhia;
                this.capacidade = capacidade;
                    this.prefixo = prefixo;
    }
     
    public int getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getCompanhia(){
        return companhia;
    }
    public void setCompanhia(String companhia){
        this.companhia;
    }
    public String getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(String capacidade){
        this.capacidade = capacidade;
    }
    public String getPrefixo(){
        return prefixo;
    }
    public void setPrefixo(String prefixo){
        this.prefixo = prefixo;
    }
    
    public static void removeAviao(int id) throws Exception{
        Aviao aviao = getAviao(id);
            avioes.remove(aviao);
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "\n"
            + "Companhia: " + companhia + "\n"
            + "Capacidade: " + capacidade + "\n"
            + "Prefixo: " + prefixo + "\n";
    }
}
