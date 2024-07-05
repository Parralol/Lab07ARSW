package ejemplo.clase.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejemplo.clase.jdbc.entity.Student;
import ejemplo.clase.jdbc.service.StudentRepository;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:3000")
public class JdbcController {
    private final StudentRepository customerRepository;

    @Autowired
    public JdbcController(StudentRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping
    public Student createCustomer(@RequestBody Student customer) {
        return customerRepository.save(customer);
    }

    @GetMapping
    public List<Student> getAllCustomers() {
        return customerRepository.findAll();
    }
}
