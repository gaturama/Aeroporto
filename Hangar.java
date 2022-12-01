import java.util.ArrayList

public class Hangar {
    
    private int id;
    private String local;

    private int idAviao;
    
    public static ArrayList<Hangar> hangares = new ArrayList<>();
    
    public Hangar(
        int id,
        String local,
        Aviao aviao
   ){
        this.id = id;
        this.local = local;

        this.idAviao = aviao.getId();
        
        hangares.add(this);
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getLocal(){
        return local;
    }
    public void setLocal(String local){
        this.local = local;
    }
    public static Hangar getHangarById(int id) throws Exception{
        for(Hangar hangar : hangares){
            if(hangar.getId() == id){
                return hangar;
            }
        }
        throw new Exception("Hangar não encontrado");
    }
    
    public static void excluir(int id) throws Exception{
        Hangar hangar = getHangarById(id);
        hangares.remove(jato);
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "\n"
        + "Local: " + local + "\n"
        + "Avião: " + this.idAviao + "\n";
    }
}
