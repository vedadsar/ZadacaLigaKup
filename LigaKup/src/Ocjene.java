public class Ocjene {
	private double brzina;
	private double dodavanje;
	private double sut;
	private double sutGlavom;

	/**
	 * Konstruktor ocjena igraca.
	 * @param brzina = brzina igraca
	 * @param dodavanje = brzina dodavanja igraca
	 * @param sut = sut igraca
	 * @param sutGlavom = sut igraca glavom
	 */
	public Ocjene(double brzina, double dodavanje, double sut, double sutGlavom) {
		setBrzina(brzina);
		setDodavanje(dodavanje);
		setSut(sutGlavom);
		setSutGlavom(sutGlavom);
	}

/**
 * getSumaOcjena vraca sumu svih ocjena jednog igraca. Koristimo je kasnije za izracunavanje koeficijenta tima.
 * @return
 */
	public double getSumaOcjena (){
		double sumaOcjena;
		sumaOcjena = this.brzina + this.dodavanje + this.sut+ this.sutGlavom;
		return sumaOcjena;
	}
	
	/**
	 * @return  brzina
	 */
	public double getBrzina() {
		return brzina;
	}


	/**
	 * @param  setter za brzinu
	 */
	public void setBrzina(double brzina) {
		if(brzina>100 || brzina<0)
			throw new IllegalArgumentException("Ocjena nije u rangu 0-100");
		
		this.brzina = brzina;
	}


	/**
	 * @return  dodavanje
	 */
	public double getDodavanje() {
		return dodavanje;
	}


	/**
	 * @param setter za dodavanje
	 */
	public void setDodavanje(double dodavanje) {
		if(dodavanje>100 || dodavanje<0)
			throw new IllegalArgumentException("Ocjena nije u rangu 0-100");
		
		this.dodavanje = dodavanje;
	}


	/**
	 * @return  sut
	 */
	public double getSut() {
		return sut;
	}


	/**
	 * @param setter za sut
	 */
	public void setSut(double sut) {
		if(sut>100 || sut<0)
			throw new IllegalArgumentException("Ocjena nije u rangu 0-100");
		
		this.sut = sut;
	}


	/**
	 * @return sut glavom
	 */
	public double getSutGlavom() {
		return sutGlavom;
	}


	/**
	 * @param setter za sut glavom
	 */
	public void setSutGlavom(double sutGlavom) {
		if(sutGlavom>100 || sutGlavom<0)
			throw new IllegalArgumentException("Ocjena nije u rangu 0-100");
		
		this.sutGlavom = sutGlavom;
	}


	/**
	 * To string metoda. ( koristimo je da bi ispisali objekat)
	 */
	public String toString() {
		
		String ispisOcjena =  "\tBrzina: " + brzina + "\n\tDodavanje: " + dodavanje
				+ "\n\tSut: " + sut + "\n\tSutGlavom: " + sutGlavom + "\n";
		return ispisOcjena;
	}
	
	/**
	 * Equals metoda. Provjerava da li su dvije ocjene jednake.
	 * @param other
	 * @return
	 */
public boolean equals(Ocjene other){
	if(this.brzina == other.brzina && this.dodavanje == other.dodavanje && this.sut==other.sut && this.sutGlavom==other.sutGlavom)
		return true;
	return false;
}

}
