package Dependence;

public class IceCreamMain {
	public static void main (String[] args){
        Wadah w1 = new Wadah("Cone");
        Wadah w2 = new Wadah("Cup");

        Rasa r1 = new Rasa("Coklat");
        Rasa r2 = new Rasa("Vanilla");
        
        System.out.println("IceCream rasa "+ r1.getRasa() + " menggunakan wadah " + w1.getWadah());
        System.out.println("IceCream rasa "+ r2.getRasa() + " menggunakan wadah " + w2.getWadah());
    }
}
