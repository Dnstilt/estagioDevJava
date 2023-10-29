import java.util.InputMismatchException;
import java.util.Scanner;

public class primosLinear {
	
	public static void main(String[] args) {
		int num;
		while (true) {
			while (true) { 
		        try {
		        	Scanner valor = new Scanner(System.in);
					System.out.println("Informe um n�mero maior que 1 para iniciar a sequ�ncia de n�meros primos:\n");
		            num = valor.nextInt();
		            break; 
		        } catch (InputMismatchException e) {
		            System.out.println("Deve ser informado um n�mero maior que 1:\n");
		      }
			}    
			if (num <= 1) {
				System.out.println("Deve ser informado um n�mero maior que 1:\n");
				}	
			else {
				num = num;
				break;
			}	
		}
		for(int i = 2; i <= num; i++) {
            boolean primo = true;        
            for(int j = 2; j < i; j++) {            
                if(i % j == 0) {
                    primo = false;
                }
            }
            if(primo) {
                System.out.println(i);
            }          
        }		
	}
}
	
