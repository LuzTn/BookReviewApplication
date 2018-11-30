package bookReview.model;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "reviews")
public class Reviews {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String comment;

    @ManyToOne
    private Book book;

    @ManyToOne
    private User user;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
