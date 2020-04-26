Hibernet Introduction

Pre-Requisite:-

1.Core java (pojo inhertence, loops)

2.Data base SQL (basic query, join query, primery key, forg Key, normalizing table)

3.JDBC for connectivity

Theory:-
 Oject relational Mapping
 its ORM tool for persisting the data.
 
 svave(obj)->session->sessionFactory->
 
 
 Configuration cfg = new Configuration().configure().addAnnotatedClass(Agent.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		session.save(a);
		
		tx.commit();

RelationShip:-

@OneToOne

@OneToMany

@ManytoOne 

@JoinColumn

@ManyToMany

Lazy Loading & Eager Loading:- just add fetch=FetchType.Eager"

@OneToMany(mappedBy="ObjectName",fetch=FetchType.EAGER)
