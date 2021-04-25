package testes;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio_AvanadeFullStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // Ler um numero de entrada 
		// entrada é a quantidade de saidas exibidas no Console
		//  N (1 < N < 1000)
		Scanner ler = new Scanner(System.in);
		int numero,contador;
		int aux;
		numero = 0;
		aux = 0;
		contador =aux;
		while(contador < 6)
		{
			System.out.println("Digite um numero:");
			numero = ler.nextInt();
			if(numero > 0)
			{
				contador++;
				aux++;
			}
			else {
				contador++;
			}
		}
		System.out.println(aux + "Valores Positivos");
		
		
	
	}
	
	static void PrimeiroMetodo()
	{
int x,y,limite,result;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero :");
		limite = ler.nextInt();
		result = 1;
		
		//int [,] matriz= new int[limite,3];
		int[][] matriz = new int[limite][3]; 
		
		try {
			
			
			 for(int i=0; i<limite; i++)
			   {
				  for(int j=0; j<=2; j++)
				   {   
					   
					  // Console.Write("\t{0}", matriz[i , j]); 
					  if(i>0 && j<=2 )
					  { 
						  result = result*i;
				          matriz[i][j]= result;
						  
						   //Console.Write("\t{0}", matriz[i , j]); 
						  //Console.Write("\t{0}",  matriz[i,j]);
				          System.out.println(matriz[i][j]);
					   
					   }
					 
					 
				   }
				    result = 1;
				   //Console.Write("\t{0}", array1[i] * array1[i] ); matriz[i,j]=
				  // Console.Write("\t{0}", matriz[0 , 0]); 
			   
			   }

			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro capturado:" + e.getMessage());
		}
		
		
	}

}
