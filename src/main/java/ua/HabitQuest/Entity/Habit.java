package ua.HabitQuest.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Habit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "primary_habit")
    private Date primaryHabit;

    @Column(name = "final_habit")
    private Date finalHabit;

    @Column(name = "streak_days")
    private int streakDays;
}
