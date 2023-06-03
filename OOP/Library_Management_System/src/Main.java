
public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", "9780451524935", 10);
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", 15);
        Book b3 = new Book("Animal Farm", "George Orwell", "9780451526342", 20);
        Book b4 = new Book("Brave New World", "Aldous Huxley", "9780060850524", 25);
        Book b5 = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", 30);
        Student s1 = new Student("Ember", 8376);
        Student s2 = new Student("Rache", 2145);
        Student s3 = new Student("Tyler", 6982);
        Student s4 = new Student("Breezy", 4821);
        Student s5 = new Student("Maria", 3619);
        Library library = new Library();
        s1.borrowBook(b2);
        s3.borrowBook(b1);
        s5.borrowBook(b4);
        s1.display();
        s3.display();
        s5.display();
        b4.display();

        s3.returnBook(b1);
        s2.returnBook(b3);
        s1.returnBook(b2);
        s5.returnBook(b5);
        System.out.println(b1.getNumCopies());

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.addStudent(s1);
        library.addStudent(s2);

        library.displayBook();

        library.borrowBook("Animal Farm", s1);

        library.returnBook("Harry Potter", s1);
        b1.display();
        b1.borrow();
        b1.returnBook();

    }

}
