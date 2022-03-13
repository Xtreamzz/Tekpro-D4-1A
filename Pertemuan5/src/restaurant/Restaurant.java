package restaurant;
import java.util.Scanner;
public class Restaurant {
	public String[] nama_makanan;
	public double[] harga_makanan;
	public int[] stok;
	public static byte id=1;
	
	public Restaurant() {
	nama_makanan = new String[10];
	harga_makanan = new double[10];
	stok = new int[10];
	
	}

	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.nama_makanan[id] = nama;
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
	}
	
	public void pemesanan() {
		int no;
		int jumlah;
		int i=1;
		while(i == 1) {
			Scanner m= new Scanner(System.in);
			
			System.out.print("Nomer Menu: ");
			no = m.nextInt();
			System.out.print("Jumlah: ");
			jumlah = m.nextInt();
			penguranganStok(no,jumlah);
			System.out.println();
			tampilMenuMakanan();
			System.out.println("Apakah ingin memesan lagi?(1/0)");
			System.out.println("(1 = ya, 0 = tidak)");
			i = m.nextInt();
		}
		if(i==0) {
			System.out.println("Silahkan Tunggu");
		}
	}

	public void penguranganStok(int no, int stok) {
		this.stok[no] -= stok;
	}
	
	public void tampilMenuMakanan(){
		System.out.println("No Menu[stok]   Harga");
		System.out.println("----------------------------");
		for(int i =1; i<=id;i++){
			if(!isOutOfStock(i)){
				
				System.out.println(i+" "+nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
			}
		}
	}

	public boolean isOutOfStock(int id){
		if(stok[id] == 0){
			return true;
		}else{
			return false;
		}
	}
	public static void nextId(){
		id++;
	}
}

