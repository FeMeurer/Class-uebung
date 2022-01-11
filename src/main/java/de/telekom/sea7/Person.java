package de.telekom.sea7;

// Wo bin ich?
public class Person { // public class Preis

	private int gebTag;
	private int gebMonat;
	private int gebJahr;
	private String vorname;
	private String nachname;
	private String geschlecht;
	private long steuerID;

	public Person(String vorname, String nachname, String geschlecht, int gebTag, int gebMonat, int gebJahr, long steuerID) {
		this.gebTag = gebTag;
		this.gebMonat = gebMonat;
		this.gebJahr = gebJahr;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geschlecht = geschlecht;
		this.steuerID = steuerID;
	}

	/*
 	public boolean equals(Person zweitePerson) {
		if (this.gebTag == zweitePerson.gebTag && this.gebMonat == zweitePerson.gebMonat
				&& this.gebJahr == zweitePerson.gebJahr && this.vorname.equals(zweitePerson.vorname)
				&& this.nachname.equals(zweitePerson.nachname) && this.geschlecht.equals(zweitePerson.geschlecht)) {
			return true;
		}
		else {
			return false;
		}

	}
	*/
	
 	public boolean equals(Person zweitePerson) {
		return this.steuerID == zweitePerson.steuerID;
 	}
 	
 	public boolean equals2(Person zweitePerson) {
		if (this.hashCode() == zweitePerson.hashCode()) {
			if (this.gebTag == zweitePerson.gebTag && this.gebMonat == zweitePerson.gebMonat
				&& this.gebJahr == zweitePerson.gebJahr) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
 	}
	
 	public int hashCode() {
 		return this.gebJahr + this.gebMonat + this.gebTag;
 	}
 	
	public String toString() {
		return "Es handelt sich um die Person: \nName:" + this.vorname + " " + this.nachname + "\nGeschlecht: " + this.geschlecht + "\nGeboren am: " + this.gebTag + "." + this.gebMonat + "." + this.gebJahr;
	}

	public void setVorname(/* Person this, */ String vorname) {
		if (vorname.length() > 1) {
			this.vorname = vorname;
		}
	}

	public String getVorname(/* Person this */) {
		return this.vorname;
	}
}