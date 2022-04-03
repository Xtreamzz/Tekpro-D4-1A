package Exercise2;

public class Circle extends Shape{
	private double radius;
	
	public Circle() { // 1st (default) constructor
		 radius = 1.0;
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public Circle(double r, String c, boolean f) {
		radius = r;
		super.setColor(c);
		super.setFilled(f);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return (2*Math.PI*this.radius);
	}
	
	@Override
	public String toString() {
		return "A Circle with radius=" + radius + ", which is a subclass of " 
				+ super.toString(); 
	}
}
