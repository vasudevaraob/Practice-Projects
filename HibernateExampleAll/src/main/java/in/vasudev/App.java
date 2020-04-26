package in.vasudev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Agent a = new Agent();
		AgentName an= new AgentName();
		an.setfName("Burada");
		an.setmName("Vasudev");
		an.setlName("Rao");
		//for (int i = 1; i < 20; i++) {
			
			a.setaId(1);
			a.setaName(an);
			a.setaSalary(1000);
			a.setDept("Mech");
		//}
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Agent.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session1 = sf.openSession();
		Transaction tx = session1.beginTransaction();
		//session1.save(a);
		session1.get(Agent.class, 1);
		System.out.println("Level1 Session1 First Time"+session1.get(Agent.class, 1));
		
		session1.get(Agent.class, 1); //with in same session fetching data second time Guery not executiong and data will come from cache
		System.out.println("Level1 Session1 Second Time"+session1.get(Agent.class, 1));
		tx.commit();
		Session session2 = sf.openSession();
		Transaction tx1 = session2.beginTransaction();
		session2.get(Agent.class, 1);
		System.out.println("Level1 Session 2 "+session1.get(Agent.class, 1));
		tx1.commit();
		
		
		
	}
}
