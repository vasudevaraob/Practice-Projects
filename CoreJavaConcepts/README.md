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
	
###### This Key Word

	this represents the current object
	
##### Java Comments

	1. single line comments //
	2. Multi line comments /*
					         *
								*/
	3. Document Comments	/**
	
								*/					
	
## OOPS

	1. Inheritance
		 - The process of accessing the members from one class to another call is called
		 - Using this we can achieve Re-Usability
		 - Using Is-A(Inheritance) and Has-A(Aggregation) relation ship we can achieve this.
		 
			1. Single level inheritance
			2. Multiple Level inheritance
		 
	2. Encapsulation
		 - Process of binding variables and methods into single entity	 Using(We can create a fully 			encapsulated class in Java by making all the data members of the class private. Now we can 			use setter and getter methods to set and get the data in it.)
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
		 
###### Methods 
	
	Method Declaration:- (method signature)
		
		returnType methodName(list of parameters)
			(1)			 (2)             (3)
		
	
	Method Definition :-
	
		the group of statements which is specified between curly braces {} is called.
		if the method does not have any statements is called Empty definition or Null implementation.


##InnerClass

	1. Member class - creating with out static key word
	2. Static Class - with static key word
	3.	Anonymous Class
	
##Arrays:

	Array is a collection of similar type of elements int [] a ;
	
	1. Single Dimensional Array int [] a = {}
	2. Multidimensional Array   int [][] b = {{1,2,3},{4,5,6},{7,8,9}}
	3. Jagged Array

###### VarArgs  (int ... n)--> having Good example in code

###### Super() -- Good example with explination

###### This Key word Having Good example

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
 
###### Encapselation - Binding data with methods called

we need to keep our data to be save 

###### Final Key word or modifier

	-> This can e applicable for variables and methods and class.
	-> the value of variable can not be changed and any number of times during the execution.
	-> A final variable  must be initilized can not be assigned
	-> this can be applied for instance variables,static variables,local,perameter and reference variables
	-> declaring the method as final to restrect the overriding
	-> declaring the Class as final to restrect the extending
	
######Wrapper Class converting the primitive data type to class type is called .

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

######Package

		A java package is a group of similar types of classes, interfaces and sub-packages.Package in java can be categorized in two form, built-in package and user-defined package.here are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
		
######Access Modifiers in Java  (Access modifiers & non Access modifier)
	1.	Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
	2. Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
	3. Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
	4.	Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
	
	There are many non-access modifiers, such as static, abstract, synchronized, native, volatile, transient, etc. Here, we are going to learn the access modifiers only.
		

######String

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
######Java StringBuffer class

	Java StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.

######Java StringBuilder class
	
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
	



######Arrays in Java

	Normally, an array is a collection of similar type of elements which has contiguous memory location.
	1.Advantages
		Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
		Random access: We can get any data located at an index position.
	2.Disadvantages
		Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size 		at runtime. To solve this problem, collection framework is used in Java which grows 		automatically.
		
	3.Types of Array in java

		Single Dimensional Array (dataType arr[])
		Multidimensional Array(dataType arrayRefVar[][])
		

######Exception Handling

The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained. (Exception is an abnormal condition.)
				1.Checked exceptions
				2.Unchecked exceptions (Error)
	->Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException.

	1.Types of Java Exceptions
There are mainly two types of exceptions: checked and unchecked. Here, an error is considered as the unchecked exception. According to Oracle, there are three types of exceptions:

			1.Checked Exception (if class implements Throle is called Ex.IOExcep,SQLExcep)
			
			2.Unchecked Exception(if class inherit RuntimeException EX ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException)
			
			3.Error( is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError)

			
				
				