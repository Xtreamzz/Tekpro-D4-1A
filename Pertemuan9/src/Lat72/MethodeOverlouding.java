package Lat72;

class MethodeOverlouding{
	public static void main(String args[]) {
		Overloud obj = new Overloud();
		double result;
		obj.demo(10);
		obj.demo(10, 20);
		result = obj.demo(5.5);
		System.out.println("O/P : "+result);
	}
}