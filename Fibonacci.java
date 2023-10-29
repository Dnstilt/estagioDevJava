import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) { 
		int retorno;
		int fib;
		while (true) {
			while (true) { 
		        try {
		        	Scanner valor = new Scanner(System.in);
					System.out.println("Informe um número maior que 0 para iniciar a sequência de Fibonacci:\n");
		            retorno = valor.nextInt();
		            break; 
		        } catch (InputMismatchException e) {
		            System.out.println("Deve ser informado um número maior que 0:\n");
		      }
			}    
			if (retorno <= 0) {
				System.out.println("Deve ser informado um número maior que 0:\n");
				}	
			else {
				fib = retorno;
				break;
			}
		}
		int n = 0;
		int n1 = 1;
		while (retorno != 0) {
			int n2 = n + n1;
			n = n1;
			n1 = n2;
			retorno -= 1;
			}
		System.out.println("O valor de " + fib + " na sequência Fibonacci é " + n1 + ".");
		}
}
