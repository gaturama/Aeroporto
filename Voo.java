import java.util.ArrayList;

public class Voo {
    
    private int id;
    private String numero;
    private String data;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;

    private int idAviao;
    private int idPista;
    private int idHelicoptero;
    private int idJato;
    
    public static ArrayList<Voo> voos = new ArrayList<>();

    public Voo(
        int id,
        String numero,
        String data,
        String origem,
        String destino,
        String piloto,
        String copiloto,
        String observacao,
        Aviao aviao,
        Pista pista,
        Helicoptero helicoptero,
        Jato jato
    ){
        this.id = id;
        this.numero = numero;
        this.data = data;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.idAviao = aviao.getId();
        this.idPista = pista.getId();
        this.idHelicoptero = helicoptero.getId();
        this.idJato = jato.getId();
        
        voos.add(this);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getOrigem(){
        return origem;
    }
    public void setOrigem(String origem){
        this.origem = origem;
    }
    public String getDestino(){
        return destino;
    }
    public void setDestino(String destino){
        this.destino = destino;
    }
    public String getPiloto(){
        return piloto;
    }
    public void setPiloto(String piloto){
        this.piloto = piloto;
    }
    public String getCopiloto(){
        return copiloto;
    }
    public void setCopiloto(String copiloto){
        this.copiloto = copiloto;
    }
    public String getObservacao(){
        return observacao;
    }
    public void setObservacao(String observacao){
        this.observacao = observacao;
    }
    
    public static Voo getVooById(int id) throws Exception{
          for(Voo voo : voos){
            if(voo.getId() == id){
                return voo;
            }
        }
        throw new Exception("Jato não encontrado");
    }
    
    public static void excluir(int id) throws Exception{
        Voo voo = getVooById(id);
        voos.remove(voo);
    }
    
    @Override
    public String toString(){
        return "Id: " + id + "\n"
            + "Número: " + numero + "\n"
            + "Data: " + data + "\n"
            + "Origem: " + origem + "\n"
            + "Destino: " + destino + "\n"
            + "Piloto: " + piloto + "\n"
            + "Copiloto: " + copiloto + "\n"
            + "Observação: " + observacao + "\n"
            + "Avião: " + this.idAviao + "\n"
            + "Helicoptero: " + this.idHelicoptero + "\n"
            + "Jato: " + this.idJato + "\n"
            + "Pista: " + this.idPista + "\n";
    }
}
