import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../profiles/user.model";


const httpOptions = {
    headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'Accept': 'application/json',
        'Access-Control-Allow-Origin': 'http://localhost:4200'
    })
};

@Injectable()
export class AuthenticationService {
    private userUrl = 'http://localhost:8080/bookReview/users/';

    constructor(private http: HttpClient) {
    }

    public getUsers(): Observable<User[]> {
        return this.http.get<User[]>(this.userUrl + 'allUsers');
    }

    public postUsers(name, email, password): Observable<User> {
        return this.http.post<User>(this.userUrl + 'add', {
            "name": name,
            "email": email,
            "password": password
        }, httpOptions);
    }
}
