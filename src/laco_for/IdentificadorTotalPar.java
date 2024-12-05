package laco_for;

import java.util.Scanner;

public class IdentificadorTotalPar {

	public static void main(String[] args) {
		
		int numero, soma = 0;
		
		Scanner leia = new Scanner (System.in);
		
		for (int i = 0; i < 10; i++){
			System.out.println("Digite o " + (i + 1) +"° número: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				soma++;
			}
		}
		System.out.println("A quantidade de números pares é: "+ soma);
		System.out.println("A quantidade de números ímpares é: "+ (10 - soma));

	}

}
