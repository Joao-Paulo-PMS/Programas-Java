/*Escreva um programa que imprima na tela a soma dos números 
 * ímpares entre 0 e 30 e a multiplica
 * ção dos números pares entre 0 
 * e 30. */


package teste;

public class programa4 {

	
	public static void main(String[] args) {
		
		
		
		int cont=1;
		int aux=2;
		int mult=1;
		int soma=0;
		int i = 1;
		int f =0 ;
		
		System.out.printf(" \n %d = cont \n",cont);
		do
		{
			
			cont= cont+aux;
			
			soma=soma+cont;
			i++;
		System.out.printf("%d = cont \n , %d = soma \n",cont, soma);
		
			
		}while(i<=30);
		
		
		do
		{
			
			if(f % 2 >= 0)
		    {
		    	
		    	mult= mult*2;
		    
		    	
		    }
               f++;
		
			System.out.printf("\n %d = mult \n",mult);
		}while( f <=30);
		
	}
}
