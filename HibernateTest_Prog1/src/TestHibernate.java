
import org.hibernate.Session;
		 
public class TestHibernate {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		// Add new Employee object
		Employee emp = new Employee();
		emp.setEmail("email1@gmail.com");
		emp.setFirstName("Hii");
		emp.setLastName("Dear");
		emp.setAge(26);

		session.save(emp);

		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}

	


