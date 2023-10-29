import java.util.InputMismatchException;
import java.util.Scanner;

public class primosRecursiva {
	
	public static void main(String[] args) {
		int num;
		while (true) {
			while (true) { 
		        try {
		        	Scanner valor = new Scanner(System.in);
					System.out.println("Informe um número maior que 1 para iniciar a sequência de números primos:\n");
		            num = valor.nextInt();
		            break; 
		        } catch (InputMismatchException e) {
		            System.out.println("Deve ser informado um número maior que 1:\n");
		      }
			}    
			if (num <= 1) {
				System.out.println("Deve ser informado um número maior que 1:\n");
				}	
			else {
				num = num;
				primosRecursivaAte(num);
				break;
			}
		}
	}

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primosRecursivaAte(int n) {
        if (n <= 1) {
            return;
        }
        if (ehPrimo(n)) {
            System.out.print(n + " ");
        }

        primosRecursivaAte(n - 1);
    }
}