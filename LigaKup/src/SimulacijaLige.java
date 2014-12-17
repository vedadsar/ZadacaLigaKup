import java.io.ObjectInputStream.GetField;

public class SimulacijaLige {
/**
 	* void funkcija u kojoj kreiramo timove nase lige.
 * @return
 */
	public static Liga kreirajLigu() {

		Liga nasaLiga = new Liga("Nasa liga");

		Tim sarajevo = new Tim("FK Sarajevo");// tim1
		sarajevo.dodajIgraca("Dejan", "Bandovic", 78, 55, 96, 69, 88);
		sarajevo.dodajIgraca("Emir", "Plakalo",99, 85, 76, 69, 88);
		sarajevo.dodajIgraca("Nemanja", "Bilbija", 95, 85, 76, 69, 88);
		sarajevo.dodajIgraca("Saban", "Saulic", 99, 99, 76, 69, 94);
		sarajevo.dodajIgraca("John", "Wayne", 60, 97, 99, 88, 98);
		sarajevo.dodajIgraca("Chuck", "Noris", 99, 99, 99,99, 99);
		sarajevo.dodajIgraca("Terminator", "KoFol", 86, 65, 54, 74, 84);
		sarajevo.dodajIgraca("Leo", "Messi", 56, 85, 85, 56, 66);
		sarajevo.dodajIgraca("NestajeMi", "Imena", 95, 85, 56, 68, 89);
		sarajevo.dodajIgraca("Yaya", "Toure", 85, 85, 76, 85, 88);
		sarajevo.dodajIgraca("Hikmet", "Durgutovic", 78, 92, 76, 99, 88);

		sarajevo.dodajOsobu("Vedad", "Zornic", "vedad.zornic@bitcamp.ba",
				"selektor");
		sarajevo.dodajOsobu("Husref", "Musemic", "husref.brat.nas@bitcamp.ba",
				"fizioterapetut");
		sarajevo.dodajOsobu("Neznam", "Ime", "ime.neznam@bitcamp.ba",
				"vlasnik");

		nasaLiga.dodajTim(sarajevo);

		Tim zeljeznicar = new Tim("FK Zeljeznicar");// tim2
		zeljeznicar.dodajIgraca("Dejan", "Bandovic", 78, 55, 96, 69, 88);
		zeljeznicar.dodajIgraca("Emir", "Plakalo",99, 85, 76, 69, 88);
		zeljeznicar.dodajIgraca("Nemanja", "Bilbija", 95, 85, 76, 69, 88);
		zeljeznicar.dodajIgraca("Saban", "Saulic", 77, 55, 76, 69, 94);
		zeljeznicar.dodajIgraca("John", "Wayne", 60, 97, 76, 88, 98);
		zeljeznicar.dodajIgraca("Chuck", "Noris", 99, 99, 99,99, 99);
		zeljeznicar.dodajIgraca("Terminator", "KoFol", 86, 65, 54, 74, 84);
		zeljeznicar.dodajIgraca("Leo", "Messi", 56, 85, 85, 56, 66);
		zeljeznicar.dodajIgraca("NestajeMi", "Imena", 67, 85, 56, 68, 89);
		zeljeznicar.dodajIgraca("Yaya", "Toure", 85, 85, 76, 69, 88);
		zeljeznicar.dodajIgraca("Hikmet", "Durgutovic", 78, 57, 76, 99, 88);

		zeljeznicar.dodajOsobu("Vedad", "Zornic", "vedad.zornic@bitcamp.ba",
				"selektor");
		zeljeznicar.dodajOsobu("Husref", "Musemic", "husref.brat.nas@bitcamp.ba",
				"fizioterapetut");
		zeljeznicar.dodajOsobu("Neznam", "Ime", "ime.neznam@bitcamp.ba",
				"vlasnik");
		
		nasaLiga.dodajTim(zeljeznicar);

		Tim olimpic = new Tim("FK Olimpic");// tim3
		olimpic.dodajIgraca("Dejan", "Bandovic", 78, 55, 96, 69, 88);
		olimpic.dodajIgraca("Emir", "Plakalo",99, 85, 76, 69, 88);
		olimpic.dodajIgraca("Nemanja", "Bilbija", 95, 85, 76, 69, 88);
		olimpic.dodajIgraca("Saban", "Saulic", 77, 55, 76, 69, 94);
		olimpic.dodajIgraca("John", "Wayne", 60, 97, 76, 88, 98);
		olimpic.dodajIgraca("Chuck", "Noris", 99, 99, 99,99, 99);
		olimpic.dodajIgraca("Terminator", "KoFol", 86, 65, 54, 74, 84);
		olimpic.dodajIgraca("Leo", "Messi", 56, 85, 85, 56, 66);
		olimpic.dodajIgraca("NestajeMi", "Imena", 67, 85, 56, 68, 89);
		olimpic.dodajIgraca("Yaya", "Toure", 85, 85, 76, 69, 88);
		olimpic.dodajIgraca("Hikmet", "Durgutovic", 78, 57, 76, 99, 88);

		olimpic.dodajOsobu("Vedad", "Zornic", "vedad.zornic@bitcamp.ba",
				"selektor");
		olimpic.dodajOsobu("Husref", "Musemic", "husref.brat.nas@bitcamp.ba",
				"fizioterapetut");
		olimpic.dodajOsobu("Neznam", "Ime", "ime.neznam@bitcamp.ba",
				"vlasnik");

		nasaLiga.dodajTim(olimpic);

		Tim siroki = new Tim("FK Siroki Brijeg");// tim4
		siroki.dodajIgraca("Dejan", "Bandovic", 78, 55, 96, 69, 88);
		siroki.dodajIgraca("Emir", "Plakalo",99, 85, 76, 69, 88);
		siroki.dodajIgraca("Nemanja", "Bilbija", 95, 85, 76, 69, 88);
		siroki.dodajIgraca("Saban", "Saulic", 77, 55, 76, 69, 94);
		siroki.dodajIgraca("John", "Wayne", 60, 97, 76, 88, 98);
		siroki.dodajIgraca("Chuck", "Noris", 99, 99, 99,99, 99);
		siroki.dodajIgraca("Terminator", "KoFol", 86, 65, 54, 74, 84);
		siroki.dodajIgraca("Leo", "Messi", 56, 85, 85, 56, 66);
		siroki.dodajIgraca("NestajeMi", "Imena", 67, 85, 56, 68, 89);
		siroki.dodajIgraca("Yaya", "Toure", 85, 85, 76, 69, 88);
		siroki.dodajIgraca("Hikmet", "Durgutovic", 78, 57, 76, 99, 88);

		siroki.dodajOsobu("Vedad", "Zornic", "vedad.zornic@bitcamp.ba",
				"selektor");
		siroki.dodajOsobu("Husref", "Musemic", "husref.brat.nas@bitcamp.ba",
				"fizioterapetut");
		siroki.dodajOsobu("Neznam", "Ime", "ime.neznam@bitcamp.ba",
				"vlasnik");


		nasaLiga.dodajTim(siroki);

		Tim velez = new Tim("FK Velez");// tim5
		velez.dodajIgraca("Dejan", "Bandovic", 78, 55, 96, 69, 88);
		velez.dodajIgraca("Emir", "Plakalo",99, 85, 76, 69, 88);
		velez.dodajIgraca("Nemanja", "Bilbija", 95, 85, 76, 69, 88);
		velez.dodajIgraca("Saban", "Saulic", 77, 55, 76, 69, 94);
		velez.dodajIgraca("John", "Wayne", 60, 97, 76, 88, 98);
		velez.dodajIgraca("Chuck", "Noris", 99, 99, 99,99, 99);
		velez.dodajIgraca("Terminator", "KoFol", 86, 65, 54, 74, 84);
		velez.dodajIgraca("Leo", "Messi", 56, 85, 85, 56, 66);
		velez.dodajIgraca("NestajeMi", "Imena", 67, 85, 56, 68, 89);
		velez.dodajIgraca("Yaya", "Toure", 85, 85, 76, 69, 88);
		velez.dodajIgraca("Hikmet", "Durgutovic", 78, 57, 76, 99, 88);

		velez.dodajOsobu("Vedad", "Zornic", "vedad.zornic@bitcamp.ba",
				"selektor");
		velez.dodajOsobu("Husref", "Musemic", "husref.brat.nas@bitcamp.ba",
				"fizioterapetut");
		velez.dodajOsobu("Neznam", "Ime", "ime.neznam@bitcamp.ba",
				"vlasnik");

		nasaLiga.dodajTim(velez);

		Tim brotnjo = new Tim("FK Brotnjo");// tim6
		brotnjo.dodajIgraca("Dejan", "Bandovic", 78, 55, 96, 69, 88);
		brotnjo.dodajIgraca("Emir", "Plakalo",99, 85, 76, 69, 88);
		brotnjo.dodajIgraca("Nemanja", "Bilbija", 95, 85, 76, 69, 88);
		brotnjo.dodajIgraca("Saban", "Saulic", 77, 55, 76, 69, 94);
		brotnjo.dodajIgraca("John", "Wayne", 60, 97, 76, 88, 98);
		brotnjo.dodajIgraca("Chuck", "Noris", 99, 99, 99,99, 99);
		brotnjo.dodajIgraca("Terminator", "KoFol", 86, 65, 54, 74, 84);
		brotnjo.dodajIgraca("Leo", "Messi", 56, 85, 85, 56, 66);
		brotnjo.dodajIgraca("NestajeMi", "Imena", 67, 85, 56, 68, 89);
		brotnjo.dodajIgraca("Yaya", "Toure", 85, 85, 76, 69, 88);
		brotnjo.dodajIgraca("Hikmet", "Durgutovic", 78, 57, 76, 99, 88);

		brotnjo.dodajOsobu("Vedad", "Zornic", "vedad.zornic@bitcamp.ba",
				"selektor");
		brotnjo.dodajOsobu("Husref", "Musemic", "husref.brat.nas@bitcamp.ba",
				"fizioterapetut");
		brotnjo.dodajOsobu("Neznam", "Ime", "ime.neznam@bitcamp.ba",
				"vlasnik");

		nasaLiga.dodajTim(brotnjo);

		Tim travnik = new Tim("FK Travnik");// tim7
		travnik.dodajIgraca("Dejan", "Bandovic", 78, 55, 96, 69, 88);
		travnik.dodajIgraca("Emir", "Plakalo",99, 85, 76, 69, 88);
		travnik.dodajIgraca("Nemanja", "Bilbija", 95, 85, 76, 69, 88);
		travnik.dodajIgraca("Saban", "Saulic", 77, 55, 76, 69, 94);
		travnik.dodajIgraca("John", "Wayne", 60, 97, 76, 88, 98);
		travnik.dodajIgraca("Chuck", "Noris", 99, 99, 99,99, 99);
		travnik.dodajIgraca("Terminator", "KoFol", 86, 65, 54, 74, 84);
		travnik.dodajIgraca("Leo", "Messi", 56, 85, 85, 56, 66);
		travnik.dodajIgraca("NestajeMi", "Imena", 67, 85, 56, 68, 89);
		travnik.dodajIgraca("Yaya", "Toure", 85, 85, 76, 69, 88);
		travnik.dodajIgraca("Hikmet", "Durgutovic", 78, 57, 76, 99, 88);

		travnik.dodajOsobu("Vedad", "Zornic", "vedad.zornic@bitcamp.ba",
				"selektor");
		travnik.dodajOsobu("Husref", "Musemic", "husref.brat.nas@bitcamp.ba",
				"fizioterapetut");
		travnik.dodajOsobu("Neznam", "Ime", "ime.neznam@bitcamp.ba",
				"vlasnik");

		nasaLiga.dodajTim(travnik);

		Tim borac = new Tim("FK Borac Banja Luka");// tim7
		borac.dodajIgraca("Dejan", "Bandovic", 78, 55, 96, 69, 88);
		borac.dodajIgraca("Emir", "Plakalo",99, 85, 76, 69, 88);
		borac.dodajIgraca("Nemanja", "Bilbija", 95, 85, 76, 69, 88);
		borac.dodajIgraca("Saban", "Saulic", 77, 55, 76, 69, 94);
		borac.dodajIgraca("John", "Wayne", 60, 97, 76, 88, 98);
		borac.dodajIgraca("Chuck", "Noris", 99, 99, 99,99, 99);
		borac.dodajIgraca("Terminator", "KoFol", 86, 65, 54, 74, 84);
		borac.dodajIgraca("Leo", "Messi", 56, 85, 85, 56, 66);
		borac.dodajIgraca("NestajeMi", "Imena", 67, 85, 56, 68, 89);
		borac.dodajIgraca("Yaya", "Toure", 85, 85, 76, 69, 88);
		borac.dodajIgraca("Hikmet", "Durgutovic", 78, 57, 76, 99, 88);

		borac.dodajOsobu("Vedad", "Zornic", "vedad.zornic@bitcamp.ba",
				"selektor");
		borac.dodajOsobu("Husref", "Musemic", "husref.brat.nas@bitcamp.ba",
				"fizioterapetut");
		borac.dodajOsobu("Neznam", "Ime", "ime.neznam@bitcamp.ba",
				"vlasnik");

		nasaLiga.dodajTim(borac);

		return nasaLiga;
	}
    /**
     * Funkcija vrsi simulaciju jedne utakmice
     * @param nasaLiga
     */
	public static void odigrajUtakmicu(Liga nasaLiga){
		
		int brojTimova = nasaLiga.getBrojTimova();
		
		double koeficijentDomacina = nasaLiga.getTim(0).getKoeficijentSrece(); // koeficijen domacina
		double koeficijentGosta = nasaLiga.getTim(brojTimova-1).getKoeficijentSrece(); // koeficijent gosta
		
		// biramo pobjednika i izbacujemo gubitnika iz lige.
		if(koeficijentDomacina>koeficijentGosta){
			nasaLiga.izbaciTim(nasaLiga.getTim(brojTimova-1));
		}else{
			nasaLiga.izbaciTim(nasaLiga.getTim(0));
		}
		// smanjujemo broj timova
		brojTimova--;
	}
	
	
	
	public static void main(String[] args) {
		for(int i = 0; i<50;i++){
	  Liga nasaLiga = kreirajLigu(); // Pozivamo funkciju koja kreira ligu
		  
	  
	  odigrajUtakmicu(nasaLiga); // Prvo kolo
	  odigrajUtakmicu(nasaLiga);//Drugo Kolo
	  odigrajUtakmicu(nasaLiga);// Trece Kolo
	  odigrajUtakmicu(nasaLiga);// Cetvrto kolo
	  odigrajUtakmicu(nasaLiga);// Peto kolo
	  odigrajUtakmicu(nasaLiga);// Sesto kolo
	  odigrajUtakmicu(nasaLiga);// Sedmo kolo
	  
	  System.out.println("Pobjednik nase lige je ");
	  System.out.println(nasaLiga.toString());
		}
	}
}
