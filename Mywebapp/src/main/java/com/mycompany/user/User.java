package com.mycompany.user;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "users_test")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false, name = "bookName")
    private String bookName;

    @Column(length = 45, nullable = false, name = "bookDescription")
    private String bookDescription;

    @Column(length = 45, nullable = false, name = "bookPrice")
    private Integer bookPrice;

    @Column(length = 45, nullable = false, name = "bookPage")
    private Integer bookPage;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getBookPage() {
        return bookPage;
    }

    public void setBookPage(Integer bookPage) {
        this.bookPage = bookPage;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +

                ", bookName='" + getBookName() + '\'' +

                ", bookDescription='" + getBookDescription() + '\'' +

                ", bookPrice='" + getBookPrice() + '\'' +

                ", bookPage='" + getBookPage() + '\'' +
                '}';
    }

}
