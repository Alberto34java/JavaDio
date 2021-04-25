package testes;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int  contador;
		float numero;
		int aux;
		numero = 0;
		aux = 0;
		contador =aux;
		while(contador < 6)
		{
			System.out.println("Digite um numero:");
			numero = ler.nextFloat();
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

}
