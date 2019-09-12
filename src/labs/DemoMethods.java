package labs;

public class DemoMethods {
    private String name = "Jake";
    public static void main(String[] args) {
        System.out.println(addTwoNumber(2, 3));
        DemoMethods d1 = new DemoMethods();
        d1.sayHi("Raymond");
    }

    public static int addTwoNumber(int n1, int n2) {
        return n1 + n2;
    }

    public void sayHi(String s) {
        System.out.println("good to see you " + s);
        System.out.println("I am " + name);
    }
    // to call this method you have to create an instance which we are doing with d1
}
