package exercicios;

import java.util.Scanner;

public class ExercicioNum3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, mult;
		System.out.println("Digite um número");
		num = sc.nextInt();
		mult = 0;
		while (mult < 11) {
			System.out.println(num * mult);
			mult = (mult + 1);
		}
		sc.close();
	}

}
