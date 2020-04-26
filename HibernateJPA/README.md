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

<h2>HQL<h2></br>
	
<b>Ex:-</b></br>

in sql "select * form table_name;" and  in HQL "from table_name" like this

select rollno from <b>stuent<b>; (sql)

select rollno from <b>Stuent<b>;
	

<h2>Get&Load<h1>



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

<h2>HQL<h2></br>
	
<b>Ex:-</b></br>

in sql "select * form table_name;" and  in HQL "from table_name" like this

select rollno from <b>stuent<b>; (sql)

select rollno from <b>Stuent<b>;
	

<h2>Get&Load<h1>



<h2>Object States </h2>

1.	Transent - cretion of object and doing moification called Transent state</br>
2.	Persistence - hile performing any save or any operation on Transent object , can called Persest state </br>
			-get(),save(),persist().
3.	detached state -  detached() </br>
		when deleting(remove()) from db or  closing the session all comes under detache state.
		
<h2>Hibernate Get vs load</h2> </br>

Get by default get all the data from chaild objects also, But in load is based on load on demand. will provide a proxy object all the times
		
		
