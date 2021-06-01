import java.util.Scanner;


public class Disciplina {
	
	public Disciplina() {	
		
	
	}

	public static void main (String[] args) {
		String[] aluno = new String[10];
		aluno[0] = "Alex"; aluno[1] = "Alison"; aluno[2] = "Rosa"; aluno[3] = "Renata";
		aluno[4] = "Ozeas"; aluno[5] = "Catarine"; aluno[6] = "Jonas";
		aluno[7] = "Emily"; aluno[8] = "Alicia"; aluno[9] = "Cristina";
		
		
		double[] notas1 = new double[10];
		notas1[0] = 7.5; notas1[1] = 6; notas1[2] = 6.8; notas1[3] = 9.6; notas1[4] = 10;
		notas1[5] = 4.6; notas1[6] = 7.8; notas1[7] = 9.1; notas1[8] = 1.1; notas1[9] = 7.4;
		
		double[] notas2 = new double[10];
		notas2[0] = 5; notas2[1] = 6; notas2[2] = 8; notas2[3] = 9.2; notas2[4] = 8.9;
		notas2[5] = 10; notas2[6] = 7; notas2[7] = 9; notas2[8] = 9.9; notas2[9] = 8.4; 
		
		
		//laço para média da nota 1
		double soma = 0;
		double media1 = 0;
		
		for (int sum = 0; sum < notas1.length; sum++) {
			soma = soma + notas1[sum];
			media1 = soma/10;
		}
		
		//laço para média da nota 2
		double soma1 = 0;
		double media2 = 0;
		
		for (int i = 0; i < notas2.length; i++) {
			soma1 = soma1 + notas2[i];
			media2 = soma1/10;
		}
		
		System.out.println("A média da nota um é " + media1 + " e a da nota dois é " + media2);
		
		//aluno sucessor e antecessor 
		
		Scanner entrada = new Scanner(System.in);
        int n;
		String suc;
		String ant;
        
        
        System.out.println("Digite o número do aluno: ");
        n = entrada.nextInt();
        
        ant = aluno[n-1];
        suc = aluno[n+1];
        
        System.out.println("Os alunos antecessor e sucessor do aluno " + aluno[n] + " são " + ant + " e " + suc );
		
		}
	}

