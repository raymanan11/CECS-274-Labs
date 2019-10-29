package labs;

public class Palindromes {
    public static boolean isPal(String userPal) {
        String upperUserPal = userPal.toUpperCase();

        int firstIndex = 0;
        int lastIndex = userPal.length() - 1;

        if (userPal.length() <= 1) {
            return true;
        }

        else if (upperUserPal.charAt(firstIndex) == upperUserPal.charAt(lastIndex)) {
            userPal = userPal.substring(firstIndex + 1, lastIndex);
            return isPal(userPal);
        }

        return false;
    }

    public static void main(String[] args) {
        if (isPal("Radbr")) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Different word");
        }
    }
}
