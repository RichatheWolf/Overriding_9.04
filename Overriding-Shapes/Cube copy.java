public class Cube extends Box {
	
	// Constructor for objects of class Cube
	public Cube(int l, int w, int h) {
		// call superclass
		super(l, w, h);
	}
	
	// String to display when object is printed.
	public String toString() {
		return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
	}
}