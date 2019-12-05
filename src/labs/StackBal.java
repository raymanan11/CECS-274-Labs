package labs;
import java.util.Scanner;

public class StackBal {
    NodeChar top;

    public StackBal() {
        top = null;
    }

    public void push(char c) {
        NodeChar newNode = new NodeChar(c);
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        NodeChar temp = null;
        if (top != null) {
            temp = top;
            top = top.next;
        }
        return temp.data;
    }

    public boolean isBalanced(String userString) {
        int size = 0;
        boolean balanced = true;
        char[] openingBraces = {'(', '[', '{'};
        char[] closingBraces = {')', ']', '}'};

        for (int i = 0; i < userString.length(); i++) {
            for (int j = 0; j < openingBraces.length; j++) {
                if(userString.charAt(i) == openingBraces[j]) {
                    // this for loop is used for compare if a character is equal to any of opening braces
                    size++;
                    push(userString.charAt(i));
                }
                if(userString.charAt(i) == closingBraces[j]) {
                    try {
                        char pooped = pop();
                        // checks if the popped value and end bracket are matching, if matching decrement size
                        // at the end, if balanced, size should be zero
                        if(pooped == '(' && userString.charAt(i) == ')') {
                            size--;
                        }
                        else if (pooped == '{' && userString.charAt(i) == '}') {
                            size--;
                        }
                        else if (pooped == '[' && userString.charAt(i) == ']') {
                            size--;
                        }
                    }
                    catch(NullPointerException e) {
                        size--;
                        // comes here when there are more end brackets than opening brackets
                        // because every time that there is a end bracket, it pops but if more end than
                        // opening brackets then that means when there is another end bracket left and
                        // try to pop, it will become an error because the stack is empty meaning its unbalanced
                        balanced = false;
                        break;
                    }
                }
            }
        }
        if(size == 0) {
            balanced = true;
        }
        if (size > 0 || size < 0) {
            balanced = false;
        }
        return balanced;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter an expression: ");
        String userString = sc.nextLine();

        StackBal stack = new StackBal();
        System.out.println(stack.isBalanced(userString));

        // (3+4*[12/87])
        // (3*[12/87}+2/54]
        // {(2+3)+7)}
        // [(3*{12/87}+2/54])
    }
}

