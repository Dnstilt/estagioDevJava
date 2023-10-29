import java.util.InputMismatchException;
import java.util.Scanner;

class Fiborecursiva{
	
	public void main(String[] args) {
		fiborecursiva();
	}
	
	public static int fiborecursiva(int n) { 
		
		int retorno;
		int resultado;
		while (true) {
			while (true) { 	
				try {
					Scanner valor = new Scanner(System.in);
					System.out.println("Informe um n�mero maior que 0 para iniciar a sequ�ncia de Fibonacci:\n");
					retorno = valor.nextInt();
					break; 
				} catch (InputMismatchException e) {
					System.out.println("Deve ser informado um n�mero maior que 0:\n");
				}
		      	}     
			if (retorno < 0) {
				System.out.println("Deve ser informado um n�mero maior que 0:\n");
				}	
			else if (retorno == 0 || retorno == 1) {
				retorno = retorno;
				System.out.println("O valor de " + retorno + " na sequ�ncia Fibonacci � " + retorno + ".");
				break
				} 
			else {
				resultado = fiborecursiva(n = (retorno - 1)) + fiborecursiva(n = (retorno - 2));
				System.out.println("O valor de " + retorno + " na sequ�ncia Fibonacci � " + resultado + ".");
				break
		    	}
	}
	}
}

