package ua.HabitQuest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.HabitQuest.Entity.Users;
import ua.HabitQuest.Repository.UsersRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    private UsersRepository usersRepository;

    @Autowired
    public UsersService (UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    public Optional<Users> findUsersByUsername(String Username) {
        return usersRepository.findByUsername(Username);
    }

    public boolean getLogicByUser(String username) {
        return !usersRepository.findByUsername(username).isEmpty();
    }

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public void saveUserToDB(Users users) {
        usersRepository.save(users);
    }
}
