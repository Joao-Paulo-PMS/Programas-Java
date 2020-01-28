/* Crie uma classe java MaiorNumero que contenha um método que receba dois números inteiros 
 * e imprima o maior entre eles. 
 */
package teste;

import java.util.Scanner;

public class programa2 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int var1;
		int var2;
		
		System.out.print("Digite o numero 1\n");
		var1 = input.nextInt();
		System.out.print("Digite o numero 2\n");
		var2 = input.nextInt();
		
		if(var1>var2)
		{
			
			System.out.print("o maior é var 1 \n");
			System.out.print(var1);
			
		}
		else
		{
			
			System.out.print("o maior é var 2 \n");
			System.out.print(var2);
		}
			
	}


}
