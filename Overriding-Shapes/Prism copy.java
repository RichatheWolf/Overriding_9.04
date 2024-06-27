public class Prism extends Box{
	
	// Constructor for objects of class Parallelogram
	public Prism(int l, int w, int h) {
		// call superclass
		super(l, w, h);
	}
	
	// String to display when object is printed.
	public String toString() {
		return "Prism - " + getLength() + " X " + getWidth() + " X " + getHeight();
	}
}