package soal3;
/**
 * 
 * @author fadhil
 *
 */

public class KelasDua {
    {
        System.out.println(5); 
    }
    public static void main(String[] args) {
        System.out.println(6); 				//Ditampilkan di baris pertama 
        KelasSatu satu = new KelasSatu(); 	/*Memanggil constructor kelas 
        									satu tanpa parameter*/
        KelasSatu dua = new KelasSatu (10); /*Memanggil constructor kelas 
        									satu dengan parameter*/
    }
    
}