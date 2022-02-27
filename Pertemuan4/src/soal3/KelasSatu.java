package soal3;
/**
 * 
 * @author fadhil
 *
 */

public class KelasSatu {
    {
        System.out.println(11);	//Ditampilkan setiap KelasSatu dipanggil
    }
    
    static
    {
        System.out.println(2);	/*Ditampilkan di awal ketika constructor 
        						Kelas Satu tanpa parameter dipanggil*/
    }
    
    public KelasSatu(int i)		//Constructor dengan parameter
    {
        System.out.println(3); 	/*Ditampilkan ketika constuctor dengan 
        						parameter dipanggil*/
    }
    public KelasSatu() 			//Constructor tanpa parameter
    {
        System.out.println(4); 	/*Ditampilkan ketika constuctor tanpa 
        						parameter dipanggil*/
    }
}