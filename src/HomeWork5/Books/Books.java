package HomeWork5.Books;

public class Books {
    private String name;
    private int numberOfPages;
    private String author;
    private String format;

    public Books( String name, int numberOfPages, String author, String format){
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.format = format;
    }
    public String toString(){
        return "Название кники"+ " "+name+" "+"количество страниц"+numberOfPages+" "+"Автор книги"+" "+author+" "+"формат книги"+" "+format;
    }
}
