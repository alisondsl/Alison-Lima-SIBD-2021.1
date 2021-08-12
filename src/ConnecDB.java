import java.sql.*;

public class ConnecDB {
	
	private Connection connection;
	
	public ConnecDB() {
		this.connection = null;
	}
	
	private void setConnection (Connection connection) {
	this.connection = connection;
	}
	
	public Connection getConnection() {
		return this.connection;
	}

	public boolean abreConnection(){
		try{
			connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/aliso/Downloads/TP8.db");
					this.setConnection(connection);
					return true;
		} catch (SQLException error) {
			System.out.println(error.getMessage());
			return false;
		}
		
	}
	
	public boolean fechaConnection() {
		try {
			if(this.getConnection() != null)
				this.getConnection().close();
				return true;
		} catch (SQLException error) {
			System.out.println(error.getMessage());
			return false;
		}
	}


}



