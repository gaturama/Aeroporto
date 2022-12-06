import java.util.ArrayList;

public abstract class Aeronave {
    
    private int id;
    private String modelo;
    private String marca;
    
    public static ArrayList<Aeronave> aeronaves = new ArrayList<>();
    
    protected Aeronave(
     int id,
     String modelo,
     String marca
    ) {
        this.setId(id);
        this.modelo = modelo;
        this.marca = marca;
        
        aeronaves.add(this);
    }

    public int getId() {
        return id;
    }
    public void setId( int id){
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getmarca() {
        return marca;
    }
    public void setmarca(String marca) {
        this.marca = marca;
    }
    
    public static Aeronave getAeronaveById(int id) throws Exception{
        for(Aeronave aeronave : aeronaves){
            if(aeronave.getId() == id){
                return aeronave;
            }
        }
        throw new Exception("Aeronave não encontrada");
    }
    
    public static void excluir(int id) throws Exception{
        Aeronave aeronave = getAeronaveById(id);
        aeronaves.remove(aeronave);
    }
    
    @Override
    public String toString() {
        return "Modelo: " + modelo + "\n" +
               "Marca: " + marca + "\n";
    }
}