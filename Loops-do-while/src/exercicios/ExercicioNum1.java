package exercicios;

import java.util.Scanner;

public class ExercicioNum1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contagem = 0;
		while (contagem <= 10) {
			System.out.println(contagem);
			contagem = (contagem + 1);
		}
		sc.close();
	}

}
