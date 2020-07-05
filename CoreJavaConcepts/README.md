# Core Java Concepts

	To compile:javac Simple.java  To execute:	java Simple

## 1. Data-Types (Primitive data types and non-primitive data types)</br>

	There are 8 types of primitive data types:

	1. boolean data type
	2. byte data type  
	3. char data type  
	4. short data type 
	5. int data type  
	6. long data type 
	7. float data type
	8. double data type
 
	Byte & Char -> Int -> long -> float -> double
	
	Non-Primitive Data Types: These data types are not actually defined by the programming language but are created by the programmer. They are also called “reference variables” or “object references” since they reference a memory location which stores the data.Non-Primitive Data Types: These data types are not actually defined by the programming language but are created by the programmer. They are also called “reference variables” or “object references” since they reference a memory location which stores the data.
	
	Non-Primitive data types refer to objects and hence they are called reference types. Examples of non-primitive types include Strings, Arrays, Classes, Interface, etc. Below image depicts various non-primitive data types.


## 2. Variables  (Instance variables,Local Variables,Static variables)

	Static Variables:- 
	You can create a single copy of static variable and share among all the instances of the class. 
	Memory allocation for static variable happens only once when the class is loaded in the memory
***if changing one value of static variable it will reflect same name for remaining all variables***

	class A{ 
    int data=50;//instance variable  
    static int m=100;//static variable 
    void method(){  
       int n=90;//local variable
           }  
      }

***Instance variables/new String() will store in Heap memory and Static variables store in Method area, local variables will store in java stack. String constant pool will be for "String" variables***


## 3. Operators:- 

	1. Unary --->	postfix	expr++ expr-- prefix	++expr --expr +expr -expr ~ !
	2. Arithmetic --->	multiplicative	* / %additive	+ - 
	3. Shift	shift	<< >> >>> 
	4. Relational	comparison	< > <= >= instanceof  equality	== != 
	5. Bitwise	bitwise AND	& , bitwise exclusive OR	^, bitwise inclusive OR	| 
	6. Logical	logical AND	&& logical OR	||  
	7. Ternary	ternary	? :  
	8. Assignment	assignment	= += -= *= /= %= &= ^= |= <<= >>= >>>=

## 4. Java Naming conventions :- (more code readable)

	* Class    - String, Integer,Student,Worker
	* Interface- Runnable, Serializable
	* Method   - main(), run()
	* variable - sname
	* Constant - SUNDY, MONDAY, DENSITY, MAX_PRICE
	* Constructor - ClassName()
 
## 5.Control Statements

<h4>Conditional Control Statements</h4>

	* if else
	* Switch

<h4>Iterating Statements</h4>

	* for loop - when we know number of iteration
	* While Loop - when we dont know aout number of iteration (chat window, when user press exit   will do chat)
	* Do While - when we need to execute first statement go for condition 
	* for each Loop - Array will discuss on this for(int i:arr){}
	* Nested Loop (Logical patterns)

<h4>Transfer Statements</h4>

	* Break - reak will break the iteration
	* Continue - will skip the iteration
	* return*

## 6. Class & Object

	* Class is a blue print like a building design
	* Object is a kind of Building after construction

## 7. Constructor

	1.Member method
	2.Same name as class name
	3.it will never return any thing
	4.use to initialize/allocate the memory for Object
	
	It is use to allocate the memory for the Object while object creation, for primitive data type by default memory will be allocate like int 4 bytes.
	It is a special type of method which is used to initialize the object.
	
	1. Default  Constructor
	2. Parameter constructor
***Constructor execution should be starts from parent to child***


*Restrictions for the static method*

*There are two main restrictions for the static method. They are:*

*The static method can not use non static data member or call non-static method directly.this and super cannot be used in static context.*
	
<h4> This Key Word</h4>

	this represents the current object
	
<h4> Java Comments</h4>

	1. single line comments //
	2. Multi line comments /*
					         *
								*/
	3. Document Comments	/**
	
								*/					
	
## 8.OOPS

	1. Inheritance
		 - The process of accessing the members from one class to another call is called
		 - Using this we can achieve Re-Usability
		 - Using Is-A(Inheritance) and Has-A(Aggregation) relation ship we can achieve this.
		 
			1. Single level inheritance
			2. Multiple Level inheritance
		 
	2. Encapsulation
		 - Process of binding variables and methods into single entity	 Using
		   (We can create a fully encapsulated class in Java by making all the data members of the class private. 
		   Now we can use setter and getter methods to set and get the data in it.)
		 - isolate the members from one class to other class
		 - We can implement the Abstraction and data hiding/Data Binding
		 
	3. Polymorphism
		 - A single entity will show multiple behaviour
		 - Can achieve flexibility
		 
		 There are two ways to overload the method in java
          By changing number of arguments
          By changing the data type
		 
		 	1. Compile Time polymorphism/OverLoading/Static Binding/Early Binding
		 	2. Run Time polymorphism/OverRidding/Dynamic Binding/Lazy Binding
		 
