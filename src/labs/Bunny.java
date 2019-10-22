package labs;

public class Bunny {
    public int bunnyEars(int numBunnies) {
        if (numBunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(numBunnies - 1);


    }

    public int bunnyFunnyEars(int bunnyPosition) {
        if (bunnyPosition == 0) {
            return 0;
        }
        else if (bunnyPosition % 2 == 0) {
            return 3 + bunnyFunnyEars(bunnyPosition - 1);
        }
        return 2 + bunnyFunnyEars(bunnyPosition - 1);


    }

    public static void main(String[] args) {
        Bunny bunny = new Bunny();
        System.out.println("total bunny ears :" + bunny.bunnyEars(4));
        System.out.println("total bunny ears :" + bunny.bunnyFunnyEars(4));
    }
}
