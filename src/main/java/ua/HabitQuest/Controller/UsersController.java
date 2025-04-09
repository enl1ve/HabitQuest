package ua.HabitQuest.Controller;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ua.HabitQuest.Entity.Users;
import ua.HabitQuest.Service.UsersService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/")
    public List<Users> getAllUsers () {
        return usersService.getAllUsers();
    }

    @PostMapping("/reg")
    public String saveNewUser(@RequestBody @Valid Users users,
                              BindingResult bindingResult) {
        usersService.saveUserToDB(users);

        return "User registered successfully";
    }
}
