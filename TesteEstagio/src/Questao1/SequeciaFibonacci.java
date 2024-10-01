package Questao1;

import java.util.Scanner;

public class SequeciaFibonacci {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		//Exibe uma mensagem solicitando que o usario informe o numero
		System.out.println("Informe um número para verificar se pertence à sequência de Fibonacci:");
		int inputNumber = scanner.nextInt();
		
		if(Fibonacci(inputNumber)) {
			 System.out.println("O número " + inputNumber + " pertence à sequência de Fibonacci.");
		}else {
			System.out.println("O número " + inputNumber + " nao pertence à sequência de Fibonacci.");
		}
	}
	
	//Metodo para verificar se um nomero pertence a sequencia de Fibonacci
	
	public static boolean Fibonacci(int number) {
		//Se o numero for 0 ou 1, retona true, pois esse numeros fazem parte da sequencia de Fibonnaci
		if (number == 0 || number == 1) {
			return true;
		}
		//Inicializa os dois primeiros numeros da sequencia
		int prev = 0;
		int current = 1;
		
		while (current < number) {
			int next = prev + current;
			prev = current;
			current = next;
		}
		return current == number;
	}

}
