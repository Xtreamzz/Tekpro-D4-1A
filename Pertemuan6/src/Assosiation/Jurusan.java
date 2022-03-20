package Assosiation;
import java.util.*;

public class Jurusan {
	private String jurusan;
	
	List<Mahasiswa> MhSsw;
	
	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public List<Mahasiswa> getMhSsw() {
		return MhSsw;
	}

	public void setMhSsw(List<Mahasiswa> MhSsw) {
		this.MhSsw = MhSsw;
	}
}
