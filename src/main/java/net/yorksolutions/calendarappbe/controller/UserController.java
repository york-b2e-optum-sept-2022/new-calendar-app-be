package net.yorksolutions.calendarappbe.controller;


import net.yorksolutions.calendarappbe.models.User;
import net.yorksolutions.calendarappbe.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
@CrossOrigin
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public Iterable<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @PostMapping
    void addNewUser(@RequestBody User user) {
        System.out.println(user);
        this.userService.addNewUser(user);
    }

    @PutMapping
    public void addEventToUser(@RequestParam("user_id") Long user_id, @RequestParam("event_id") Long event_id) {
        this.userService.addEventToUser(user_id, event_id);
    }


}
