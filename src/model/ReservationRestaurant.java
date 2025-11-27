package model;

public class ReservationRestaurant extends Reservation {
	private int numero_service;
	private int numero_table;
	
	public ReservationRestaurant(int jour, int mois, int numero_service, int numero_table) {
		super(jour, mois);
		this.numero_service= numero_service;
		this.numero_table = numero_table;
	}
	
	public String toString(int jour, int mois, int numero_service, int numero_table) {
		String phrase;
		if(numero_service == 1) {
			phrase = "Le " + getJour() + "/" + getMois() + "\nTable " + numero_table + " pour le premier service.";
		}
		else {
			phrase = "Le " + getJour() + "/" + getMois() + "\\nTable " + numero_table + " pour le deuxième service.";
		}
		return phrase;
	}
}
