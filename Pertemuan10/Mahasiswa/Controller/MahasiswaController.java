package com.A4.Books.Controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.A4.Books.Model.Mahasiswa;  
import com.A4.Books.Service.MahasiswaService;  
//mark class as Controller  
@RestController  
public class MahasiswaController   
{  
//autowire the BooksService class  
@Autowired  
MahasiswaService MahasiswaService;  
//creating a get mapping that retrieves all the Mahasiswa detail from the database   
@GetMapping("/Mahasiswa")  
private List<Mahasiswa> getAllMahasiswa()   
{  
return MahasiswaService.getAllMahasiswa();  
}  
//creating a get mapping that retrieves the detail of a specific book  
@GetMapping("/Mahasiswa/{NIM}")  
private Mahasiswa getMahasiswa(@PathVariable("NIM") int NIM)   
{  
return MahasiswaService.getMahasiswaById(NIM);  
}  
//creating a delete mapping that deletes a specified Mahasiswa  
@DeleteMapping("/Mahasiswa/{NIM}")  
private void deleteMahasiswa(@PathVariable("NIM") int NIM)   
{  
MahasiswaService.delete(NIM);  
}  
//creating post mapping that post the Mahasiswa detail in the database  
@PostMapping("/Mahasiswa")  
private int saveMahasiswa(@RequestBody Mahasiswa Mahasiswa)   
{  
MahasiswaService.saveOrUpdate(Mahasiswa);  
return Mahasiswa.getNIM();  
}  
//creating put mapping that updates the Mahasiswa detail   
@PutMapping("/Mahasiswa")  
private Mahasiswa update(@RequestBody Mahasiswa Mahasiswa)   
{  
MahasiswaService.saveOrUpdate(Mahasiswa);  
return Mahasiswa;  
}  
}  