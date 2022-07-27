package ru.homework.tasktracker.strategy.argument;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProjectCreateArgument {
    private String title;
    private String description;
}
