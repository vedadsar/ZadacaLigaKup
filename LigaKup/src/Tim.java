

public class Tim {

	private String imeTima;
	private Igrac[] timIgraca;
	private Osoba[] osobljeTima;
	private int brojIgraca;
	private int brojOsoba;
	private double koeficijentSrece;

	public Tim(String ime) {
		this.imeTima = ime;
		timIgraca = new Igrac[11];
		osobljeTima = new Osoba[1];
		brojIgraca = 0;
		brojOsoba = 0;
	}

	public Tim(Tim other) {
		this.imeTima = other.imeTima;
		this.timIgraca = other.timIgraca;
		this.osobljeTima = other.osobljeTima;
		this.brojIgraca = other.brojIgraca;
		this.brojOsoba = other.brojOsoba;
	}

	/**
	 * Funkcija dodajIgraca koja prima proslijedjenog igraca.
	 * 
	 * @param noviIgrac
	 */
	public void dodajIgraca(Igrac noviIgrac) {

		timIgraca[brojIgraca] = new Igrac(noviIgrac);
		brojIgraca++;

		if (brojIgraca > 11) {
			throw new ArrayIndexOutOfBoundsException("max. broj igraca je 11");

		}
	}

	public double getKoeficijentSrece() {
		double minKoef = Math.random() * 4; // Minimalni koeficijent srece
		double maxKoef = 7 + Math.random() * (10 - 7 + 1);

		double koeficijent = maxKoef - minKoef;

		double koeficijentTima = 0;
		for (int i = 0; i < timIgraca.length; i++) {
			koeficijentTima += timIgraca[i].getOcjeneIgraca().getSumaOcjena()
					* koeficijent;
		}

		return koeficijentTima;
	}

	public String getImeTima() {
		return imeTima;
	}

	public void setImeTima(String imeTima) {
		this.imeTima = imeTima;
	}

	/**
	 * dodajIgraca funkcija koja prima sve parametre, kreira novog igraca i
	 * dodaje ga u niz.
	 * 
	 * @param ime
	 * @param prezime
	 * @param brojDresa
	 * @param ocjenaBrzina
	 * @param ocjenaDodavanje
	 * @param ocjenaSut
	 * @param ocjenaSutGlavom
	 */
	public void dodajIgraca(String ime, String prezime, int brojDresa,
			double ocjenaBrzina, double ocjenaDodavanje, double ocjenaSut,
			double ocjenaSutGlavom) {

		timIgraca[brojIgraca] = new Igrac(ime, prezime, brojDresa,
				ocjenaBrzina, ocjenaDodavanje, ocjenaSut, ocjenaSutGlavom);
		brojIgraca++;

		if (brojIgraca > 11) {
			throw new ArrayIndexOutOfBoundsException("max. broj igraca je 11");

		}
	}

	/**
	 * 
	 * Funkcija dodaje osoblje tima.
	 * 
	 * @param ime
	 * @param prezime
	 * @param email
	 * @param funkcija
	 */
	public void dodajOsobu(String ime, String prezime, String email,
			String funkcija) {

		osobljeTima[brojOsoba] = new Osoba(ime, prezime, email, funkcija);
		brojOsoba++;

		if (brojOsoba == osobljeTima.length) {
			resizeOsobljeTime();

		}
	}

	private void resizeOsobljeTime() {
		int newLenght = 2 * osobljeTima.length;
		Osoba[] temp = new Osoba[newLenght];

		for (int i = 0; i < osobljeTima.length; i++) {
			temp[i] = osobljeTima[i];

		}

		osobljeTima = temp;

	}

	/**
	 * 
	 * To String metoda, za kompletan tim.
	 */
	public String toString() {
		String timToString = "";
		System.out.println("Tim " + imeTima + " ima sljedece igrace i osoblje");
		for (int i = 0; i < brojIgraca; i++) {
			timToString += timIgraca[i].toString();
		}

		for (int i = 0; i < brojOsoba; i++) {
			timToString += osobljeTima[i].toString();
		}
		return timToString;
	}

	/**
	 * Equals metoda za niz igraca.
	 * 
	 * @param other
	 * @return
	 */

	public boolean equals(Tim other) {
		if (this.imeTima.equals(other.imeTima)) {
			return true;
		}
		return false;
	}
}
