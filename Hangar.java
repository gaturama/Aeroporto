public class Hangar {
    
    private int id;
    private String local;
    
    public Hangar(
        int id,
        String local
   ){
        this.id = id;
        this.local = local;
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
        + "Local: " + local + "\n";
    }
}
