public class Barman {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Lemon Drop";
        drink.price = 6.5f;
        drink.zeroAlcohol = false;

        drink.alcohol = new Component();
        drink.alcohol.name = "vodka";
        drink.alcohol.amount = 50;

        drink.potion = new Component();
        drink.potion.name = "lemon juice";
        drink.potion.amount = 50;

        drink.syrup = new Component();
        drink.syrup.name = "sugar syrup";
        drink.syrup.amount = 20;

        System.out.println("Drink name: \"" + drink.name + "\"");
        System.out.println(" -> price: " + drink.price + " PLN");
        System.out.println(" -> capacity: " + (drink.alcohol.amount + drink.potion.amount + drink.syrup.amount) + " [ml]");
        System.out.println("For all of thous who like Lemon's :)");
        System.out.println(drink.alcohol.amount + " ml - " + drink.alcohol.name);
        System.out.println(drink.potion.amount + " ml - " + drink.potion.name);
        System.out.println(drink.syrup.amount + " ml - " + drink.syrup.name);
    }
}
