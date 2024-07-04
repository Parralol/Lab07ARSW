package ejemplo.clase.jdbc.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ejemplo.clase.jdbc.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public List<Customer> findByNombre(String nombre);
    
    public Customer findByEdad(LocalDate edad);

    public List<Customer> findByPrograma(String programa);

}