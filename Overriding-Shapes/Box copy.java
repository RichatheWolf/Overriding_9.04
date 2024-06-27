public class Box extends Rectangle{
	// instance variables
	private int height;
	
	// Constructor for objects of class Box
	public Box(int l, int w, int h){
		// call superclass
		super(l, w);
		// initialize instance variables
		height = h;
	}
	
	public int getHeight(){
		return height;
	}
	
	@Override
	public String toString(){
		return "Box - " + getLength() + " X " + getWidth() + " X " + height;
	}
	
}