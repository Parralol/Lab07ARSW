package ejemplo.clase.jdbc.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ejemplo.clase.jdbc.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

    public List<Student> findByNombre(String nombre);
    
    public Student findByEdad(LocalDate edad);

    public List<Student> findByPrograma(String programa);

}