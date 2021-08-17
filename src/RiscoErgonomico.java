
public class RiscoErgonomico {

	public String [] doenca = new String [5];
	public String [] causa = new String [5];
	
	public void registrarRiscoErgonomico (String doenca, String causa, int idRiscoE) {
		this.doenca[idRiscoE] = doenca;
		this.causa[idRiscoE] = causa;
	}

	
	
	public void detectarRiscoErgonomico (int idRiscoE) {
		System.out.println("-----Risco Ergonômico-----\nDOENÇA: " + this.doenca[idRiscoE] + "\nCAUSA: " + this.causa[idRiscoE] +"\n");
	}
}
