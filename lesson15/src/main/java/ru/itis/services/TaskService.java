package ru.itis.services;

import ru.itis.dto.TaskDto;
import ru.itis.exceptions.TaskNotFoundException;

import java.util.List;

public interface TaskService {
    List<TaskDto> getAllTasks();
    TaskDto getTask(Long id) throws TaskNotFoundException;
    TaskDto saveTask(TaskDto taskDto);
    void deleteTask(Long id);
    TaskDto updateTask(Long id, TaskDto taskDto) throws TaskNotFoundException;
}
