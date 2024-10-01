package Questao4;

public class Sequencias {
	public static void main(String[] args) {
		// Sequência a) 1, 3, 5, 7, ___ (Sequência de números ímpares)
		int[] seqA = { 1, 3, 5, 7 };
		System.out.println("Próximo número na sequência a): " + (seqA[seqA.length - 1] + 2));

		// Sequência b) 2, 4, 8, 16, 32, 64, ____ (Potências de 2)
		int[] seqB = { 2, 4, 8, 16, 32, 64 };
		System.out.println("Próximo número na sequência b): " + (seqB[seqB.length - 1] * 2));

		// Sequência c) 0, 1, 4, 9, 16, 25, 36, ____ (Quadrados perfeitos)
		int[] seqC = { 0, 1, 4, 9, 16, 25, 36 };
		int nextC = (int) Math.pow(seqC.length, 2); // O próximo número é o quadrado do índice 7
		System.out.println("Próximo número na sequência c): " + nextC);

		// Sequência d) 4, 16, 36, 64, ____ (Quadrados perfeitos dos pares)
		int[] seqD = { 4, 16, 36, 64 };
		int nextD = (int) Math.pow((seqD.length + 1) * 2, 2); // Próximo número é o quadrado de 10 (par)
		System.out.println("Próximo número na sequência d): " + nextD);

		// Sequência e) 1, 1, 2, 3, 5, 8, ____ (Sequência de Fibonacci)
		int[] seqE = { 1, 1, 2, 3, 5, 8 };
		int nextE = seqE[seqE.length - 1] + seqE[seqE.length - 2]; // Soma dos dois anteriores
		System.out.println("Próximo número na sequência e): " + nextE);

		// Sequência f) 2, 10, 12, 16, 17, 18, 19, ____ (Sequência sem lógica clara,
		// próximo é 20)
		int[] seqF = { 2, 10, 12, 16, 17, 18, 19 };
		int nextF = seqF[seqF.length - 1] + 1; // Aumenta por 1 após 19
		System.out.println("Próximo número na sequência f): " + nextF);
	}

}
