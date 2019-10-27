package HomeWork5.Books;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Book 1", 5, "Serega", "A4");
        System.out.println(book.toString());
        System.out.println("===========================");
        Book invalidBook = new Book("", -1, "", "fdvfvsd");
        System.out.println(invalidBook.toString());
    }
}
