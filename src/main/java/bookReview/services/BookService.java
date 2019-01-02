package bookReview.services;

import bookReview.model.Book;
import bookReview.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Iterable<Book> getBooks() {
        return bookRepository.findAll();
    }
}
