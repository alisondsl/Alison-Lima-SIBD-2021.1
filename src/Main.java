
public class Main {

	public static void main(String[] args) throws Exception {
		ConnecDB connection = new ConnecDB();
		connection.abreConnection();
		CrudDB crud = new CrudDB(connection.getConnection());
		
		
		/*crud.createFilme(110, "Venom", "140 min", "14", "Aventura");
		 * 
		 */
		 
		
		
		
		/*crud.updateFilme(110, null, null, null, null, 111);
		 * 
		 */
		  
		 
		 
		
		
		/*crud.readFilme(111);
		 * 
		 */
		 
		
		
		/*crud.deleteFilme(111);
		 * 
		 */
		
		 
		 
		
		
		 /*crud.likeFilme("Comédia");
		  * 
		  */
		 
		

		
		
		connection.fechaConnection();
		
}}
