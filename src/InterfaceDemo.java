public class InterfaceDemo {

    public static void main(String[] args) {
        MyClass a = new MyClass();      // here we instantiated a MyClass object
        a.someMethod(); // and here we invoked someMethod

        // as the method is static we access it via MyInterface not via the name of MyClass object
        System.out.println("The value of the constant is " + MyInterface.myInt);

        a.someDefaultMethod();
        MyInterface.someStaticMethiod();
    }
}

// below is the class that implements the interface
class MyClass implements MyInterface {
    @Override
    public void someMethod() {          // here we have implemented the method from the interface
        System.out.println("This is a method implemented in MyClass");
    }
}

interface MyInterface {
    int myInt = 5;  // a field which is implicitly public, static and final
    void someMethod(); // we declared a method

    public static void someStaticMethiod() {
        System.out.println("This is a static method in an interface");
    }

    public default void someDefaultMethod() {
        System.out.println("This is a defalut method in an interface");
    }
}

// Interfaces
// We are now allowed to add method implementations in our interfaces.
// Only default and static methods can be implemented in an interface (see above)

// added default and static methods in interfaces are to ensure binary compatibility.
// binary compatibility means that when you change your interface,
// you do not need to make any changes to the classes that implement it.