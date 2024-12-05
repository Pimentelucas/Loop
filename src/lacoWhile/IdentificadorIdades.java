package lacoWhile;

import java.util.Scanner;

public class IdentificadorIdades {

	public static void main(String[] args) {
		
		int idade = 0, totalMenor = 0, totalMaior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21) {
				totalMenor++;
			}if(idade > 50) {
				totalMaior++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: "+ (totalMenor - 1));
		System.out.println("Total de pessoas maiores de 50 anos: "+ totalMaior);
	}

}
