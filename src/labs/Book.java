
import java.util.Scanner;

public class Book {
    String author;
    String title;
    int pages;

    public Book (String userTitle, String userAuthor) {
        title = userTitle;
        author = userAuthor;
    }

    public Book (String userTitle, String userAuthor, int userPages) {
        title = userTitle;
        author = userAuthor;
        pages = userPages;
    }

    public String info() {
        String sentence = title + " written by " + author + " containing " + pages + " pages";
        return sentence;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String myTitle = scnr.nextLine();
        String myAuthor = scnr.nextLine();
        int myPages = scnr.nextInt();

        Book myBook = new Book(myTitle, myAuthor);
        Book myOtherBook = new Book(myTitle, myAuthor, myPages);

        System.out.println(myBook.info());
        System.out.println(myOtherBook.info());


    }
}