<h4> Methods</h4> 
	
	Method Declaration:- (method signature)
		
		returnType methodName(list of parameters)
			(1)			 (2)             (3)
		
	
	Method Definition :-
	
		the group of statements which is specified between curly braces {} is called.
		if the method does not have any statements is called Empty definition or Null implementation.


<h4>InnerClass</h4>

	1. Member class - creating with out static key word
	2. Static Class - with static key word
	3.	Anonymous Class
	
## 9. Arrays:
	
	Normally, an array is a collection of similar type of elements which has contiguous memory location.
	1.Advantages
		Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
		Random access: We can get any data located at an index position.
	2.Disadvantages
		Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size 		at runtime. To solve this problem, collection framework is used in Java which grows 		automatically.
		
	3.Types of Array in java

		Single Dimensional Array (dataType arr[])
		Multidimensional Array(dataType arrayRefVar[][])
	Array is a collection of similar type of elements int [] a ;
	
	1. Single Dimensional Array int [] a = {}
	2. Multidimensional Array   int [][] b = {{1,2,3},{4,5,6},{7,8,9}}
	3. Jagged Array

<h4> VarArgs  (int ... n)--> having Good example in code</h4>

<h4> Super() -- Good example with explination</h4>

<h4> This Key word Having Good example</h4>

	this can be used to refer current class instance variable
	this can be used to invoke current class method (implicitly)
	this() can be used to invoke current class constructor
	this can be passed as an argument in the method call.
	this can be passed as argument in the constructor call.
	this can be used to return the current class instance from the method.

####### Inheritance And Abstract class (Multiple Inheritance)
	JAVA does not support multiple inheritance

####### Method Overriding & Dynamic Method Dispatch Having Good example

	by having IS-A relation ship can achieve, when ever we no need to parent class execution go for this. 
 
<h4>Encapselation - Binding data with methods called</h4>

we need to keep our data to be save 

## 9.Final Key word or modifier

	-> This can e applicable for variables and methods and class.
	-> the value of variable can not be changed and any number of times during the execution.
	-> A final variable  must be initilized can not be assigned
	-> this can be applied for instance variables,static variables,local,perameter and reference variables
	-> declaring the method as final to restrect the overriding
	-> declaring the Class as final to restrect the extending
	
###### Wrapper Class converting the primitive data type to class type is called .

	-> Converting int to Integer is called wrapper/Boxing
	-> Converting Integer to int is called unWrapper/Un-Boxing
	-> having Good example

###### Concurrent Method /class 
	if a class contains declaration and definition is called concurrent methods

###### Abstract method/class 
	
	-> if method contains declaration only with Abstract key word is called
	-> when we want to a method to be implemented by different programmers whith different implementation
	An abstract class must be declared with an abstract keyword.
	It can have abstract and non-abstract methods.
	It cannot be instantiated.
	It can have constructors and static methods also.
	It can have final methods which will force the subclass not to change the body of the method.

####### Final KeyWord:-

	-> to define constants, hen e don't want to change the value
	-> when we don't want to extend my class go for final	
	-> when don't want to override my method go with final

###### Interface

	Why use Java interface?
	It is used to achieve abstraction.
	By interface, we can support the functionality of multiple inheritance.
	It can be used to achieve loose coupling.
	
	Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
	
	Normal interface
	SAM Single abstract method interface - functional interface ()
	Maraer interface - serilizale clonale it will give instrections
	
	What is marker or tagged interface?
	An interface which has no member is known as a marker or tagged interface, for example, 	Serializable, Cloneable, Remote, etc. They are used to provide some essential information to the 	JVM so that JVM may perform some useful operation.
	Since Java 8, interface can have default and static methods which is discussed later.

###### Package

		A java package is a group of similar types of classes, interfaces and sub-packages.Package in java can be categorized in two form, built-in package and user-defined package.here are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
		
###### Access Modifiers in Java  (Access modifiers & non Access modifier)
	1.	Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
	2. Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
	3. Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
	4.	Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
	
	There are many non-access modifiers, such as static, abstract, synchronized, native, volatile, transient, etc. Here, we are going to learn the access modifiers only.
		

## 10. String

	1. What is String in java
			Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.
			
	2. How to create a string object?
			There are two ways to create String object:
				A. By string literal Strig A = "Hello";
				B. By new keyword String s = new String("Hello");
	3. Immutable String in Java
			In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
			Once string object is created its data or state can't be changed but a new string object is 			created.
	4. Why string objects are immutable in java?
			Because java uses the concept of string literal.Suppose there are 5 reference variables,all 		referes to one object "sachin".If one reference variable changes the value of the object, it 		will be affected to all the reference variables. That is why string objects are immutable in ja
