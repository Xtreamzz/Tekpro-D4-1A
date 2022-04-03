package Exercise2;

public class Test {
	public static void main (String[] args) {
		Shape s1 = new Shape();
		System.out.println("Shape:"
		+ " color= " + s1.getColor()
		+ " filled= " + s1.isFilled());
		System.out.println(s1.toString());
		
		Shape s2 = new Shape("Red", false);
		System.out.println("Shape:"
		+ " color= " + s2.getColor()
		+ " filled= " + s2.isFilled());
		System.out.println(s2.toString());
		
		Circle c1 = new Circle();
		System.out.println("Circle:"
		+ " radius= "+ c1.getRadius()
		+ " color= " + c1.getColor()
		+ " filled= " + c1.isFilled());
		System.out.println("        area= " + c1.getArea()
		+ " perimeter= " + c1.getPerimeter());
		System.out.println(c1.toString());
		
		Rectangle r1 = new Rectangle(2, 4);
		System.out.println("Rectangle:"
				+ " width= "+ r1.getWidth()
				+ " length= "+ r1.getLength()
				+ " color= " + r1.getColor()
				+ " filled= " + r1.isFilled());
		System.out.println("           area= " + r1.getArea()
		+ " perimeter= " + r1.getPerimeter());
		System.out.println(r1.toString());
		
		Square q1 = new Square(2);
		System.out.println("Square:"
				+ " side= "+q1.getSide()
				+ " color= " + q1.getColor()
				+ " filled= " + q1.isFilled());
		System.out.println("        area= " + q1.getArea()
		+ " perimeter= " + q1.getPerimeter());
		System.out.println(q1.toString());
	}
}
