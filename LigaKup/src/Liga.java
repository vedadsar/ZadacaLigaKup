public class Liga {
	private Tim[] timoviLige;
	private String imeLige;
	private int brojTimova;

	/**
	 * Konstruktor lige, parametar samo ime lige.
	 * 
	 * @param imeLige
	 */
	public Liga(String imeLige) {
		timoviLige = new Tim[8];
		brojTimova = 0;
	}

	/**
	 * Funkcija dodajTim nam omogucava da dodamo tim u ligu, ukoliko neko ubaci
	 * vise od 8 timova bacamo exeption. Kreiramo novi niz timova.
	 * 
	 * @param noviTim
	 */
	public void dodajTim(Tim noviTim) {
		if (brojTimova > 8)
			throw new ArrayIndexOutOfBoundsException("Liga mora imat 8 timova");

		timoviLige[brojTimova] = new Tim(noviTim);
		brojTimova++;

	}

	/**
	 * Funkcija nam omogucava da izbacimo jedan tim i promjenimo velicinu lige.
	 * Koristit cemo ga u main funkciji da izbacimo tim koji je izgubio.
	 * 
	 * @param nekiTim
	 */
	public void izbaciTim(Tim nekiTim) {

		for (int i = 0; i < brojTimova; i++) {
			if (timoviLige[i].equals(nekiTim)) {
				for (int j = i; j < brojTimova - 1; j++) {
					timoviLige[j] = timoviLige[j + 1];
				}
				timoviLige[brojTimova - 1] = null;
				brojTimova--;
			}
		}
	}

	/**
	 * get metoda nam vraca broj timova lige
	 * 
	 * @return
	 */
	public int getBrojTimova() {
		return brojTimova;
	}

	/**
	 * set metoda za broj timova
	 * 
	 * @param brojTimova
	 */
	public void setBrojTimova(int brojTimova) {
		this.brojTimova = brojTimova;
	}

	/**
	 * getTim metodom uzimamo jedan tim iz niza timova.
	 * 
	 * @param redniBroj
	 * @return
	 */
	public Tim getTim(int redniBroj) {
		return timoviLige[redniBroj];
	}

	/**
	 * ToString metoda koju koristimo za ispis timova lige.
	 */
	public String toString() {
		String ligaToString = "";
		for (int i = 0; i < brojTimova; i++) {
			ligaToString += timoviLige[i].getImeTima();
			ligaToString += "\n";
		}
		return ligaToString;
	}
}
