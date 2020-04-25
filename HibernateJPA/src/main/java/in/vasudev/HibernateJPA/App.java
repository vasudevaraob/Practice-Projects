package in.vasudev.HibernateJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Customer c1 = new Customer();
    	c1.setEmpid(2);
    	c1.setEmpname("Ram"); 
    	    	
        //System.out.println( "Hello World!" );
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	
    	em.persist(c1);
    	em.getTransaction().commit();
    	Customer c = em.find(Customer.class, 1);
    	
    	System.out.println(c);
    }
}
