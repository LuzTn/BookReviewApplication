import { Component, OnInit } from '@angular/core';
import {UsersService} from "./users.service";
import {FormControl, Validators} from "@angular/forms";
import {User} from "./users.model";

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

    title = 'app';
    users: User[];
    user: User = new User();
    signUp: boolean = false;
    signIn: boolean = true;
    constructor(private userService: UsersService) {

    }
    ngOnInit() {
        this.userService.getUsers()
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
        this.userService.postUsers(this.user.name, this.user.email, this.user.password) .subscribe( data => {
            console.log("User created successfully.", data);
        });
    }

}
