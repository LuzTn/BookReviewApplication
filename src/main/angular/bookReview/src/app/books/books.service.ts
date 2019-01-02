import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {Book} from "./book.model";

const httpOptions = {
    headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'Accept': 'application/json',
        'Access-Control-Allow-Origin': 'http://localhost:4200'
    })
};

@Injectable()
export class BooksService {
    private bookUrl = 'http://localhost:8080/bookReview/books/';

    constructor(private http: HttpClient) {
    }

    public getBooks(): Observable<Book[]> {
        return this.http.get<Book[]>(this.bookUrl + 'allBooks');
    }

}
