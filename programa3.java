
/*Crie uma classe java NumeroDecrescente que contenha um m�todo que receba um
 *  n�mero inteiro e imprima, em
 *  ordem decrescente, o valor do n�mero at� 0*/

package teste;

import java.util.Scanner;

public class programa3 {



	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int num;
		int aux=-1;
		
		System.out.print("Digite o numero \n");
		num = input.nextInt();
		System.out.print("em ordem descrescente\n");
		do {
			
			System.out.printf("%d \n",num);
			num=num+aux;
			
		}while(num>=0);
		
		
	}
	

	
	}


