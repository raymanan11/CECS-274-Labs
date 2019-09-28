package labs;

public class Shoe {

    String color;
    int size;

    public Shoe(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getType() {
        return "shoes";
    }

    public String describe() {
        return color + " " + getType() + ", size " + size;
    }

    public static void main(String[] args) {
        Boot b1 = new Boot("white", 7, 3);
        System.out.println(b1.describe());

    }

}
    class Boot extends Shoe {
        int height;

        public Boot(String colors, int size, int height) {
            super(colors, size); // goes into Shoe constructor bc Boots is a derived class from Shoe meaning boots has elements color and size which can be reused rather than typing again
            this.height = height;
        }

        public String getType() {
            return "boots";
        }

        public String describe() {
            return super.describe() + ", height " + height;
        }
    }

    class Sneaker extends Boot {
        String lace_color;
        public Sneaker(String color, int size, int height, String lace_color) {
            super(color, size, height);
            this.lace_color = lace_color;
        }

        public String getType() {
            return "sneakers";
        }

        public String describe() {
            return super.describe() + ", lace color " + lace_color;
        }

    }

