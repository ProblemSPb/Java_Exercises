public class CatClass {

    String name;
    int age;

    static int count;

    public void sayMeow() {
        System.out.println("The kitty said: Meeeeooowww! Meow!");
    }

    public void aboutCat() {
        System.out.println("This is my cat " + name + ". Cat's age is " + age + ".");
    }

    public static void main(String[] args) {

        CatClass tom = new CatClass();
        tom.name = "Tom";
        tom.age = 3;
        count++;

        CatClass fluffy = new CatClass();
        fluffy.name = "Fluffy";
        fluffy.age = 2;
        count++;

        tom.aboutCat();
        tom.sayMeow();
        System.out.println();

        fluffy.aboutCat();
        fluffy.sayMeow();
        System.out.println();

        System.out.println("Looks like I have " + count + " cats.");
    }

}
