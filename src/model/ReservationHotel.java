package model;

public class ReservationHotel extends Reservation{
	private int nombre_lit_simple;
	private int nombre_lit_double;
	private int numero_chambre;
	
	public ReservationHotel(int jour, int mois, int nombre_lit_simple, int nombre_lit_double, int numero_chambre) {
		super(jour, mois);
		this.nombre_lit_simple = nombre_lit_simple;
		this.nombre_lit_double = nombre_lit_double;
		this.numero_chambre = numero_chambre;
	}
}
