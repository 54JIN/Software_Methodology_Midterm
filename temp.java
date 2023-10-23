//How do you define a class and declare an object’s reference variable?
//1 - Defining a Class:
/*
    - When defining a class, within side of it you can add fields (variables), methods (functions), 
    and constructors inside the class as needed
*/
public class temp {
    //Instance Variable:
        private String name;
        private int age;

    //Constructors:
        //Default Constructor:
            public temp () { // DEFAULT CONSTRUCTOR / NO VOID AND NO RETURN
                            // PUBLIC AND ACCESS MODIFIERS OK TO ALL / NO STATIC
                String a = "Local Variable A";
                System.out.println(a + " Printed from Constructor Method");;
            }
        //Parameterized Constructor:
            public temp (String name, int age){
                this.name = name;
                this.age = age;
            }
        //Copy Constructor:
            public temp(temp otherTemp){
                this.name = otherTemp.name;
                this.age = otherTemp.age;
            }


    //Method:
        public void printString() { //VOID METHOD / PUBLIC AND ACCESS MODIFIERS OK
            System.out.println("Hello");
        }

        public String returnValue(){ //RETURN VALUE METHOD / PUBLIC AND ACCESS MODIFIERS
            return "HelloOOOO";
        }

    public static void main(String[] args) {
        //Declaring an Objects Reference Variable:
            //Declare a reference variable for an object of MyClass - after "=" sign: Create an instance of MyClass and assign it to the reference variable
            /*
                - myObject is an reference variable that holds the address to access the object 
                - in Java we don't know what's inside the reference variable
                - so first it creates a new object in memory and assigns the address of that new object in memory to the reference variable
            */
            MyClass myObject = new MyClass();
            //Now that "myObject" is the reference variable, you can use the object via the reference variable
            myObject.up();
            myObject.printNum();

        //How do you create an object? Implicit and explicit type-cast?
            //2 - Creating an Object
                //To create an Object in Java, you use the 'new' keyword followed by a constructor call. 
            MyClass createObject = new MyClass(); //creating an MyClass object
            /*
                - What is casting: Converting a data type to another type (for example, you can convert a int to a double 
                and a double to an int)
                - Implicit casting in a nutshell: When Java does the conversion automatically
                - Explicit casting in a nutshell: When the programmer has to do the casting himself 
            */
            //Implicit Casting:
            /*
                - What is an Implicit Casting: Happens automatically when converting from a narrower 
                range data type to a wider range data type.
                    - For example: 
                        - Converting from an int to a double/float/long
                            - This is because a double data type has a wider range than a int and the same applies for a float and long
                        - Converting from an float to a double
                            - This is because a double has a wider range than a float
                    - Implicit casting occurs when we can convert from a data type to another data type without loosing data
            */
            double d1 = 4; // int -> double
            double d2 = 5.7f; //float -> double
            long l1 = 100; //int -> long
            
            //Another variation is: when a class extends another class (in this case Dog extends Animal thus: )
            Animal animal = new Dog(); //Implicit Upcasting - The 'Dog' object is implicitly cast to an 'Animal' reference because
            //Dog is a subclass of 'Animal'

            //Explicit Casting:
            /*
                - What is an Explicit Casting: Does not happen automatically. Should be done by the programmer
                when converting from a wider range to a narrower range data type.           
                    - For example:
                        - Converting from an double/float/long to an int
                            - This is because when converting from a double to an int, you might loose some data (Meaning you 
                            might loose the decimnal part of the number). Same applies for float to int and long to int
                        - Converting from an double to a float
                            - This is becuase some data might be lost since a double has a wider range than a float
                - Basically Java does not automatically do the conversion, rather the programmer should tell Java to convert the 
                data even if the decimal point is going to be lost. 
            */
            /*
            int i1 = 4.5; //Error
            int i2 = 8L; //Error
            float f1 = 4.5; //Error
            */
            //Implicit casting code: (new data type) expression
            int i1 = (int) 4.5; // (int) 4.5 -> 4 (data loss)
            int i2 = (int) 8L; // (int) 8L -> 8
            float f1 = (float) 4.5; // (float) 4.5 -> 4.5F

            //Another variation is: when a class extends another class (in this case Dog extends Animal thus: )
            Dog dog = (Dog) animal; //Explicit Down Casting - The 'Dog' object is explicitly down cast to an 'Animal' reference because
            //Dog is a subclass of 'Animal'

        //What are the differences between constructors and methods?
            /*
                - A constructor is a method
            */
            //Constructor: code found on line 12 - 28
            /*
                - A Constructor is used to initialize an object with its appropriate properties, it does not allow for signatures
                such as 'void' or any type of return values (for example: 'String' or 'int' or 'boolean' . . .)
                - You can have properties aligned with the constructors as well
                    - You can have multiple constructors with different properites
            */

            //Methods: Code found on line 31 - 38
            /*
                - Methods are a form of which that can manipulate or retrive the data found within an object.
                - Methods can either be void or have an return value, depending on the intended purpose
            */

        //What is a default constructor, parameterized constructor and copy constructor?
            /*
                - Default constructor: A default constructor is a constructor with no parameters
                - Parameterized constructor: A Parameterized constructor is a constructor with parameters 
                - Copy Constructor: A Copy constructor takes an object of the same class as a parameter and creates a new object
                by copying the values of the fields from the provided object
                    - A Copy constructor is a Parameterized constructor but not all Parameterized constructor is a Copy constructor
            */
            //Main code found for default constructor, parameterized constructor and copy constructor found on line: 12 - 28
            temp defaultConstructor = new temp(); //Nothing is given to parameter thus default
            temp parameterizedConstructor = new temp("Timothy", 18); //The name and age is given as the parameter thus Parameterized
            temp copyConstructor = new temp(parameterizedConstructor); //An object of the same type is given as the parameter thus copy
        
        //How does a default constructor work?
            /*
                - A default constructor is created automatically by the java compiler if a class 
                does not explicitly define any constructors
                - One of the main duties of an default constructor is to initialize the objects fields with default values
                - If the default constructor does not define default values then java initializes it with Null or 0 depending on 
                data type
            */
        
        //How does the constructor chaining work in inheritance?
            /*
                - constructor chainign occurs in inheritance using 'super'
                    - Menaing, when a subclass needs to initialize the values of its parent class, it uses 'super' to call 
                    the parent constructor
            */
            /*
                Example Code:
                    class Superclass {
                        int superValue;

                        Superclass(int value) {
                            this.superValue = value;
                        }
                    }

                    class Subclass extends Superclass {
                        int subValue;

                        Subclass(int superValue, int subValue) {
                            super(superValue); // Call the superclass constructor
                            this.subValue = subValue;
                        }
                    }
            */
        
        //What are the differences between a concrete class, abstract class and Java interface?
            /*
                - In Java, concrete class, interface, and abstract class are used to define the structure and behavior of classes
                - Concrete classes can be instantiated, but both abstract and interface classes cannot be instantiated
                - Abstract classes can have a mixture of both abstract and concrete methods, whereas interfaces 
                contain only abstract methods
                - A class can extend only one other class if its abstract or concrete, but it can implement multiple interfaces
            */
            //Concrete Class:
                /*
                    - When to use it? When we require complete implementation; meaning, all our methods 
                    are ready to function properly and provide an output
                    - A regular class that can be instatiated to create objects
                    - Concrete classes can extend other classes such as abstract classes for example
                    - May or maynot contain abstract methods
                    - Objects of concrete classes can be created and used directly
                */
                /*
                    Example Code:
                        public class Car {
                            public void start() {
                                // Implementation for starting a car
                            }
                            public void stop() {
                                // Implementation for stopping a car
                            }
                        }
                */

            //Abstract Class:
                /*
                    - When to use it? When we only require PARTIAL Implementation 
                    - An abstract class cannot be instatiated (cannot create objects of an abstract class)
                    - May contain a mix of concrete methods (with implementation) and abstract methods (without implementation)
                    - Serve as placeholders, and subclasses are required to provide implementations for them
                    - Often usedd as base classes for other classes to enforce a common structure or behavior
                */
                /*
                    Example Code:
                        public abstract class Shape {
                            public abstract double area(); // Abstract method
                            public void display() {
                                // Concrete method
                            }
                        }
                */
            
            //Interface Class:
                /*
                    - When to use it? When we have no implementation only requirement specification then we use Interface
                    - Collection of Abstract methods (methods without implementations) and constant fields (implicitily: 'public', 'static', and 'final')
                    - Classes that implement an interface provide concrete implementations for all the methods declared in the interface
                    - A class can implement multiple interfaces, allowing for multiple inheritance of behavior.
                    - No actual code should be found within the interface class, just ideas basically
                */
                /*
                    Example Code:
                        public interface Drawable {
                            void draw(); // Abstract method
                            void resize(); // Abstract method
                        }
                */
        //What is the internal storage for characters, string literals and instances of String class?
            /*
                - Characters (char): 16-bit Unicode encoding
                - String Literals: stored in a pool known as the string pool or string constant pool
                - Instances of String are created on the heap 
            */
            //String Literals:
            String s1 = "Hello";
            String s2 = "Hello";
            //Instance of String:
            String s3 = new String("Hello");
            String s4 = new String("Hello");

            boolean result = s1 == s2; //true -> due to string literal both s1 and s2 address are the same
            boolean result2 = s3 == s4; //false -> due to Instance of String both s3 and s4 address are not the same thus not same value
        
        //How is the “super” keyword used in subclasses?
            /*
                - The 'super' keyword is used in subclasses to acces and invoke members (like fields, methods, constructors) of
                the superclass (parent class). 
            */
            /*
                Information before code:
                    //Accessing Superclass members:
                    super.x;
                    //Calling Superclass Constructor:
                    super();
                    //Invoking Superclass Methods:
                    super.display();
                
                Example code:
                    class Superclass {
                        int x = 10;
                        void display() {
                            System.out.println("Superclass: " + x);
                        }

                        Superclass() {
                            System.out.println("Superclass constructor");
                        }

                        void display() {
                            System.out.println("Superclass method");
                        }

                    }

                    class Subclass extends Superclass {
                        //Accessing Superclass members:
                        int x = 20;
                        void display() {
                            System.out.println("Subclass: " + x);
                            System.out.println("Superclass: " + super.x); // Using super to access superclass member
                        }
                        //Calling Superclass Constructor:
                        Subclass() {
                            super(); // Explicitly call the superclass constructor
                            System.out.println("Subclass constructor");
                        }
                        //Invoking Superclass Methods:
                        void display() {
                            super.display(); // Invoke superclass method
                            System.out.println("Subclass method");
                        }
                    }
            */
        
        //What are the differences between overriding and overloading?
            /*
                - Method overloading occurs when you define a method with the same name multiple times 
                but with different parameters
                - Method Overriding occurs when you override a method from a parent class due to requiring a 
                different functionality
            */
            //Method Overloading
            /*
                - Example Code:
                    int add(int a, int b) {
                        return a + b;
                    }

                    double add(double a, double b) {
                        return a + b;
                    }
            */

            //Method Overriding:
            /*
                - Example Code:
                    class Animal {
                        void makeSound() {
                            System.out.println("Some generic animal sound");
                        }
                    }

                    class Dog extends Animal {
                        @Override
                        void makeSound() {
                            System.out.println("Bark");
                        }
                    }
            */
        
        //What is inheritance? What is polymorphism?
            /*
                - Polymorphism is achieved through method overriding and interface implementations
                Key Differences:
                    - Inheritance defines a class hierarchy and establishes a relationship where a subclass 
                    inherits the members of its superclass, whereas polymorphism allows for more generic and flexible 
                    object behavior without specifying the concrete type of the object.
                    - Inheritance is mainly about code reuse, creating class hierarchies, and structuring classes based 
                    on common attributes and behaviors. Polymorphism, on the other hand, focuses on flexibility and adaptability 
                    when dealing with objects.
                    - Inheritance is a static concept; the relationship between classes is determined at 
                    compile time. Polymorphism is a dynamic concept; the method to execute is determined at runtime based on 
                    the actual object's type.
                    - Inheritance is achieved through the extends keyword in Java, whereas polymorphism is realized 
                    through method overriding and interface implementations.
            */
        
        //How do you read input from console?
            /*
                Example Code:
                    import java.util.Scanner;
                    Scanner scan = new Scanner(System.in);
                    String userInput = scan.nextLine();
                    scan.close()
            */
    }
}