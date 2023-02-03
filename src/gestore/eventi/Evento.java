package gestore.eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Evento {
	static int code = 0;
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;
//	private int postiRichiesti;
	
	
	public Evento(int postiTotali) {
		super();
		this.titolo = "Default "+code;
		this.data = LocalDate.of(2023, 3, 2+code);
		this.postiTotali = postiTotali;
		this.postiPrenotati = 0;
		code =+1;
	}
	
//	da implementare exception e verifica tipo di dato
	
	public void Prenota (int postiRichiesti) {
		if (postiRichiesti > 0 | postiRichiesti <= postiTotali-postiPrenotati) {
			this.postiPrenotati = this.postiPrenotati+postiRichiesti;
			System.out.println("Prenotazione effettuata");
		}
		else {
			System.out.println("Operazione non riuscita");
		}
	}
	
	public void disdici (int postiCancellati) {
		if (postiCancellati > 0 | postiCancellati <= postiPrenotati) {
			this.postiPrenotati = this.postiPrenotati-postiCancellati;
			System.out.println("Prenotazione cancellata con successo");
		}
		else {
			System.out.println("Operazione non riuscita");
		}
	}
	
	@Override
	public String toString( ) {
//      return getClass().getName() + "@" + Integer.toHexString(hashCode());
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy").withLocale(Locale.ITALY);
		return data.format(df) + " - " + getTitolo();
	}

	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	
	

}
