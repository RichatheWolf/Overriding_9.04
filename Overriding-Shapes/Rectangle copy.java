public class Rectangle{
	// instance variables
	private int length;
	private int width;
	
	// Constructor for objects of class Rectangle
	public Rectangle(int l, int w) {
// initialize instance variables
		length = l;
		width = w;
	}
	
	// return the height
	public int getLength() {
		return length;
	}
	
	// return the width
	public int getWidth() {
		return width;
	}

// String to display when object is printed.
	
	public String toString() {
		return "Rectangle - " + length + " X " + width;
	}
	
	// equals method to check two object's dimensions equal
	@Override
	public boolean equals(Object obj) {
		// check if object is null
		if (obj == null)
			// return false
			return false;
		// cast object to Ractangle4
		Rectangle other = (Rectangle) obj;
		// check if length is not equal
		if (length != other.length)
			// return false
			return false;
		// check if width is not equal
		if (width != other.width)
			// return false
			return false;
		// if length and width are equal return true
		return true;
	}
	
}