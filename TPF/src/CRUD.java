import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CRUD {

	private Connection connection;
	
	public CRUD (Connection connection) {
		this.connection = connection;
	}
	
	public boolean createAcidente (int cod, String funcionario, String setor, String data, int risco, String acidente, String agente){
		try{
			Statement statement = this.connection.createStatement();
			statement.executeUpdate("INSERT INTO Acidentes VALUES ('"+cod+"', '"+funcionario+"', '"+setor+"', '"+data+"', '"+risco+"', '"+acidente+"', '"+agente+"')");
			return true;
		} catch (SQLException error) {
			System.out.println(error.getMessage());
			return false;
		}
	}
	
	
	
	public boolean readAcidente (int cod) {
		try{
			Statement statement = this.connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM Acidentes WHERE codigo = "+cod+"");
			
			while (rs.next()){
				int codigo = rs.getInt("cod");
				String funcionario = rs.getString("funcionario");
				String setor = rs.getString("setor");
				String data = rs.getString("data");
				int risco = rs.getInt("risco");
				String acidente = rs.getString("acidente");
				String agente = rs.getString("agente");
				
				System.out.println(cod + " - " + funcionario + " - " + setor + " - " + data + " - " + risco + " - " + acidente + " - " + agente);
			}
			return true;
		}catch (SQLException error){
			System.out.println(error.getMessage());
			return false;
		}
	}
	
	
	
	 public boolean updateAcidente(int cod, String funcionario, String setor, String data, int risco, String acidente, String agente, int novoCod){
	        try{
	            Statement statement = this.connection.createStatement();
	            statement.executeUpdate("UPDATE Acidentes SET codigo = "+novoCod+" WHERE codigo = "+cod);
	            return true;
	           }catch(SQLException error){
	        	   System.out.println(error.getMessage());
	        	  
	               return false;
	           }
	    }

	 
	 
	 public boolean deleteAcidente(int cod){
	 		try {
	 			Statement statement = this.connection.createStatement();
	 			statement.executeQuery("DELETE FROM Acidentes WHERE cod = "+cod+"");
	 			
	 			return true;
	 			}catch (SQLException error) {
	 				System.out.println(error.getMessage());
	 				return false;
	 			}
	 					
	 }
	 
	 
	 }
	
	 
	 
	 
	 
		
	 					
