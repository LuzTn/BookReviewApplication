import { Component, OnInit } from '@angular/core';
import {User} from "../profiles/user.model";
import {HomeService} from "../home/home.service";
import {FormControl, Validators} from "@angular/forms";

@Component({
  selector: 'app-authentication',
  templateUrl: './authentication.component.html',
  styleUrls: ['./authentication.component.css']
})
export class AuthenticationComponent implements OnInit {

    users: User[];
    user: User = new User();
    signUp: boolean = false;
    signIn: boolean = true;
    constructor(private homeService: HomeService) {

    }
    ngOnInit() {
        this.homeService.getUsers()
            .subscribe( data => {
                this.users = data;
            });
    };

    email = new FormControl('', [Validators.required, Validators.email]);

    getErrorMessage() {
        return this.email.hasError('required') ? 'You must enter a value' :
            this.email.hasError('email') ? 'Not a valid email' :
                '';
    }

    toggleSign() {
        this.signUp = !this.signUp;
        this.signIn = !this.signIn;
    }

    addUser() {
        console.log(this.user.name);
        console.log(this.user.email);
        console.log(this.user.password);
        this.homeService.postUsers(this.user.name, this.user.email, this.user.password) .subscribe( data => {
            console.log("User created successfully.", data);
        });
    }
}
