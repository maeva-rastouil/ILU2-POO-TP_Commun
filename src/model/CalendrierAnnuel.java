package model;

//Class englobante
public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	private CalendrierAnnuel() {
		calendrier = new Mois[12];
		calendrier[0] = new Mois("Janvier", 31);
		calendrier[1] = new Mois("Février", 28);
		calendrier[2] = new Mois("Mars", 31);
		calendrier[3] = new Mois("Avril", 30);
		calendrier[4] = new Mois("Mai", 31);
		calendrier[5] = new Mois("Juin", 30);
		calendrier[6] = new Mois("Juillet", 31);
		calendrier[7] = new Mois("Aout", 31);
		calendrier[8] = new Mois("Septembre", 30);
		calendrier[9] = new Mois("Octobre", 31);
		calendrier[10] = new Mois("Novembre", 30);
		calendrier[11] = new Mois("Décembre", 31);	
	}
	
	public boolean estLibre(int jour, int mois) {
		return false;
	}
	
	public boolean reserver(int jour, int mois) {
		if (!estLibre.jours[mois]) {
			return false;
		}
		return true;
	}
	
	//Class intern
	public class Mois {
		private String nom;
		private boolean jours[];
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours]; //on initialise le nombre de jours en fonction du mois
			for(int i=0; i<nbJours; i++) {
				jours[i] = true;
			}
		}
		
		public boolean estlibre(int jour, int mois) {
			return false;
		}
		
		public boolean reserver(int jour, int mois) {
			return true;
		}	
	}

}
