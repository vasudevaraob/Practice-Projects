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
	* While Loop - when we dont know aout number of iteration (chat windo, when user press exit   will do chating)
	* Do While - when we need to execute first statement go for condition 
	* for each Loop - Array will discuss on this
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
		 - Process of binding variables and methods into single entity	 Using
		 - isolate the members from one class to other class
		 - We can implement the Abstraction and data hiding/Data Binding
	3. Polymorphism
		 - A single entity will show multiple behaviour
		 - Can achieve flexibility
		 
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



	

		 
	
		
	
	


String



 

