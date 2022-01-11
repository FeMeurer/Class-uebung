package de.telekom.sea7;

// Wo bin ich?
public class Person { // public class Preis

	private int gebTag;
	private int gebMonat;
	private int gebJahr;
	private String vorname;
	private String nachname;
	private String geschlecht;

	public Person(String vorname, String nachname, String geschlecht, int gebTag, int gebMonat, int gebJahr) {
		this.gebTag = gebTag;
		this.gebMonat = gebMonat;
		this.gebJahr = gebJahr;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geschlecht = geschlecht;
	}

	public boolean equals(Person zweitePerson) {
		if (this.gebTag == zweitePerson.gebTag && this.gebMonat == zweitePerson.gebMonat
				&& this.gebJahr == zweitePerson.gebJahr && this.vorname == zweitePerson.vorname
				&& this.nachname == zweitePerson.nachname && this.geschlecht == zweitePerson.geschlecht) {
			return true;
		}
		else {
			return false;
		}

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