package mycubetimer.cubies;

public abstract class Cubie {
	// This is the superclass.
	// Included to show inheritance and polymorphism.

	protected int[] coords;
	protected String color;
	// To store colors:
	// I will use 'Color' cubies

	public void moveTo(int[] coords) {
		this.coords = coords;
	}

	public int[] getCoords() {
		return this.coords;
	}

	public void testCoords() {
		System.out.println("(" + this.coords[0] + "," + this.coords[1] + "," + this.coords[2] + ")");
	}

	public String getColor() {
		return this.color;
	}

}
