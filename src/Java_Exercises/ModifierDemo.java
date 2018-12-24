package Java_Exercises;

public class ModifierDemo {

    public int publicNum = 2;
    protected int protectedNum = 3;
    int packagePrivateNum = 4;
    private int privateNum = 1;


}

// PRIVATE is only accessible within the class in which it is declared

// PROTECTED is accessible within the class in which it is declared,
// any class that is derived from it and any class that is in the same package as the class that it is declared in.

//anything declared WITHOUT an access modifier is package-private and
// is only accessible within the package in which it is declared