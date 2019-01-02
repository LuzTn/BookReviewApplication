import { Component, OnInit } from '@angular/core';
import {BooksService} from "./books.service";
import {Book} from "./book.model";

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})

export class BooksComponent implements OnInit {

  books: Book[];

  constructor(private bookService: BooksService) { }

  ngOnInit() {
  this.bookService.getBooks()
          .subscribe( data => {
              this.books = data;
          });
  }

}
