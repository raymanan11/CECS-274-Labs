package labs;
import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputMonth;
        int inputDay;

        inputMonth = scnr.next();
        inputDay = scnr.nextInt();

        switch (inputMonth) {
            case("March"):
                if(inputDay >= 20 && inputDay <= 31) {
                    System.out.println("spring");
                }
                else if (inputDay >= 1 && inputDay <= 19){
                    System.out.println("winter");
                }
                else {
                    System.out.println("invalid");
                }
                break;
            case("April"):
                if(inputDay >= 1 && inputDay <= 30) {
                    System.out.println("spring");
                }
                else {
                    System.out.println("invalid");
                }
                break;
            case("May"):
                if(inputDay >= 1 && inputDay <= 31) {
                    System.out.println("spring");
                }
                else {
                    System.out.println("invalid");
                }
                break;
            case("June"):
                if(inputDay >= 1 && inputDay <= 20) {
                    System.out.println("spring");
                }
                else if (inputDay > 20 && inputDay <= 30){
                    System.out.println("summer");
                }
                else {
                    System.out.println("invalid");
                }
                break;
            case("July"):
                if(inputDay >= 1 && inputDay <= 31) {
                    System.out.println("summer");
                }
                else {
                    System.out.println("invalid");
                }
                break;
            case("August"):
                if(inputDay >= 1 && inputDay <= 31) {
                    System.out.println("summer");
                }
                else {
                    System.out.println("invalid");
                }
                break;
            case("September"):
                if(inputDay >= 1 && inputDay <= 21) {
                    System.out.println("summer");
                }
                else if (inputDay > 21 && inputDay <= 30){
                    System.out.println("autumn");
                }
                else {
                    System.out.println("invalid");
                }
                break;
            case("October"):
                if(inputDay >= 1 && inputDay <= 31) {
                    System.out.println("autumn");
                }
                else {
                    System.out.println("invalid");
                }
                break;
            case("November"):
                if(inputDay >= 1 && inputDay <= 30) {
                    System.out.println("autumn");
                }
                else {
                    System.out.println("invalid");
                }
                break;
            case("December"):
                if(inputDay >= 1 && inputDay <= 20) {
                    System.out.println("autumn");
                }
                else if (inputDay > 20 && inputDay <= 31){
                    System.out.println("winter");
                }
                else {
                    System.out.println("invalid");
                }
                break;
            case("January"):
                if(inputDay >= 1 && inputDay <= 31) {
                    System.out.println("winter");
                }
                else {
                    System.out.println("invalid");
                }
                break;
            case("February"):
                if(inputDay >= 1 && inputDay <= 28) {
                    System.out.println("autumn");
                }
                else {
                    System.out.println("invalid");
                }
                break;
            default:
                System.out.println("invalid");
                break;

        }


    }
}
