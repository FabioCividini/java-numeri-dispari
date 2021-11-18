package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
			
			//input da tastiera utente inserisce lunghezza Array
			System.out.print("Scegli la lunghezza del Array: ");
			int lunghezza = scanner.nextInt();
			
			//creo Array che ha lunghezza = all'input che ha dato l'utente
			int[] nArray = new int[lunghezza];
			
			System.out.println("Numeri dispari: ");			
			
			//inizializzato variabili per contatori e somma
			int contatoreDispari = 0;
			int contatorePari = 0;
			int somma = 0;
			
			//popolare l'Array con numeri casuali fino a 100
			for(int i = 0; i < lunghezza; i ++) {
					
					//numeri casuali a random fino a...
					nArray[i] = random.nextInt(100);
					
					//condizione numero dispari
					if(nArray[i] % 2 != 0) {
						System.out.print(nArray[i] + " ");
						//contatore numeri dispari
						contatoreDispari++;
					
					//numeri pari	
					} else {
						//contatore numeri pari
						contatorePari++;
					}
					
					//somma dei numeri tra 10 e 50
					if(nArray[i] > 10 && nArray[i] < 50) {
						somma += nArray[i];
					}
			}
			

			System.out.println("\nNumeri dispari sono: " + contatoreDispari);
			System.out.println("\nNumeri pari sono: " + contatorePari);
			System.out.println("\nSomma numeri tra 10 e 50: " + somma);
			
			
			scanner.close();
		
	}
		
}