###### Java StringBuffer class

	Java StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.

###### Java StringBuilder class
	
	Java StringBuilder class is used to create mutable (modifiable) string. The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. It is available since JDK 1.5.



----------------------------------------------------------------------------------------------------------------------------
	1. String Compare (equals(),==,compareTo()) 
	
	String compare by compareTo() method
		The String compareTo() method compares values lexicographically and returns an integer value 		that describes if first string is less than, equal to or greater than second string.

			Suppose s1 and s2 are two string variables. If:
				s1 == s2 :0
				s1 > s2   :positive value
				s1 < s2   :negative value
				
	2. String Concatenation in Java
			In java, string concatenation forms a new string that is the combination of multiple strings. 		There are two ways to concat string in java:
				1. By + (string concatenation) operator
				2. By concat() method
	3. Substring in Java

   			1. public String substring(int startIndex): This method returns new String object containing the substring of the given      string from specified startIndex (inclusive).
   			2. public String substring(int startIndex, int endIndex): This method returns new String object containing the substring of the given string from specified startIndex to endIndex.
   			
	4. How to create Immutable class?
		we have created a final class named Employee. It have one final datamember, a parameterized constructor and getter method.
		
	5.StringTokenizer in Java (The java.util.StringTokenizer class allows you to break a string into tokens. It is simple way to break string.)
	




## 11.Exception Handling

The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained. (Exception is an abnormal condition.)
				1.Checked exceptions
				2.Unchecked exceptions (Error)
	->Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException.

	1.Types of Java Exceptions
There are mainly two types of exceptions: checked and unchecked. Here, an error is considered as the unchecked exception. According to Oracle, there are three types of exceptions:

			1.Checked Exception (if class inherit Throble is called Ex.IOExcep,SQLExcep)
			
			2.Unchecked Exception(if class inherit RuntimeException EX ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException)
			
			3.Error( is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError)
------------------>
	1.try which will cause the exception need to keep in this block
	2.catch is to catch the exception
	3.Finally is use to must and should e executed  (Finally block in java can be used to put "cleanup" code such as closing a file, closing connection)
	
	Java throw keyword:-
	
	  The Java throw keyword is used to explicitly throw an exception.We can throw either checked or uncheked exception in java by throw keyword. The throw keyword is mainly used to throw custom exception
	  
	Difference between throw and throws in Java
There are many differences between throw and throws keywords. A list of differences between throw and throws are given below:

No.	throw	                                                        throws
1)	Java throw keyword is used to explicitly throw an exception.	Java throws keyword is used to declare an exception.
2)	Checked exception cannot be propagated using throw only.	    Checked exception can be propagated with throws.
3)	Throw is followed by an instance.	                            Throws is followed by class.
4)	Throw is used within the method.	                            Throws is used with the method signature.
5)	You cannot throw multiple exceptions.	                        You can declare multiple exceptions e.g.
                                                                    public void method()throws IOException,SQLException.
	
## 12. Multithreading in Java

	Multithreading
	Multitasking
	Process-based multitasking
	Thread-based multitasking
	What is Thread
	Multithreading in Java is a process of executing multiple threads simultaneously
	
	Advantages of Java Multithreading
1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.

2) You can perform many operations together, so it saves time.

3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.

	Java Thread class
	
	Java provides Thread class to achieve thread programming. Thread class provides constructors and methods to create and perform operations on a thread. Thread class extends Object class and implements Runnable interface.	

	
	How to create thread
	
	There are two ways to create a thread:

	1.	By extending Thread class(Thread class:
Thread class provide constructors and methods to create and perform operations on a thread.Thread class extends Object class and implements Runnable interface.)
	
	2. By implementing Runnable interface.(
The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. Runnable interface have only one method named run().
public void run(): is used to perform action for a thread)	
				
	Java Garbage Collection
	
	In java, garbage means unreferenced objects.

Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way to destroy the unused objects

	Advantage of Garbage Collection
It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.

	How can an object be unreferenced?
There are many ways:

By nulling the reference

Employee e=new Employee();  
e=null;

By assigning a reference to another

Employee e1=new Employee();  
Employee e2=new Employee();  
e1=e2;

By anonymous object etc. new Employee();

	finalize() method
The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing. This method is defined in Object class as:

	gc() method
The gc() method is used to invoke the garbage collector to perform cleanup processing. The gc() is found in System and Runtime classes.


## Collection

<h4>List</h4>

	1.Array List
	
		The important points about Java ArrayList class are:
		  - Java ArrayList class can contain duplicate elements.
		  - Java ArrayList class maintains insertion order.
		  - Java ArrayList class is non synchronized.
		  - Java ArrayList allows random access because array works at the index basis.
		  - In ArrayList, manipulation is little bit slower than the LinkedList in 
		  Java because a lot of shifting needs to occur if any element is removed from the array list.
