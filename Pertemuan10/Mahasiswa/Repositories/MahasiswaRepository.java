package com.A4.Mahasiswa.Repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.A4.Mahasiswa.Model.Mahasiswa;  
//repository yang mengextend CrudRepository  
@Repository
public interface MahasiswaRepository extends CrudRepository<Mahasiswa, Integer>  
{  
}  