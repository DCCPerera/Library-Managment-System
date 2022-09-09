import java.io.Serializable;

public class Student implements Serializable
{
    private int id;
    private String name;
    private String email;
    private String password;
    private int numberOfBorrowedBooks;
    private int[] booksBorrowed;

    public Student(int id ,String name, String email,String password, int numberOfBorrowedBooks, int[] booksBorrowed) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;
        this.booksBorrowed = booksBorrowed;
    }

    public int getid() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getemail() {
        return email;
    }
    public void setemailng(String name) {
        this.name = email;
    }
    
    
    
    public String getPassword() {
        return password;
    }
    
    public void setpassword(String name) {
        this.name = password;
    }
    
    

    public int getNumberOfBorrowedBooks() {
        return numberOfBorrowedBooks;
    }

    public void setNumberOfBorrowedBooks(int numberOfBorrowedBooks) {
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;
    }

    public int[] getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(int[] booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    @Override
    public String toString() {
        return new StringBuffer(" Id: ").append(this.id).append(" Name : ").append(this.name).append(" Number Of Borrowed Books : ").append(this.numberOfBorrowedBooks).append(" Books Borrowed : ").append(this.booksBorrowed).toString();
    }

}