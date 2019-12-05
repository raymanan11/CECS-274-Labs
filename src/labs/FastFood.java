package labs;

public class FastFood {
    private String food;
    private String drink;
    private String side;

    public FastFood(String food, String drink, String side) {
        this.food = food;
        this.drink = drink;
        this.side = side;
    }

    public String toString() {
        return food + "/" + drink + "/" + side;
        // customizes what is printed out when printing out reference variable fastFood
        // otherwise it will print out the address which we don't want
    }
}
