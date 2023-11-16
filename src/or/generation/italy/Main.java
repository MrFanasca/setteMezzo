package or.generation.italy;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			// Scrivere un programma che simula il gioco "7 e 1/2"
			// Funzionamento:
			// -1 il programma all'avvio genera il mazzo di carte (da 1 a 10 di bastoni, da 1 a 10 di denari, ecc.) (primo commit)
			// -2 il programma estrae dal mazzo una carta a caso (usare random) e mostrarla all'utente              (secondo commit)
			// -3 il programma visualizza il punteggio ottenuto fino a quel momento (le carte da 1 a 7 valgono 
			//    "quanto la carta", mentre le "figure" valgono 1/2 punto)                                          (terzo commit)
			// -4 se il punteggio dell'utente non ha superato 7 1/2, chiedere se si vuole estrarre un altra  carta,
			//    altrimenti mostrare un messaggio "hai sballato" 													(quarto commit)
		
		Scanner sc = new Scanner (System.in);
		Random r = new Random();
		
		int carta;
		HashSet <Integer> mazzo = new HashSet <>();
		
		for (int i=0; i<40; i++)
		{
			carta=r.nextInt(40) +1;
			
			if (mazzo.contains(carta)==false)
				mazzo.add(carta);
			else
				i--;
		}
////////////////////////////////////////////////////////////////////
		
		sc.close();
	}

}