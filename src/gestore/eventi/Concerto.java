package gestore.eventi;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Concerto extends Evento {
	
	LocalTime orario;
	BigDecimal prezzo;
	
	public Concerto(int postiTotali, LocalTime orario, BigDecimal prezzo) {
		super(postiTotali);
		this.orario = orario;
		this.prezzo = prezzo;
	}

	@Override
	public String toString( ) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy").withLocale(Locale.ITALY);
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm").withLocale(Locale.ITALY);
		return getData().format(df) + " - " + getOrario().format(tf) + " - " + getTitolo();
	}
	
	public LocalTime getOrario() {
		return orario;
	}

	public void setOrario(LocalTime orario) {
		this.orario = orario;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
	
}
