package Lat71;

public class Cat extends Animal{
	@Override
	public void sound() {
		super.sound();
		System.out.println("Meow");
	}
	public static void main(String args[]) {
		Animal obj = new Cat();
		obj.sound();
	}

}
