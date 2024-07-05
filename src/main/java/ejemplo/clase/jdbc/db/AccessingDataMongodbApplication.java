package ejemplo.clase.jdbc.db;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ejemplo.clase.jdbc.entity.Student;
import ejemplo.clase.jdbc.service.StudentRepository;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

  @Autowired
  private StudentRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(AccessingDataMongodbApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    repository.deleteAll();

    // save a couple of customers
    repository.save(new Student("prueba@escuelaing.edu.co", "Smith", LocalDate.now(), "ingenieria de sistemas"));
    repository.save(new Student("prueba2@escuelaing.edu.co", "Smith", LocalDate.now(), "ingenieria electrica"));

    // fetch all customers
    System.out.println("Customers found with findAll():");
    System.out.println("-------------------------------");
    for (Student customer : repository.findAll()) {
      System.out.println(customer);
    }
    System.out.println();

    // fetch an individual customer
    System.out.println("Customer found with findByFirstName('Alice'):");
    System.out.println("--------------------------------");
    System.out.println(repository.findByNombre("Alice"));

    for (Student customer : repository.findByPrograma("ingenieria electrica")) {
      System.out.println(customer);
    }

  }

}