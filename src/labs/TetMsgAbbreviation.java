package labs;
import java.util.Scanner;

public class TetMsgAbbreviation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Input an abbreviation:");
        String userMsg = scnr.nextLine();

        switch (userMsg) {
            case("IDK"):
                System.out.println("I don't know");
                break;
            case ("LOL"):
                System.out.println("laughing out loud");
                break;
            case ("BFF"):
                System.out.println("best friends forever");
                break;
            case ("IMHO"):
                System.out.println("in my humble opinion");
                break;
            case("TMI"):
                System.out.println("too much information");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
