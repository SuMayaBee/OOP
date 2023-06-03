
public class Student {
    private String name;
    private int ID, n;
    private Book[] borrowedbooks= new Book[100];

    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public Book[] getBorrowedbooks() {
        return borrowedbooks;
    }

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
        n=0;
    }



    void display() {
        System.out.println("Name:" + this.name);
        System.out.println("ID:" + this.ID);
        System.out.println("Borrowed books:");
        for(int i=0; i<n; i++) {
            System.out.println("- "+ borrowedbooks[i].getTitle());
        }

    }

    void borrowBook(Book book) {
        if(n<30) {
            book.borrow();
            borrowedbooks[n]= book;
            n++;
            System.out.println(this.name + " has borrowed " + book.getTitle() + ".");
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }



    void returnBook(Book book) {
        int a=0;
        for(int i=0; i<n; i++) {
            if(borrowedbooks[i]==book) {
                book.returnBook();
                borrowedbooks[i]=null;
                n--;
                a=1;
                break;

            }

        } if(a==0) {
            System.out.println("The book was not borrowed");
        }
    }



}
