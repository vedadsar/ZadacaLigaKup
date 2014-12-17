public class Igrac {
	private String ime;
	private String prezime;
	private int brojDresa;
	private Ocjene ocjeneIgraca;
/**
 	* Konstruktor za igraca sa nekim varijablama i proslijedjenim ocjenama ( kada ocjene imamo vec napravljene)
 * @param ime = ime igraca
 * @param prezime = prezime igraca
 * @param brojDresa = broj dresa igraca
 * @param ocjeneIgraca = ocjene igraca
 */
	public Igrac(String ime, String prezime, int brojDresa, Ocjene ocjeneIgraca) {

		setIme(ime);
		setPrezime(prezime);
		setBrojDresa(brojDresa);
		this.ocjeneIgraca = ocjeneIgraca;

	}
/**
 	* Konstruktor kopija za igraca. Ukoliko zelimo odmah da proslijedimo vec napravljenog igraca, da ne moramo pisati sve parametre.
 * @param other
 */
	public Igrac(Igrac other){
	this.ime = other.ime;
	this.prezime=other.prezime;
	this.brojDresa=other.brojDresa;
	this.ocjeneIgraca=other.ocjeneIgraca;
}
	/**
	 * Konstuktor koji cu najvise koristiti, direktno unosim sve parametre i ocjene.
	 * @param ime ime igraca
	 * @param prezime igraca
	 * @param brojDresa =broj dresa igraca
	 * @param ocjenaBrzina = ocjena brzine igraca
	 * @param ocjenaDodavanje = ocjena brzine dodavanja igraca
	 * @param ocjenaSut = ocjena suta igraca
	 * @param ocjenaSutGlavom = ocjena suta glavom igraca
	 */
	public Igrac(String ime, String prezime, int brojDresa,
			double ocjenaBrzina, double ocjenaDodavanje, double ocjenaSut,
			double ocjenaSutGlavom) {

		this.ime = ime;
		this.prezime = prezime;
		this.brojDresa = brojDresa;
		// Postavljanje
		this.ocjeneIgraca = new Ocjene(ocjenaBrzina, ocjenaDodavanje, ocjenaSut, ocjenaSutGlavom);
	}

	/**
	 * @return  ime
	 */
	public String getIme() {
		return ime;
	}

	/**
	 * @param ime, seter za ime
	 */
	public void setIme(String ime) {
		if (ime.length() < 1)
			throw new IllegalArgumentException("Neispravno ime");
		this.ime = ime;
	}

	/**
	 * @return  prezime
	 */
	public String getPrezime() {
		return prezime;
	}

	/**
	 * @param prezime, setter za prezime
	 */
	public void setPrezime(String prezime) {
		if (prezime.length() < 1)
			throw new IllegalArgumentException("Neispravno prezime");
		this.prezime = prezime;
	}

	/**
	 * @return getter za brojDresa
	 */
	public int getBrojDresa() {
		return brojDresa;
	}

	/**
	 * setter za broj dresa.
	 * @param brojDresa
	 */
	public void setBrojDresa(int brojDresa) {
		if (brojDresa < 0 || brojDresa > 99)
			throw new IllegalArgumentException("Neispravan broj dresa");
		this.brojDresa = brojDresa;
	}

	/**
	 * @return  ocjeneIgraca
	 */
	public Ocjene getOcjeneIgraca() {
		return ocjeneIgraca;
	}

	/**
	 * Setter funkcija za ocjene igraca, kada proslijedimo ocjene
	 * @param ocjeneIgraca
	 */
	public void setOcjeneIgraca(Ocjene ocjeneIgraca) {
		this.ocjeneIgraca = ocjeneIgraca;
	}

	/**
	 * toString metoda
	 */
	public String toString() {
		String igracToString = "Ime: " + ime + "\nPrezime: " + prezime
				+ "\nBrojDresa: " + brojDresa + "\nOcjeneIgraca: \n "
				+ ocjeneIgraca.toString() + "\n";
		return igracToString;
	}
/**
 	* Equals metoda za igrace.
 * @param other
 * @return
 */
	public boolean equals(Igrac other){
	if (this.ime.equals(other.ime) && this.prezime.equals(other.prezime) && this.brojDresa == other.brojDresa && this.ocjeneIgraca.equals(other.ocjeneIgraca))
	    return true;
	return false;
	}
	
	
}
