package Questao2;

import java.util.Scanner;

public class ContagemLetraA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe uma palavre para verificar a existência da letra 'a':");
        String inputString = scanner.nextLine();
        
        int count = 0;
        
        for (char c : inputString.toCharArray()) {
        	if(c == 'a' || c == 'A') {
        		count ++;
        	}
        }
        
        if(count > 0) {
        	System.out.println("A letra 'a' aparece " + count + " vez(es) na frase.");
        }else {
        	System.out.println("A letra 'a' nao aparece na frase.");
        }
	}
	
	

}
