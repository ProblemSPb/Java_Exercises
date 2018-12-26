// I want MyGenericClass to work with both Integer and Double and Strings
// we are declaring the class with <T> - type parameter on line 30
// then we change all the Integer keywords in myGenericsClass to T

package Java_Exercises;

public class GerericsDemo {

    public static void main(String[] args) {

        // we specify what type of data we expect in this case
        MyGenericClass<Integer> g = new MyGenericClass();

        // int
        g.setMyVar(6);
        g.printValue();

        // double
        MyGenericClass d = new MyGenericClass();

        d.setMyVar(6.1);
        d.printValue();

        // String
        MyGenericClass s = new MyGenericClass();
        s.setMyVar("Java");
        s.printValue();
    }
}

class MyGenericClass<T> {

    private T myVar; //  it was an integer here

    void setMyVar(T i){ // and here as well there was an int
        myVar = i;
    }

    void printValue() {

        System.out.println("The value of my var is " + myVar);
    }
}