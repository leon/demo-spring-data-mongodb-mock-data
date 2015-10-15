package se.radley.demo.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.radley.demo.user.User;
import se.radley.demo.user.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public User user() {
        return userService.findById("leon");
    }
}
