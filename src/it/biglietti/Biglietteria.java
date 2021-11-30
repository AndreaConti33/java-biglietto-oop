package it.biglietti;

// GRUPPO 5

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean valido = false;
		Biglietto biglietto = new Biglietto(0, 0);
		System.out.println("Inserire numero di chilometri da percorrere: ");
		while(valido == false) {
			
		}
		System.out.println("Hai digitato " + biglietto.getKm() + " chilometri.");
		System.out.println("Inserire l'età del passeggero: ");
		biglietto.setEta(scan.nextInt());
		System.out.println("Hai digitato " + biglietto.getEta() + " anni");
		System.out.println("Il costo del biglietto è: " + biglietto.calcolaPrezzo() + " euro");
		scan.close();
	}

}
