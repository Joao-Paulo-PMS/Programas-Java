/*Crie uma classe java ComparaNumero que contenha um m�todo que receba dois n�meros e indique 
 * se s�o iguais ou se s�o diferentes. Mostre o
 *  maior e o menor (nesta sequ�ncia)
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
		System.out.printf("\n s�o iguais \n");
	}else
	{
		System.out.printf("\n s�o diferentes \n");
	}
	if(numa>numb) {
		System.out.printf("\n num a � maior que num b\n");
	}else
	{
		
		System.out.printf("\n num b � maior que num a\n");
	}
		
}

}
