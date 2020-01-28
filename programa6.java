/*Crie uma classe java ComparaNumero que contenha um método que receba dois números e indique 
 * se são iguais ou se são diferentes. Mostre o
 *  maior e o menor (nesta sequência)
 */

package teste;

import java.util.Scanner;

public class programa6 {
	
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		int numa;
		int numb;
		
		System.out.printf("\ndigite valor de num a\n");
		numa = input.nextInt();
		System.out.printf("\ndigite valor de num b\n");
		numb = input.nextInt();
	if(numa==numb)
	{
		System.out.printf("\n são iguais \n");
	}else
	{
		System.out.printf("\n são diferentes \n");
	}
	if(numa>numb) {
		System.out.printf("\n num a é maior que num b\n");
	}else
	{
		
		System.out.printf("\n num b é maior que num a\n");
	}
		
}

}
