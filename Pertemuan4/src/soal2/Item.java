package soal2;
/**
 * 
 * @author fadhil
 *
 */

public class Item {
	private String name;
	private Item() {
		name = "Ipin";
	}
	public Item(String name) {
		System.out.println(this.name = new Item().name);
	}
}
