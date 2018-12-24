package anotherpackage;

import Java_Exercises.ModifierDemo;

public class ClassesInAnotherPackage {

    // just an empty class
}

    class MyClassC extends Java_Exercises.ModifierDemo {

    public void printMessages() {

        // This is ok
        System.out.println(publicNum);
        // This is ok
        System.out.println(protectedNum);
        // This is NOT ok
        // System.out.println(packagePrivateNum);
        // This is NOT ok
        // System.out.println(privateNum);

    }

    class MyClassD {

        public void printMessages() {

            Java_Exercises.ModifierDemo p = new ModifierDemo();

            // this is ok
            System.out.println(p.publicNum);
            // this is NOT ok
            // System.out.println(p.protectedNum);
            // this is ok
            // System.out.println(p.packagePrivateNum);
            // This is NOT ok
            // System.out.println(p.privateNum);
        }
    }
}
