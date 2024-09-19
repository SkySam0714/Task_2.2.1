package hiber.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "email")
   private String email;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "car_id")
   private Car car;

   public User(String firstName, String lastName, String email){
      this(firstName,lastName,email,null);
   }

   public User(String firstName, String lastName, String email, Car car){
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.car = car;
   }

   @Override
   public String toString() {
      return  "Id = " + id + "\n" +
              "First Name = " + firstName + "\n" +
              "Last Name = " + lastName + "\n" +
              "Email = " + email + "\n" +
              "Car = " + (car != null ? car.toString() : "None") + "\n";

   }
}
