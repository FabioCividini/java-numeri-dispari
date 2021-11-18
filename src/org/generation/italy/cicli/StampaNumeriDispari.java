package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
			
			System.out.print("Scegli la lunghezza del Array: ");
			int lunghezza = scanner.nextInt();
			
			int[] nArray = new int[lunghezza];
			
			System.out.println("Numeri dispari: ");			
			
			for(int i = 0; i < lunghezza; i ++) {
					nArray[i] = random.nextInt(100);
					
					if(nArray[i] % 2 != 0) {
						System.out.print(nArray[i] + " ");
					}
			}
			
			scanner.close();
		
	}
		
}
