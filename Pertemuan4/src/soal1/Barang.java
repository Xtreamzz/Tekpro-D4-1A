package soal1;
/**
 * 
 * @author fadhil
 *
 */

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	public int getStok() {
		return this.stok;
	}
	
	public void setStok(int stk) {
		this.stok += stk;
	}
	
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}
}