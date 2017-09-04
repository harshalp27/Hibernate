 
import javax.persistence.*;
 
@Entity
@Table(name = "Employee")

public class Employee{
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer employeeId;
 
    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;
 
    @Column(name = "first_name", unique = false, nullable = false, length = 100)
    private String firstName;
 
    @Column(name = "last_name", unique = false, nullable = false, length = 100)
    private String lastName;
    
    @Column(name = "age", unique = false)
    private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
    
}
 
