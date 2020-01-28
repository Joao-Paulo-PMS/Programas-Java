/*Crie uma classe MediaAluno que contenha um atributo do tipo vetor de inteiros com o 
 * nome de notas. Essa classe deve ter um método para adicionar as notas nesse vetor
 *  (os valores que podem ser adicionados no vetor são os inteiros entre 0 e 100, caso 
 *  contrário imprime uma mensagem de erro e não adiciona)
 *  e outro método que calcule a média de um aluno e imprima essa média
 */



package teste;

import java.util.Scanner;

public class programa7 {
	
	public static void main(String[]Args)
	{
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int n=100;
		int nota[]= new int [n];
		int i=0;
		int media=0;
		int soma=0;
		do {
			
			System.out.printf(" \n digite valor de nota %d, v%d \n",i,i);
			nota[i] = input.nextInt();
			soma = nota[i]+ soma;
			
			
			i++;
		}while(i<=100);
		media=soma/100;
		
		System.out.printf("media = %d",media);		
		
		
	}

}
