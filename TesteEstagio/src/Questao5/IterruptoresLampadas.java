package Questao5;

import java.util.Scanner;

public class IterruptoresLampadas {

	public static void main(String[] args) {
		// Simulação dos estados das lâmpadas
		boolean lampadaAquecida = false;
		boolean lampadaLigada = false;

		Scanner scanner = new Scanner(System.in);

		// Simulando os passos descritos
		System.out.println("Ligando o interruptor A por um tempo e depois desligando...");
		lampadaAquecida = true; // A lâmpada A aquece porque foi ligada e depois desligada

		System.out.println("Ligando o interruptor B...");
		lampadaLigada = true; // A lâmpada B está ligada

		// Saindo para verificar as lâmpadas
		System.out.println("Indo até a sala das lâmpadas para verificar o estado...");

		// Verificação dos estados das lâmpadas
		System.out.println("Verifique o estado das lâmpadas:");
		System.out.println("1. A lâmpada ligada indica que o interruptor B a controla.");
		System.out.println("2. A lâmpada desligada e quente indica que o interruptor A a controla.");
		System.out.println("3. A lâmpada desligada e fria indica que o interruptor C a controla.");

		// Pergunta ao usuário para simular a verificação
		System.out.println("\nPor favor, insira o estado da lâmpada: ");
		System.out.println("1 - Ligada");
		System.out.println("2 - Desligada e quente");
		System.out.println("3 - Desligada e fria");

		int estado = scanner.nextInt();

		switch (estado) {
		case 1:
			System.out.println("A lâmpada ligada é controlada pelo interruptor B.");
			break;
		case 2:
			System.out.println("A lâmpada desligada e quente é controlada pelo interruptor A.");
			break;
		case 3:
			System.out.println("A lâmpada desligada e fria é controlada pelo interruptor C.");
			break;
		default:
			System.out.println("Estado inválido.");
			break;
		}

		scanner.close();
	}

}
