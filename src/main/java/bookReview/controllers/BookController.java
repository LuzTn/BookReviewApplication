package bookReview.controllers;

import bookReview.model.Book;
import bookReview.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path = "/bookReview/books", method = {RequestMethod.GET, RequestMethod.POST})
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(path = "/allBooks")
    public @ResponseBody
    Iterable<Book> getAllBooks() {
        return bookService.getBooks();
    }
}
