/*Crie uma classe java TrocaNumero que contenha um método que receba dois números NumA e
 *  NumB, nessa ordem, e imprima em ordem inversa, isto é, se os dados lidos forem NumA = 5 e 
 * NumB = 9, por exemplo, devem ser impressos na ordem NumA = 9 e NumB = 5.
 */

package teste;


import java.util.Scanner
;

public class programa5 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		int numa;
		int numb;
		
		System.out.printf("\ndigite valor de numa\n");
		numa = input.nextInt();
		System.out.printf("\ndigite valor de numb\n");
		numb = input.nextInt();
		
		System.out.printf("\no inverso %d, %d",numb,numa);
		
		
		
		
	}

}
