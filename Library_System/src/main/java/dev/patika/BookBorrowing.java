package dev.patika;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "bookBorrowing")
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_borrow_id")
    private int id;

    @Column(name = "borrower_name")
    private String borrowerName;

    @Column(name = "borrowing_date")
    private String borrowingDate;

    @Column(name = "return_date")
    private String returnDate;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;




    public BookBorrowing() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrowName() {
        return borrowerName;
    }

    public void setBorrowName(String borrowName) {
        this.borrowerName = borrowName;
    }

    public String getBorrowingDate() {
        return borrowingDate;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBorrowingDate(String borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BookBorrowing{" +
                "id=" + id +
                ", borroweName='" + borrowerName + '\'' +
                ", borrowingDate='" + borrowingDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
