import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Helicoptero extends Aeronave {
    
    private int capacidade;
    private String cor;

    public Helicoptero(
        int id,
        String marca,
        String modelo,
        int capacidade,
        String cor
        )throws SQLException{
        super(id, modelo, marca);    
        this.capacidade = capacidade;
        this.cor = cor;
        
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO Helicopteros (capacidade, cor) VALUES (?, ?)"
        );
        stmt.setInt(1, id);
        stmt.setInt(2, capacidade);
        stmt.setString(3, cor);
        stmt.setString(4, modelo);
        stmt.setString(5, marca);
        stmt.execute();
        stmt.close();

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
    
    public static void listarHelicopteros() throws SQLException{
        Connection conex = DAO.createConnection();
        ResultSet rs = conex.createStatement().executeQuery(
            "SELECT * FROM Helicopteros;"
        );
        while(rs.next()){
            System.out.println(
                "ID: " + rs.getInt("id") + 
                "Velocidade: " + rs.getInt("velocidade") +
                "Cor: " +  rs.getString("cor") +
                "Marca: " + rs.getString("marca") + 
                "Modelo: " + rs.getString("modelo")
            );
        }
    }

    public static void updateHelicopteros(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "UPDATE Helicopteros SET cor = ?, capacidade = ? WHERE id = ?;"
        );
        stmt.setString(1, "teste");
        stmt.setInt(2, 250);
        stmt.setInt(3, id);
        stmt.execute();
        stmt.close();
    }

    public void deleteHelicopteros(int id) throws SQLException{
        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "DELETE FROM Helicopteros WHERE id = ?;"
        );
        stmt.setInt(1,id);
        stmt.execute();
        stmt.close();
    }
    
    @Override
    public String toString() {
        return "Id: " + super.getId() + "\n"
            + "Modelo: " + super.getModelo() + "\n"
            + "Marca: " + super.getmarca() + "\n"
            + "Capacidade: " + capacidade + "\n"
            + "Cor: " + cor + "\n";
    }
    @Override 
    public boolean equals (Object object){
        if(object == null || !(object instanceof Jato)){
            return false;
        }
        final Helicoptero other = (Helicoptero) object;

        return this.getId() == other.getId();
    }
}
