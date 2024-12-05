package laco_do_while;

import java.util.Scanner;

public class SomaPositivo {

	public static void main(String[] args) {
		
		int num, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if(num > 0) {
				soma = num + soma;
			}
		}while(num != 0);
		
		System.out.println("A soma dos números positivos é: "+ soma);
	}

}
