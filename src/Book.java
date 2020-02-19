public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int numberOfPages;
    private double price;

    public Book(int id, String name, String author, String publisher, int year, int numberOfPages, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void view() {
        System.out.println("ID= "+ id +" Name= "+ name + " Author= " + author + " Publisher= "+ publisher+" Year= "+ year + " Number of pages= " + numberOfPages+ " Price= "+ price);
    }
}
