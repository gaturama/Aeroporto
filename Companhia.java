import java.util.ArrayList;

public class Companhia {
    
    private int id;
    private String nome;
    private String cnpj;

    private static ArrayList<Companhia> companhias = new ArrayList<>();
    
    public Companhia(
        int id,
        String nome,
        String cnpj
    ){
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;

        companhias.add(this);
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public static Companhia getCompanhiaById(int id) throws Exception{
        for (Companhia companhia : companhias){
            if(companhia.getId() == id){
                return companhia;
            }
        }
        throw new Exception("Companhia não encontrado");
    }

    public static void excluir(int id) throws Exception{
        Companhia companhia = getCompanhiaById(id);
        companhias.remove(companhia);
    }
    
    @Override 
    public String toString(){
        return "ID: " + id + "\n"
        + "Nome: " + nome + "\n"
        + "CNPJ: " + cnpj + "\n";
    }
}