------------------------------------------
How to Sort ArrayList ? Using the Collections.sort()


	2.Linked List
	
		The important points about Java LinkedList are:
			-Java LinkedList class can contain duplicate elements.
			-Java LinkedList class maintains insertion order.
			-Java LinkedList class is non synchronized.
			-In Java LinkedList class, manipulation is fast because no shifting needs to occur.
			-Java LinkedList class can be used as a list, stack or queue.
			
###### Diff Array and linked

ArrayList	LinkedList
1) ArrayList internally uses a dynamic array to store the elements.	LinkedList internally uses a doubly linked list to store the elements.
2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory.	Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
3) An ArrayList class can act as a list only because it implements List only.	LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4) ArrayList is better for storing and accessing data.	LinkedList is better for manipulating data.
			
	3.Vector
	4.Stack
	
	List <data-type> list1= new ArrayList();  
	List <data-type> list2 = new LinkedList();
	List <data-type> list3 = new Vector();
	List <data-type> list4 = new Stack();  

<h4>Set</h4>

	1.HashSet
	
		 The important points about Java HashSet class are:
		 	-HashSet stores the elements by using a mechanism called hashing.
		 	-HashSet contains unique elements only.
		 	-HashSet allows null value.
		 	-HashSet class is non synchronized.
		 	-HashSet doesn't maintain the insertion order. 
		 	-Here, elements are inserted on the basis of their hashcode.
		 	-HashSet is the best approach for search operations.
		 	-The initial default capacity of HashSet is 16, and the load factor is 0.75.
		
	2.LinkedHashSet
	
		The important points about Java LinkedHashSet class are:
			-Java LinkedHashSet class contains unique elements only like HashSet.
			-Java LinkedHashSet class provides all optional set operation and permits null elements.
			-Java LinkedHashSet class is non synchronized.
			-Java LinkedHashSet class maintains insertion order.
			
			
	3.ShortedSet
	4.TreeSet
	
		The important points about Java TreeSet class are:
			-Java TreeSet class contains unique elements only like HashSet.
			-Java TreeSet class access and retrieval times are quiet fast.
			-Java TreeSet class doesn't allow null element.
			-Java TreeSet class is non synchronized.
			-Java TreeSet class maintains ascending order.

<h4> Map</h4>

	1.HashMap
	2.LinkedHashMap
	3.SortedMap
	4.TreeMap
	
	
------------Hash table--------------
103 Rahul
102 Ravi
101 Vijay
-----------Hash map-----------
100 Amit
101 Vijay
102 Rahul
104 Amit

###### Hashmap vs Hashtable

1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
3. HashMap is generally preferred over HashTable if thread synchronization is not needed

Why HashTable doesn’t allow null and HashMap does?
To successfully store and retrieve objects from a HashTable, the objects used as keys must implement the hashCode method and the equals method. Since null is not an object, it can’t implement these methods. HashMap is an advanced version and improvement on the Hashtable. HashMap was created later.


###### HashSet vs HashMap

Differences:

HASHSET	HASHMAP
HashSet class implements the Set interface	HashMap class implements the Map interface
In HashSet we store objects(elements or values) e.g. If we have a HashSet of string elements then it could depict a set of HashSet elements: {“Hello”, “Hi”, “Bye”, “Run”}	HashMap is used for storing key & value pairs. In short it maintains the mapping of key & value (The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls.) This is how you could represent HashMap elements if it has integer key and value of String type: e.g. {1->”Hello”, 2->”Hi”, 3->”Bye”, 4->”Run”}
HashSet does not allow duplicate elements that means you can not store duplicate values in HashSet.	HashMap does not allow duplicate keys however it allows to have duplicate values.
HashSet permits to have a single null value.	HashMap permits single null key and any number of null values.


###### Difference between TreeSet and TreeMap in Java

		Main Difference between TreeMap and TreeSet is that TreeMap is an implementation of Map interface while TreeSet is an implementation of Set interface. There are some similarities between both TreeMap and TreeSet and few differences as well. In this Java tutorial, we will first see similarities between TreeMap and TreeSet and than you will learn some differences between TreeMap and TreeSet in Java. Key point to remember about TreeMap and TreeSet is that they use compareTo() or compare() method to compare object, So if uses puts a String object in TreeSet of Integers, add() method will throw ClassCastException at runtime prior to Java 5, with Java 5 you can use Generics to avoid this happening by declaring TreeMap and TreeSet with parametrized version. If you want to master Java Collection framework by heart, you can see Java Generics and Collection book by Maurice Naftaline, one of the best work on Java Collections framework.


Read more: https://www.java67.com/2012/08/difference-between-treemap-and-treeset-java.html#ixzz6RKGY5EIg
	
	
	

