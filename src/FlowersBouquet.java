// calculates the price of a bouquet depending on the types and # of flowers in it

import java.util.Scanner;

public class FlowersBouquet {

    int priceFlower;
    int numberFlowers;

    public static void calculator() {

        // lilies
        FlowersBouquet lily = new FlowersBouquet();
        lily.priceFlower = 2;

        Scanner inputLily = new Scanner(System.in);
        System.out.print("Lets create a bouquet for you! \n\nHow many lilies should be in the bouquet: ");
        lily.numberFlowers = inputLily.nextInt();

        // roses
        FlowersBouquet rose = new FlowersBouquet();
        rose.priceFlower = 3;

        Scanner inputRose = new Scanner(System.in);
        System.out.print("How many roses should be in the bouquet: ");
        rose.numberFlowers = inputRose.nextInt();

        // tulips
        FlowersBouquet tulip = new FlowersBouquet();
        tulip.priceFlower = 3;

        Scanner inputTulip = new Scanner(System.in);
        System.out.print("How many tulips should be in the bouquet: ");
        tulip.numberFlowers = inputTulip.nextInt();

        int calculatorPrice = (lily.numberFlowers * lily.priceFlower) + (rose.priceFlower * rose.numberFlowers) + (tulip.numberFlowers * tulip.priceFlower);
        int calculatorFlowers = (lily.numberFlowers + rose.numberFlowers + tulip.numberFlowers);

        System.out.println("The price of your bouquet is: "+ calculatorPrice + "\nThere are " + calculatorFlowers + " flowers in it.");
    }

    public static void main(String[] args) {
        calculator();

    }
}
