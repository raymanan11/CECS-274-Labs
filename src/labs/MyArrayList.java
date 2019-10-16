package labs;

public class MyArrayList {
    int arraySize = 3;
    String[] values = new String[arraySize];
    int index = 0;

    public void add(String userAdd) {
        if (index >= arraySize) {
            resize(index);
            values[index] = userAdd;
            index++;
        }
        else {
            values[index] = userAdd;
            index++;
        }
    }

    public void set(int index, String newUserAdd) {
        values[index] = newUserAdd;
    }

    private void resize(int ArraySize) {
        String[] newArray = new String[ArraySize + 1];
        for (int i = 0; i < ArraySize; i++) {
            newArray[i] = values[i];
        }
        values = newArray;
    }

    public String toString() {
        String indexes = "";
        for (int i = 0; i < index; i++) {
            indexes = (indexes + i + ": " + values[i] + '\n');
        }
        return indexes;
    }

    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add("First");
        myList.add("Second");
        myList.add("Third");
        myList.add("Fourth");
        System.out.println(myList.toString());


    }
}




