public class Hangar {
    
    private int id;
    private String local;

    private int idAviao;
    
    public Hangar(
        int id,
        String local,
        Aviao aviao
   ){
        this.id = id;
        this.local = local;

        this.idAviao = aviao.getId();
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
    
    @Override
    public String toString(){
        return "ID: " + id + "\n"
        + "Local: " + local + "\n"
        + "Avião: " + this.idAviao + "\n";
    }
}
