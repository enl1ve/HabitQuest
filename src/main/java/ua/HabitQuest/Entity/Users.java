package ua.HabitQuest.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull @Size(min = 3, max = 30)
    @Column(name = "username")
    private String username;

    @NotNull @Email
    @Column(name = "email")
    private String email;

    @NotNull @Size(min = 6, max = 20)
    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "bio")
    private String bio;
}
