package labs;

public class Palindrome {
    public static boolean isPal(String userPal) {
        String upperUserPal = userPal.toUpperCase();

        int count = 0;
        int middleChar = userPal.length() / 2;
        // if length of userPal is 0 or 1, then that means there's nothing else to compare middleChar will = 0 then when compared to count will be true meaning it's a palindrome

        int firstIndex = 0;
        int lastIndex = userPal.length() - 1;

        if (count == middleChar) {
            return true;
        }
        // if there is only one letter or no letters (gotten by middleChar), we stop because nothing else to compare and return true because this means it's a palindrome

        else if (upperUserPal.charAt(firstIndex) == upperUserPal.charAt(lastIndex)) {
            userPal = userPal.substring(firstIndex + 1, lastIndex);
            return isPal(userPal);
        }
        // compares first and last index and if equal, then substring to remove first and last characters to get a new string which you would pass into isPal(userPal) again

        return false;
        // this is the case where when first and last characters are compared and not equal, return false because not a palindrome
    }

    public static void main(String[] args) {
        if (isPal("deed")) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Different word");
        }
    }
}
