package notes;

class Notes1{}


/*
 - Reference variable
 - Constructor will not return any value. Here we just assign the data.
 
 	Class contains variables and methods
 
 Method:
   A block or group of statements which will perform certain task. We have to call the method with object.
   Using the object reference variable we can invoke the method.
   
 Constructor
 	It is a special method that is used to initialize objects. 
 	Constructor name should be same as the class name. It has no return type.
 	Constructors automatically invoked after the object creation.
 	-> Assign the data into variables.
 	Constructor is only meant for only assigning the data into the variable not meant for writing logic in the constructor
 	
 Polymorphism
 	One thing has many forms
 	It can be achieved by overloading concept
 	We can create multiple methods with the same name.
 	
 some rules are applicable in overloading
 --- Method names should be same
 	 number of parameters should be changed.
 	 if the number of parameters are same then the data type of parameter should be different
 	 if the no of parameters and data types also same then order of parameter should be different
 	
 This Keyword
 	--"this" is belongs to class
 	 It is referring to class variables.
 	 We use same local variable name and class variable name to reduce memory.
 	
 	
 Encapsulation
 	 Wrapping up of data and methods into a single unit(class)
 	 The users can access the methods but cannot directly access the variables
 	Only through methods we will operate the variables
 	Instead of accessing the variables directly, we are operating through setters and getters.
 	All variables should be private.
 	We can access variables only through setters and getters method.
 	
 Static
 	 Suppose we find variable data which is common across multiple objects then we can make that variable as static
 	 sometimes methods also
 	 Static methods can access static stuff directly(without creating the objects)
 	 Static methods can access non static method through object.
 	 Non static methods can access everything.
 
 Inheritance
 	 Acquiring all the properties(variables)& behavior(methods) from one class to another class.
 	 Parent/Super/Base
 	 Child/Sub/Derived
 	 Objectives: a)Re-usability
 	 			 b)Avoid duplication
 	 			 
 	 types: 
 	 a)Single - One parent has only one child
 	 b)multilevel - we can create many no. of sub classes
 	 c)Hierarchy - One parent multiple childs	
 	 d)Multiple - Multiple parents for single child
 	 	|->  Multiple inheritance is not supported in java.
 	 		 The reason behind this is to prevent ambiguity.
 	 		 
 	 OBJECT--- root class of all the classes

 	Method Overriding:
 	1)Possible only in multiple classes/inheritance
 	2)We should not change the definition of the method but body we should change.
 	3)method names are same
 	4)Related to inheritance
 	
 	Method Overloading:
 	1)Possible in single & Multiple class/inheritance
 	2)we should change the definition of the method.
 	3)method names are same.
 	4)Related to polymorphism.
 	
 	Super: 
 	1)Super keyword invokes immediate parent class variable.
 	2)Super keyword invokes immediate parent class method.
 	
 Final:
 	variable - we cannot change the value of the variable(constant)
 	methods- we cannot override methods in the child class
 	class - we cannot extend the class in to another class
 
 Abstraction:
 	It is process of hiding the implementation details and showing only functionality to the user.
 Interface:
 	An interface is a blue print of class.
 	Interface contains final and static variables.
 	Interface contains abstract methods(also allowed default methods & static methods from java8 onwards.
 	An abstract method is a method contains definition but not body(un-implemented method).
 	Methods in interface are public.
 	Interface supports the functionality of multiple inheritance.
 	We can define interface with interface keyword.
 	A class extends another class, an interface extends another interface but a class implements on interface.
 	We can create Object reference for interface but we cannot instatiate interface.
 	
 Access Modifiers
 	public - we can access everywhere
 	protected - we can access outside of the package but through inheritance
 	default - only within the package
 	private - only within the class
 	
 Wrapper classes
 	For every built-in primitive type has corresponding Wrapper class
 	Wrapper class in java provides the mechanism to convert primitive into objects and objects into primitive.
 	Converting Primitive to Object is called - Autoboxing
 	Converting Object to Primitive is called - Unboxing
 	
 	Data Conversion methods
 	---------------
 	String -----> int  Integer.parseInt()
 	String -----> double, boolean (possible)
 	String -----> char (not possible)
 	
 	int -----> String  String.valueOf(data)
 	
Exception handling
Errors:	1)Syntax
		Syntax Errors occur when we violate the rules of writing 
	   	the statements of the programming language.

 		2)Logical
 		Logical Errors occur due to our mistakes in programming logic.
 		-code is syntactically correct but does not produce 
 		the expected output due to flawed logic.
 	
 	
 Exception
 	Exception occurs when user provide some invalid input to the program.
 	Exception is an event which will cause program termination.
 	Checked Exceptions:
 		The exceptions which are identified by the java compiler.
 		These can be handled by try catch blocks or Throws keyword(part of main method)
 		Eg: Interupted Exception
 			FileNotFound
 			IOException
 	Un-Checked Exceptions:
 		The exceptions which are not identified by the java compiler.
 		These can be handled by try catch blocks only.

 		Eg: ArithmeticException
 			NullPointerException
 			ArrayIndexOutOfBoundsException..
 			
 	Try, Catch blocks are used to handle the exceptions.
 	1 Try can have many catch blocks
 	Exception is the Parent class
 	Try block will throw the exception and Catch block will handle the exception.
 	Catch block is followed by Try block
 	We can't put multiple try and finally blocks
 	
 	Finally
 	Finally is always followed by Catch block
 	It will always execute without depend on try or catch blocks
 	
 	
 Collections:
 Collection - 
 To represent group of elements/objects/data into single entity then go for collections.
 "collection" is an interface which is available in java.util package.			  
 	
 	
 Array
 1)Size of an Array is fixed.
 2)Heterogeneous data is not allowed(multiple data values)
 
 ArrayList - is class implemented List Interface
 
 Object class is the parent of all the classes in java.
 	
 	
 	
 	
 	
 
 */
