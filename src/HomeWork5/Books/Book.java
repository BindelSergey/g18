package HomeWork5.Books;

public class Book {

    private String name;
    private int numberOfPages;
    private String author;
    private String format;

    public Book(String name, int numberOfPages, String author, String format) {
        if (name.isEmpty()) {
            this.name = "Some default name.";
        } else {
            this.name = name;
        }
        if (numberOfPages <= 2) {
            this.numberOfPages = 3;
        } else {
            this.numberOfPages = numberOfPages;
        }
        if (author.isEmpty()) {
            this.author = "фамилия";
        } else {
            this.author = author;
        }
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String toString() {
        return "Название кники: " + name + ";\nколичество страниц: " + numberOfPages + ";\nАвтор книги: " + author + ";\nформат книги: " + format + ".";
    }
}
