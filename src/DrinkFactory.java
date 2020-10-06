public class DrinkFactory {
    public static void main(String[] args) {
        Drink drink1 = new Drink();

        drink1.name = "Americano";
        drink1.amountPln = 40.50F;
        drink1.alcoholic = true;
        drink1.ingredientsName1 = "Campari";
        drink1.ingredientsVolumeInMillilitre1= 30;
        drink1.ingredientsName2 = "Red Martini";
        drink1.ingredientsVolumeInMillilitre2 = 30;
        drink1.ingredientsName3 = "Sparkling Water";
        drink1.ingredientsVolumeInMillilitre3 = 10;

        System.out.println("DRINK RECIPE");
        System.out.printf("Name: %s\n", drink1.name);
        System.out.printf("Amount: %.2fPLN\n", drink1.amountPln);
        System.out.printf("Include alcohol: %s\n",drink1.alcoholic);
        System.out.printf("Ingredient 1: %s (%dml)\n", drink1.ingredientsName1,drink1.ingredientsVolumeInMillilitre1);
        System.out.printf("Ingredient 2: %s (%dml)\n", drink1.ingredientsName2 ,drink1.ingredientsVolumeInMillilitre2);
        System.out.printf("Ingredient 3: %s (%dml)\n", drink1.ingredientsName3,drink1.ingredientsVolumeInMillilitre3);
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.printf("Total volume: %dml\n", (drink1.ingredientsVolumeInMillilitre1
                + drink1.ingredientsVolumeInMillilitre2
                + drink1.ingredientsVolumeInMillilitre3));

    }
}
