package de.telekom.sea7;

public class Punkt {
	private int x;
	private int y;
	
	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Punkt zweiterPunkt) {
		if (this.x == zweiterPunkt.x && this.y == zweiterPunkt.y) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() {
		return "Der Punkt befindet sich an Position X: " + this.x + ",Y: " + this.y;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
