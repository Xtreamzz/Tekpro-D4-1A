package Exercise2;

public class Square extends Rectangle{
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String c, boolean f) {
		super(side, side);
		super.setColor(c);
		super.setFilled(f);
	}
	
	public void setSide(double side) {
		super.setLength(side);
        super.setWidth(side);
    }
	
	public double getSide() {
		return getLength();
	}
	
	@Override
	public String toString() {
		return "A Square with side="+ getSide() + ", which is a subclass of " + super.toString();
	}
	
	public double getArea() {
        return getSide()*getSide();
    }

    public double getPerimeter() {
        return 4*getSide();
    }
}
