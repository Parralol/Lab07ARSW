package ejemplo.clase.jdbc.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("students")
public class Customer {

  @Id
  public String correo;

  public String nombre;
  public LocalDate edad;
  public String programa;

  public Customer() {}

  public Customer(String correo, String nombre, LocalDate edad, String programa) {
    super();
    this.correo = correo;
    this.nombre = nombre;
    this.edad = edad;
    this.programa = programa;
}



@Override
public String toString() {
    return "Customer [correo=" + correo + ", nombre=" + nombre + ", edad=" + edad + ", programa=" + programa + "]";
}




}