package exercicios;

import java.util.Scanner;

public class ExercicioNum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contagem;

		System.out.println("Digite o número desejado:");
		contagem = sc.nextInt();

		if (contagem % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		sc.close();

	}

}
