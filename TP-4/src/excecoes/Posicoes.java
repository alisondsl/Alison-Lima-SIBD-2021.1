package excecoes;


public class Posicoes {

	int[] arrayA = new int[10];
	int[] arrayB = new int[10];

	int v;
	int p;

	//item 1
	public void setArrayANaPosicao(int v, int p) {
		try{	

			arrayA[p] = v;

			System.out.println("O vetor de posição " + p + " recebe o valor " + arrayA[p]);
		}catch(ArrayIndexOutOfBoundsException exception) {

			System.out.println("A posição " + p + " do vetor A é inexistente");
		}
	}


	public void setArrayBNaPosicao(int v, int p) {
		try{

			arrayB[p] = v;
			System.out.println("O vetor de posição " + p + " recebe o valor " + arrayB[p]);

		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("A posição " + p + " do vetor B é inexistente");
		}
	}

	//item 2 e 3

	public void calcula(int a, int b) {
		try {

			if ( a/b == 0 ) {
				throw new ExcecaoDivisaoResultadoZero();
			}
			else {
				System.out.println(a + "/" + b + " = " + (a/b));
			}
		} 
		catch (ArithmeticException aex) {

			System.out.println("Impossível dividir por zero. Tente novamente com outro valor. ");	
		}
		catch(ExcecaoDivisaoResultadoZero e){

			System.out.println("O resultado da divisão foi zero. Tente novamente com outro valor.");
		}

	}

	//item 4
	public double up() {
		double min = 0;
		double max = 3;
		double valorAleatorio = Math.floor(Math.random() * (max - min + 1) + min);
		return valorAleatorio;
	}

	public void CalculaDivisaoArrays() throws ExcecaoDivisaoResultadoZero {
		//popula array
		for (int k = 0; k < 10; k++) {
			setArrayANaPosicao((int) up(), k);
			setArrayBNaPosicao((int) up(), k);
		}
		for (int k = 0; k < 10; k++) {
			try{

				calcula(arrayA[k], arrayB[k]);
				System.out.println("Divisão dos vetores de ordem " + k + " = " + (arrayA[k]/arrayB[k]));      
				throw new ExcecaoDivisaoResultadoZero();
			}
			catch(ExcecaoDivisaoResultadoZero | ArithmeticException acx){

				System.out.println(""); 

			}
			finally {
				System.out.println("A = " + arrayA[k] + " B = " + arrayB[k]);
				System.out.println("-----------------");
			}
		}
	}




	public int[] getArrayA() {
		return arrayA;
	}

	public void setArrayA(int[] arrayA) {
		this.arrayA = arrayA;
	}

	public int[] getArrayB() {
		return arrayB;
	}

	public void setArrayB(int[] arrayB) {
		this.arrayB = arrayB;
	}




}




	


