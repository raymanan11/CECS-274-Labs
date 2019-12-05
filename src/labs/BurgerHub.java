package labs;
import java.util.Scanner;

public class BurgerHub {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean key = true;
        Queue queue = new Queue();
        do {
            System.out.println("Type \"1\" to take order, \"2\" to serve customer, \"3\" to display backlog info, otherwise quit");
            String userChoice = scnr.nextLine();
            switch(userChoice) {
                case "1":
                    System.out.println("Please enter your order details:");
                    System.out.println("Entry name:");
                    String food = scnr.nextLine();
                    System.out.println("Drink:");
                    String drink = scnr.nextLine();
                    System.out.println("Side:");
                    String side = scnr.nextLine();
                    FastFood fastFood = new FastFood(food, drink, side);
                    queue.enqueue(fastFood);
                    break;
                case "2":
                    System.out.println("Order " + queue.dequeue() + " served.");

                    break;
                case "3":
                    System.out.println(queue);
                    break;
                default:
                    key = false;

            }
        }
        while(key);

    }
}
