
public class Library {
    private Book[] books;
    private Student[] students;
    private int nB, nS;


    public Library() {
        books = new Book[100];
        students = new Student[100];
        nB=0;
        nS=0;
    }

    public void addBook(Book book) {

        books[nB++]= book;

    }

    public void addStudent(Student student) {

        students[nS++]= student;

    }

    public void displayBook() {
        for(int i=0; i<nB; i++) {
            books[i].display();
            System.out.println();
        }

    }

    public Book findBook(String title) {
        for(int i=0; i<nB; i++) {
            if(books[i].getTitle() == title) {
                return books[i];
            }
        } return null;

    }

    void borrowBook(String title, Student student) {
        Book book = findBook(title);
        if(book!= null && book.getNumCopies()>0) {
            book.borrow();
            student.borrowBook(book);

        } else {
            System.out.println("Book is not available");
        }


    }

    void returnBook(String title, Student student) {
        Book book = findBook(title);
        if(book != null) {
            book.returnBook();
            student.returnBook(book);
            System.out.println(student.getName() + "returned this" + book.getTitle());

        } else {
            System.out.println("Book was not borrowed by " + student.getName());
        }

    }








}
