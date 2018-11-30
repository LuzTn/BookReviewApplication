package bookReview.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String title;

    @ManyToMany
    private Set<Author> author;

    @OneToMany
    private Set<Quotes> quotes;
    private String imgUrl;
    private String linkToPurchase;

    @OneToMany
    private List<Reviews> reviews;

    @ManyToMany
    private Set<User> readers;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Set<Quotes> getQuotes() {
        return quotes;
    }

    public void setQuotes(Set<Quotes> quotes) {
        this.quotes = quotes;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLinkToPurchase() {
        return linkToPurchase;
    }

    public void setLinkToPurchase(String linkToPurchase) {
        this.linkToPurchase = linkToPurchase;
    }

    public Set<User> getReaders() {
        return readers;
    }

    public void setReaders(Set<User> readers) {
        this.readers = readers;
    }

    public List<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(List<Reviews> reviews) {
        this.reviews = reviews;
    }
}
