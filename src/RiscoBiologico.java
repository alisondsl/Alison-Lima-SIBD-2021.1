
public class RiscoBiologico {

	public String[] agente = new String[5];
	public String[] doenca = new String[5];
	
	
	public void registrarRiscoBiologico (String agente, String doenca, int idRiscoB) {
		this.agente[idRiscoB] = agente;
		this.doenca[idRiscoB] = doenca;
	}
	
	
	public void detectarRiscoBiologico (int idRiscoB) {
		System.out.println("----Risco Biológico----\nDOENÇA: " + this.doenca[idRiscoB] + "\nAGENTE: " + this.agente[idRiscoB] + "\n" );
	}
}
