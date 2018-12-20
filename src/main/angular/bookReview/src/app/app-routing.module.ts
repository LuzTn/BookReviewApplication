import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BooksComponent} from "./books/books.component";
import {AddBooksComponent} from "./add-books/add-books.component";
import {ProfilesComponent} from "./profiles/profiles.component";
import {HomeComponent} from "./home/home.component";
import {AuthenticationComponent} from "./authentication/authentication.component";

const routes: Routes = [
    {path: '', redirectTo: '/authentication', pathMatch: 'full'
    },{
        path: 'authentication',
        component: AuthenticationComponent
    },{
        path: 'home',
        component: HomeComponent
    }, {
    path: 'books', component: BooksComponent
    }, {
    path: 'addbooks', component: AddBooksComponent
    }, {
    path: 'profile/:userId', component: ProfilesComponent
    }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
