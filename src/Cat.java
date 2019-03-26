
/*
Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.

Должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() { }

    public boolean fight(Cat anotherCat) {

        if (this.strength > anotherCat.strength) {
            return true;
        }
            else {
                return false;
        }
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.strength = 3;

        Cat cat2 = new Cat();
        cat2.strength = 6;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));


    }
}
