public class CubeTester {
	
	public static void showEffectBoth(Object o1, Object o2) {
		// check if objects are equal
		if (o1.equals(o2)) {
			// print message
			System.out.println(o1 + " IS same same size as " + o2);
			// if objects are not equal
		} else {
			// print message
			System.out.println(o1 + " is NOT the same same size as " + o2);
		}
	}
	
	public static void main(String[] args) {
		// create rectangle object
		Rectangle rectangle1 = new Rectangle(12, 20);
		// create 2 box objects
		Box box1 = new Box(4, 4, 4);
		Box box2 = new Box(4, 12, 8);
		// create cube object
		Box box3 = new Cube(4, 4, 4);
		// create quadrilateral object
		Rectangle rectangle2 = new Parallelogram(12, 1);
		// create rectangular prism object
		Box box4 = new Prism(5, 6, 7);
		
		// print
		System.out.println("My shapes:\n");
		// print objects
		System.out.println(rectangle1);
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(rectangle2);
		System.out.println(box4);
		
		// test for equality
		System.out.println("\n\nTest for equality:\n");
		showEffectBoth(box1, box3);
		System.out.println();
		showEffectBoth(box2, box3);
	}
}