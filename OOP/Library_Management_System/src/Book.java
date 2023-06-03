
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int numCopies;

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getNumCopies() {
        return numCopies;
    }

    public Book(String title, String author, String ISBN, int numCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numCopies = numCopies;
    }


    void display() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(ISBN);
        System.out.println(numCopies);

    }

    void borrow() {
        if( numCopies>0) {
            numCopies--;
        } else {
            System.out.println("Books can't be borrowed.");
        }
    }

    void returnBook() {
        numCopies++;
    }

}
