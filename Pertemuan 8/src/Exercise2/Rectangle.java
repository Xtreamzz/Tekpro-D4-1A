package Exercise2;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle() { // 1st (default) constructor
		 width = 1.0;
		 length = 1.0;
	}
	
	public Rectangle(double w, double l) {
		width = w;
		 length = l;
	}
	
	public Rectangle(double w, double l, String c, boolean f) {
		width = w;
		length = l;
		super.setColor(c);
		super.setFilled(f);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return (this.length*this.width);
	}
	
	public double getPerimeter() {
		return (2*(this.length+this.width));
	}
	
	@Override
	public String toString() {
		return "A Rectangle with width=" + width 
				+ " and length=" + length
				+ ", which is a subclass of "
				+ super.toString(); 
	}
}
