public class Parallelogram extends Rectangle{
	
	// Constructor for objects of class Parallelogram
	public Parallelogram(int l, int w) {
		// call superclass
		super(l, w);
	}
	
	// String to display when object is printed.
	public String toString() {
		return "Parallelogram - " + getLength() + " X " + getWidth();
	}
}
