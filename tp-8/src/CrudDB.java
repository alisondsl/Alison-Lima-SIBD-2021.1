import java.sql.*;


public class CrudDB {

	private Connection connection;
	
	public CrudDB (Connection connection) {
		this.connection = connection;
	}
	
	public boolean createFilme (int codigo, String nome, String duracao, String classEtaria, String genero_filme){
		try{
			Statement statement = this.connection.createStatement();
			statement.executeUpdate("INSERT INTO Filme VALUES ('"+codigo+"', '"+nome+"', '"+duracao+"', '"+classEtaria+"', '"+genero_filme+"')");
			return true;
		} catch (SQLException error) {
			System.out.println(error.getMessage());
			return false;
		}
	}
	
	
	
	public boolean readFilme (int codigo) {
		try{
			Statement statement = this.connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM Filme WHERE codigo = "+codigo+"");
			
			while (rs.next()){
				int cod = rs.getInt("codigo");
				String nome = rs.getString("nome");
				String duracao = rs.getString("duracao");
				String classEtaria = rs.getString("classEtaria");
				String genero_filme = rs.getString("genero_filme");
				
				System.out.println(codigo + " - " + nome + " - " + duracao + " - " + classEtaria + " - " + genero_filme);
			}
			return true;
		}catch (SQLException error){
			System.out.println(error.getMessage());
			return false;
		}
	}
	
	
	
	 public boolean updateFilme(int codigo, String nome, String duracao, String classEtaria, String genero_filme, int novoCod){
	        try{
	            Statement statement = this.connection.createStatement();
	            statement.executeUpdate("UPDATE Filme SET codigo = "+novoCod+" WHERE codigo = "+codigo);
	            return true;
	           }catch(SQLException error){
	        	   System.out.println(error.getMessage());
	        	  
	               return false;
	           }
	    }

	 
	 
	 public boolean deleteFilme(int codigo){
	 		try {
	 			Statement statement = this.connection.createStatement();
	 			statement.executeQuery("DELETE FROM Filme WHERE codigo = "+codigo+"");
	 			
	 			return true;
	 			}catch (SQLException error) {
	 				System.out.println(error.getMessage());
	 				return false;
	 			}
	 					
	 }
	 
	 public boolean likeFilme(String gen) { 
		 	try{
		 		Statement statement = this.connection.createStatement();
		 		ResultSet rs =statement.executeQuery("SELECT * FROM Filme WHERE genero_filme LIKE" + "'%" + gen + "%'");
		 		
		 		while(rs.next()) { 
		 			int codigo = rs.getInt("codigo");
		 			String nome = rs.getString("nome");
		 			String duracao = rs.getString("duracao");
		 			String classEtaria = rs.getString("classEtaria");
		 			
		 			System.out.println(codigo + " - " + nome + " - " + duracao + " - " + classEtaria);
		 			
		 		}
		 		return true; 	
		 	} catch (SQLException error){ 
		 		System.out.println(error.getMessage());
		 		return false;
		 	}
	 }
	
	 
	 
	 
	 String arrayA[] = new String [5];
	 
	 public boolean array5Filme(int codigo1, String nome1, String duracao1, String classEtaria1, String genero_filme1, int codigo2, String nome2, String duracao2, String classEtaria2, String genero_filme2, int codigo3, String nome3, String duracao3, String classEtaria3, String genero_filme3, int codigo4, String nome4, String duracao4, String classEtaria4, String genero_filme4, int codigo5, String nome5, String duracao5, String classEtaria5, String genero_filme5 ){
	       
		 try{ 
	        Statement statement = this.connection.createStatement();
	        statement.executeUpdate("INSERT INTO Filme VALUES('"+codigo1+"', "+nome1+", "+duracao1+", "+classEtaria1+", "+genero_filme1+"), ('"+codigo2+"', "+nome2+", "+duracao2+", "+classEtaria2+", "+genero_filme2+"), ('"+codigo3+"', "+nome3+", "+duracao3+", "+classEtaria3+", "+genero_filme3+"), ('"+codigo4+"', "+nome4+", "+duracao4+", "+classEtaria4+", "+genero_filme4+"), ('"+codigo5+"', "+nome5+", "+duracao5+", "+classEtaria5+", "+genero_filme5+") ");
	        
	        return true;
	    } catch(SQLException error){
	    	System.out.println(error.getMessage());
	        return false;
	    }
	}
		
	 					
	 }

