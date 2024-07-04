package ejemplo.clase.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ejemplo.clase.jdbc.entity.Customer;
import ejemplo.clase.jdbc.service.CustomerRepository;

@Controller
public class JdbcController {
     private final CustomerRepository customerRepository;

    @Autowired
    public JdbcController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Handler method to show the form for adding a new customer
    @GetMapping("/new")
    public String showCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    // Handler method to process the form submission
    @PostMapping("/new")
    public String addCustomer(@ModelAttribute Customer customer) {
        // Here you can perform any necessary validation or business logic before saving
        customerRepository.save(customer);
        return "redirect:/customers/new"; // Redirect to show the form again or to another page
    }

    // Additional handler methods for listing customers, editing, deleting, etc.
    // Example:
    // @GetMapping("/{correo}/edit")
    // public String showEditForm(@PathVariable String correo, Model model) {
    //     Customer customer = customerRepository.findByCorreo(correo);
    //     model.addAttribute("customer", customer);
    //     return "customer-edit-form";
    // }
}
