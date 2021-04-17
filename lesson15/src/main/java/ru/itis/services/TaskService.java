package ru.itis.services;

import ru.itis.dto.TaskDto;

import java.util.List;

public interface TaskService {
    List<TaskDto> getAllTasks();
    TaskDto getTask(Long id);
    TaskDto saveTask(TaskDto taskDto);
    void deleteTask(Long id);
    TaskDto updateTask(Long id, TaskDto taskDto);
}
