package pkg.exec1;

import java.util.ArrayList;
import java.util.Scanner;

public class BookHandler {
    private ArrayList<String> books = new ArrayList<>();

    void Handle(int opt) {
        switch (opt) {
            case 1:
                showAll();
                break;
            case 2:
                insert();
                break;
            case 3:
                deleteOne();
                break;
            default:
                break;
        }
    }

    private void showAll() {
        System.out.println("***** all books ******");

        for (String book : books) {
            System.out.println(book);
        }
        System.out.println("***** over ******");
    }

    private void insert() {
        System.out.println("input new book name:");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        if (name.isEmpty()) {
            System.out.println("invalid book name " + name);
            return;
        }
        if (books.contains(name)) {
            System.out.println("book already exists");
            return;
        }
        books.add(name);
        System.out.println("new book: " + name);
    }

    private void deleteOne() {
        System.out.println("input book name:");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        if (books.contains(name)) {
            books.remove(name);
            return;
        } else {
            System.out.println("no such book");
        }
    }
}
