package gestore.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		String userInput;
		int yyyy;
		int mm;
		int gg;
		LocalDate d;
		
		Scanner scan = new Scanner(System.in);
//		userInput = scan.nextLine();

		System.out.println("Stai creando un nuovo evento.");
		System.out.println("inserire il numero di posti disponibili all'evento: ");
		Evento test1 = new Evento(scan.nextInt());
		scan.nextLine();  // elimima il salto
		
		System.out.println("inserire nome evento: ");
		test1.setTitolo(scan.nextLine());
		
//		DateTimeException
		
		System.out.println("inserire l'anno dell'evento (yyyy): ");
		yyyy = scan.nextInt();
		
		System.out.println("inserire il mese dell'evento (mm): ");
		mm = scan.nextInt();

		System.out.println("inserire il giorno dell'evento (gg): ");
		gg = scan.nextInt();
		
		d = LocalDate.of(yyyy, gg, mm);
		try {
			if (yyyy < 2023) {
				System.out.println("L'anno non è corretto. ");
		}
		else if (0 > mm | mm > 12) {
			System.out.println("Il mese non è corretto. ");
		}
		else if (gg > 31) {
			System.out.println("Il mese non è corretto. ");
		}
			test1.setData(d);			
		} catch (Exception e) {
			System.out.println("Errore sulla data. " +e.getMessage());
			System.out.println("Verrà inserita la data odierna.");
		}
		
		System.out.println("Nuovo evento "+ test1.toString());
		
		
		scan.close();
	}

}
