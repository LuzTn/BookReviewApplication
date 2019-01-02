import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {AppService} from "./app.service";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {AppRoutingModule} from "./app-routing.module";
import {MatButtonModule, MatCardModule, MatInputModule} from "@angular/material";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { BooksComponent } from './books/books.component';
import { ProfilesComponent } from './profiles/profiles.component';
import { AddBooksComponent } from './add-books/add-books.component';
import {HomeComponent} from "./home/home.component";
import { AuthenticationComponent } from './authentication/authentication.component';
import {AuthenticationService} from "./authentication/authentication.service";
import {BooksService} from "./books/books.service";

@NgModule({
    declarations: [
        AppComponent,
        HomeComponent,
        BooksComponent,
        ProfilesComponent,
        AddBooksComponent,
        AuthenticationComponent
    ],
    imports: [
        BrowserModule,
        HttpClientModule,
        AppRoutingModule,
        MatCardModule,
        MatInputModule,
        FormsModule,
        ReactiveFormsModule,
        MatButtonModule
    ],
    providers: [AppService, AuthenticationService, BooksService],
    bootstrap: [AppComponent]
})
export class AppModule {
}
