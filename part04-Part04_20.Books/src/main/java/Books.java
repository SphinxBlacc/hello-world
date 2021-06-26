/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sudha_000
 */
public class Books {
    
    private String bookTitle;
    private int bookPages;
    private int bookPublicationYear;
    
    public Books(String title, int pages, int publicationYear) {
        this.bookTitle = title;
        this.bookPages = pages;
        this.bookPublicationYear = publicationYear;
    }
    
    public String toString() {
        return this.bookTitle + ", " + this.bookPages + " pages, " + this.bookPublicationYear;
    }
    
    public String getBookTitle() {
        return this.bookTitle;
    }
}
