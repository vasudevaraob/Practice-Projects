# Core Java Concepts

To compile:	javac Simple.java

To execute:	java Simple

## 1. Data-Types (Primitive data types and non-primitive data types)</br>

	There are 8 types of primitive data types:

	1. boolean data type  </br>
	2. byte data type  </br>
	3. char data type  </br>
	4. short data type  </br>
	5. int data type  </br>
	6. long data type  </br>
	7. float data type  </br>
	8. double data type  </br>
 
	Byte & Char -> Int -> long -> float -> double


## 2. Variables  (Instance variables,Local Variables,Static variables)

	Static Variables:- 
	You can create a single copy of static variable and share among all the instances of the class. 
	Memory allocation for static variable happens only once when the class is loaded in the memory


	class A{  </br>
    int data=50;//instance variable  </br>
    static int m=100;//static variable  </br>
    void method(){  </br>
       int n=90;//local variable  </br>
           }  </br>
      }</br>

## 3. Operators:- 

	1. Unary --->	postfix	expr++ expr-- prefix	++expr --expr +expr -expr ~ ! </br>
	2. Arithmetic --->	multiplicative	* / %additive	+ - </br>
	3. Shift	shift	<< >> >>> </br>
	4. Relational	comparison	< > <= >= instanceof  equality	== != </br>
	5. Bitwise	bitwise AND	& , bitwise exclusive OR	^, bitwise inclusive OR	|  </br>
	6. Logical	logical AND	&& logical OR	||  </br>
	7. Ternary	ternary	? :  </br>
	8. Assignment	assignment	= += -= *= /= %= &= ^= |= <<= >>= >>>=   </br>

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
	4.use to initialize/allocate te memory for Oject
	
	It is use to allocate the memory for the Object while object creation, for primitive data type by default memory will be allocate like int 4 bytes.
	It is a special type of method which is used to initialize the object.
	
	1. Default  Constructor
	2. Parameter constructor

*Restrictions for the static method*

*There are two main restrictions for the static method. They are:*

*The static method can not use non static data member or call non-static method directly.this and super cannot be used in static context.*
	
###### This Key Word

	this represents the current object
	
## OOPS

	1. Inhirtance
	2. Encapsolition
	3. Poly- morphism
	
	
	


String & Arrays



 

