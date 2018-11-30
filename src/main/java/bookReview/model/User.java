package bookReview.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;

    private String password;

    @ManyToMany
    private Set<Book> booksToRead;

    @ManyToMany
    private Set<Book> currentlyReading;

    @ManyToMany
    private Set<Book> ReadBooks;

    @OneToMany
    private List<Reviews> comments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Book> getBooksToRead() {
        return booksToRead;
    }

    public void setBooksToRead(Set<Book> booksToRead) {
        this.booksToRead = booksToRead;
    }

    public Set<Book> getCurrentlyReading() {
        return currentlyReading;
    }

    public void setCurrentlyReading(Set<Book> currentlyReading) {
        this.currentlyReading = currentlyReading;
    }

    public Set<Book> getReadBooks() {
        return ReadBooks;
    }

    public void setReadBooks(Set<Book> readBooks) {
        ReadBooks = readBooks;
    }

    public List<Reviews> getComments() {
        return comments;
    }

    public void setComments(List<Reviews> comments) {
        this.comments = comments;
    }

}