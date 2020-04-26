<h1>Hibernet Introduction</h1></br></br>
<h2>Pre-Requisite:-</h2></br>
1.Core java (pojo inhertence, loops)</br>
2.Data base SQL (basic query, join query, primery key, forg Key, normalizing table)</br>
3.JDBC for connectivity</br>

<h2>Theory:-</h2></br>
 Object relational Mapping,its ORM tool for persisting the data.
   
 Configuration cfg = new Configuration().configure().addAnnotatedClass(Agent.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		session.save(a);
		
		tx.commit();

<h2>RelationShip:-</h2>

1.  @OneToOne

2.  @OneToMany

3.  @ManytoOne 

@JoinColumn

4.  @ManyToMany

Lazy Loading & Eager Loading:- just add fetch=FetchType.Eager"

@OneToMany(mappedBy="ObjectName",fetch=FetchType.EAGER)

<h2>Hibernate Caching:-</h2>

Level1:- this is for particular session, if changing the session will not work.

Level2:-ehCache, tird party libs we can define for the configuration we can able to maintin for particular sessions(multiple)

Configurations:-

1.pom change- need to add ehcache lib(hibernate-ehcache)

2.need to configure in h.cfg.xml file to enable Level2 cache

3.need to add anotations @Cachable and @Cache

