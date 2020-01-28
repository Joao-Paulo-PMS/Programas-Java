package teste;

import java.util.Scanner;

public class agenda {
	{
		Scanner input = new Scanner(System.in);
		String contatos[] = null;
		int i=0;
		
		do {
		System.out.printf("digite o contato");
		contatos[i] = input.toString();
		i++;
		}while(i<=10);
		
	}

}
