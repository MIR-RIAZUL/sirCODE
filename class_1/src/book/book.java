
package book;

import java.util.Scanner;

public class book {
    String title;
    String author;
    String publisher;
    double price;
    int pages;

    book(String t, String a, String p, double pr, int pg) {
        title = t;

        author = a;
        publisher = p;
        price = pr;

        pages = pg;
    }

    void display() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);


        System.out.println("Author: " + author);
        System.out.println("Publisher: "+ publisher);

        System.out.println("Price: " + price);

        System.out.println("Pages: " +pages);
    }

    void rtm() {
        System.out.print("Sell price: ");
        System.out.println(price * .10);
    }
}


class Ebook extends book {

    Ebook(String t, String a, String p, double pr, int pg) {
        super(t, a, p, pr, pg);
    }

    void showPages() {
        System.out.println("Pages of ebook: " + pages);
    }
}

class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Book Details:");

        System.out.print("Title: ");
        String bt = input.nextLine();

        System.out.print("Author: ");
        String ba = input.nextLine();

        System.out.print("Publisher: ");
        String bp = input.nextLine();

        System.out.print("Price: ");
        double bpr = input.nextDouble();

        System.out.print("Pages: ");
        int bpg = input.nextInt();

        Ebook b = new Ebook(bt, ba, bp, bpr, bpg);

        b.display();
        b.rtm();
        b.showPages();

    }
}
