package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		double[] altura = new double[n];
		double mulher = 0;
		int qtdHomem = 0;
		int qtdMulher = 1;

		for (int i = 0; i < altura.length; i++) {
			System.out.printf("Altura da %dª pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genêro da %dª pessoa: ", i + 1);
			char gen = sc.next().toLowerCase().charAt(0);

			if (gen == 'f') {
				mulher += altura[i];
				qtdMulher += 1;
			} else {
				qtdHomem += 1;
			}

		}
		
		double media = mulher / qtdMulher;
		double menor = altura[0];
		double maior = altura[0];

		for (int i = 0; i < altura.length; i++) {
			if (altura[i] > maior) {
				maior = altura[i];
			}
			if (altura[i] < menor) {
				menor = altura[i];
			}
		}

		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Media da altura das mulheres = %.2f%n", media);
		System.out.println("Número de homens = " + qtdHomem);

	}

}
