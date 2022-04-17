package com.A4.Mahasiswa.Service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.A4.Mahasiswa.Model.Mahasiswa;  
import com.A4.Mahasiswa.Repositories.*;  

@Service  
public class MahasiswaService   
{  
@Autowired  
MahasiswaRepository MahasiswaRepository;  
//Mendapatkan semua record Mahasiswa dengan menggunakan metode findaAll() dari CrudRepository
public List<Mahasiswa> getAllMahasiswa()   
{  
List<Mahasiswa> Mahasiswa = new ArrayList<Mahasiswa>();  
MahasiswaRepository.findAll().forEach(Mahasiswa1 -> Mahasiswa.add(Mahasiswa1));  
return Mahasiswa;  
}  
//mendapatkan record tertentu dengan menggunakan metode findById() dari CrudRepository  
public Mahasiswa getMahasiswaById(int id)   
{  
return MahasiswaRepository.findById(id).get();  
}  
//menyimpan record tertentu dengan menggunakan metode save() dari CrudRepository  
public void saveOrUpdate(Mahasiswa Mahasiswa)   
{  
MahasiswaRepository.save(Mahasiswa);  
}  
//menghapus record tertentu dengan menggunakan metode deleteById() dari CrudRepository  
public void delete(int id)   
{  
MahasiswaRepository.deleteById(id);  
}  
//updating record  
public void update(Mahasiswa Mahasiswa, int bookid)   
{  
MahasiswaRepository.save(Mahasiswa);  
}  
}  