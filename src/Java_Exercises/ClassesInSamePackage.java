package Java_Exercises;

public class ClassesInSamePackage {

    // just an empty class
    }

    class ClassA extends Java_Exercises.ModifierDemo {

        public void printMessages() {
            // this is ok
            System.out.println(publicNum);
            // this is ok
            System.out.println(protectedNum);
            // this is ok
            System.out.println(packagePrivateNum);
            // this is NOT ok
            // System.out.println(privateNum);
        }

    class ClassB {
            //In ClassB, as the class is not derived from ModifierDemo,
            // we need to instantiate a ModifierDemo object p in order to access the fields of ModifierDemo.

            public void printMessages() {
                Java_Exercises.ModifierDemo p = new Java_Exercises.ModifierDemo();

                // this is ok
                System.out.println(p.publicNum);
                // this is ok
                System.out.println(p.protectedNum);
                // this is ok
                System.out.println(p.packagePrivateNum);
                // this is NOT ok
                // System.out.println(p.privateNum);
            }

        }

}
