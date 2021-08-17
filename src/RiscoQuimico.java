
public class RiscoQuimico {

	public String[] agente = new String[5];
	public String[] causa = new String [5];
	
	public void registrarRiscoQuimico (String agente, String causa, int idRiscoQ) {
		this.agente[idRiscoQ] = agente;
		this.causa[idRiscoQ] = causa;
	}
	
	public void detectarRiscoQuimico (int idRiscoQ) {
		System.out.println("-------Risco Químico------- \n" + "AGENTE: " + this.agente[idRiscoQ] + 
				"\nPOSSÍVEL CONSEQUÊNCIA: " + this.causa[idRiscoQ] + "\n");
	}
	

}
