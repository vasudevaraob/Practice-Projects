package in.vasudev;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		/*Random r = new Random();
		for (int i = 0; i < 50; i++) {
			
			Student s = new Student();
			
			s.setRollno(i);
			s.setName("Name"+i);
			s.setMarks(r.nextInt(100));
			session5.save(s);
		}*/
		
		//Query q = session.createQuery("from Student");
		Query q = session.createQuery("from Student where rollno=7");
		
		
		//List<Student> students=q.list();
		
		Student student = (Student) q.uniqueResult();
		System.out.println(student);	
		
		/*for (Student s : students) {
			
			System.out.println(s);			
		}*/
		
		
		session.getTransaction().commit();
		
	}
}
