package bookReview.controllers;

import bookReview.model.User;
import bookReview.repositories.UserRepository;
import bookReview.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path = "/bookReview", method = {RequestMethod.GET, RequestMethod.POST})
public class UserController {
    @Autowired
    private UsersService usersService;


    @PostMapping(path = "/add") // Map ONLY GET Requests
    public @ResponseBody
    String addNewUser(@RequestBody User user) {
        usersService.addNewUser(user);
        return "saved";
    }

    @GetMapping(path = "/allUsers")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return usersService.getAllUsers();
    }
}