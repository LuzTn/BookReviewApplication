package bookReview.model;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "quotes")
public class Quotes {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String quote;

    @ManyToOne
    private Book book;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
