public class JarvisHello {

    public void sayHi(String...names) { // method with multiple Strings

        for (String name: names) {
            System.out.println("Hi " + name + "! How r u?");
        }

    }

    public static void main(String[] args) {
        JarvisHello jarvis = new JarvisHello();
        jarvis.sayHi("Tony", "Cap", "Black Widow");
    }
}
