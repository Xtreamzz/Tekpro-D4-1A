package Assosiation;
import java.util.*;

public class MainProgram {
	public static void main(String[] args) {
		Jurusan jurusan = new Jurusan();
		jurusan.setJurusan("Teknik Komputer dan Informatika ");
		
		Mahasiswa nama = new Mahasiswa();
		nama.setMahasiswa("Fadhil");
		Mahasiswa nama2 = new Mahasiswa();
		nama2.setMahasiswa("Zacky");
		Mahasiswa nama3 = new Mahasiswa();
		nama3.setMahasiswa("Cintia");
		Mahasiswa nama4 = new Mahasiswa();
		nama4.setMahasiswa("Yane");
		Mahasiswa nama5 = new Mahasiswa();
		nama5.setMahasiswa("Yayang");
		
		List<Mahasiswa> empList = new ArrayList<Mahasiswa>();
		empList.add(nama);
		empList.add(nama2);
		empList.add(nama3);
		empList.add(nama4);
		empList.add(nama5);
		
		jurusan.setMhSsw(empList);
		
		System.out.println(jurusan.getMhSsw()+" adalah Mahasiswa di jurusan "+jurusan.getJurusan());
	}
}
