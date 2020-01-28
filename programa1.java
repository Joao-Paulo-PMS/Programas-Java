
/* calculadora*/

package teste;

import java.util.Scanner;

public class programa1{

	public static void main (String[] args)
	{
		
		
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int op;
		int resultado;
		
		System.out.print("entre com o valor de numero 1\n");
		number1= input.nextInt();
		System.out.print("entre com o valor de numero 2\n");
		number2= input.nextInt();
		System.out.print("entre com o operador 1=+,2=-.3=*,4=/\n");
		op= input.nextInt();
		
		switch(op)
		{
		case 1:
			resultado = number1 + number2;
		 	System.out.print(resultado);
		case 2:
			resultado = number1 - number2;
			System.out.print(resultado);
		case 3:
			resultado = number1 * number2;
			System.out.print(resultado);
		case 4:
			resultado = number1 / number2;
			System.out.print(resultado);
			
		}
		
		
	}

}
