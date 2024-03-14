public class Book extends Item{
    String author;
    int numberOfPages;
    String genre;

    public Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println("Genre: " + genre);
    }
}
