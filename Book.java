import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable {
    private int serialNo;
    private String title;
    private String author;
    private String category;
    private String placement;
    private boolean borrowed;
    private String borrower;


    public Book(int serialNo, String title, String author, String genre, String placement, boolean borrowed, String borrower){
        this.serialNo = serialNo;
        this.title = title;
        this.author = author;
        this.category = category;
        this.placement = placement;
        this.borrowed = borrowed;
        this.borrower = borrower;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getcategory() {
        return category;
    }

    public void setGenre(String genre) {
        this.category = category;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    @Override
    public String toString() {
        return new StringBuffer(" SerialNo: ").append(this.serialNo).append(" Title : ").append(this.title).append(" Author : ").append(this.author).append(" Category : ").append(this.category).append(" Placement : ").append(this.placement).append(" Borrowed : ").append(this.borrowed).append(" Borrower : ").append(this.borrower).toString();
    }
}
