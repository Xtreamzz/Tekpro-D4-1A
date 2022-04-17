package com.A4.Mahasiswa.Model;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//membuat class menjadi Entity 
@Entity  
//Mendefinisikan class menjadi table
@Table  
public class Mahasiswa  
{  
//mendefinisikan id sebagai primary key
@Id  
@Column  
private int NIM;  
@Column  
private String Nama;  
@Column  
private int Kelas;  
@Column  
private String Gender;  
public int getNIM()   
{  
return NIM;  
}  
public void setNIM(int NIM)   
{  
this.NIM = NIM;  
}  
public String getNama()  
{  
return Nama;  
}  
public void setNama(String Nama)   
{  
this.Nama = Nama;  
}  
public int getKelas()   
{  
return Kelas;  
}  
public void setKelas(int Kelas)   
{  
this.Kelas = Kelas;  
}  
public String getGender()   
{  
return Gender;  
}  
public void setGender(String Gender)   
{  
this.Gender = Gender;  
}  
}  