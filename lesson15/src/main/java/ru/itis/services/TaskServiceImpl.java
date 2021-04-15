package ru.itis.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.dto.TaskDto;
import ru.itis.exceptions.TaskNotFoundException;
import ru.itis.models.Task;
import ru.itis.repositories.TaskRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<TaskDto> getAllTasks() {
        return taskRepository.findAll().stream().map(task -> modelMapper.map(task, TaskDto.class)).collect(Collectors.toList());
    }

    @Override
    public TaskDto getTask(Long id) {
        return taskRepository.findById(id).map(task -> modelMapper.map(task, TaskDto.class))
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public TaskDto saveTask(TaskDto taskDto) {
        Task task = Task.builder()
                .description(taskDto.getDescription())
                .title(taskDto.getTitle())
                .build();

        Task savedTask = taskRepository.save(task);

        return modelMapper.map(savedTask, TaskDto.class);

    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public TaskDto updateTask(Long id, TaskDto taskDto) {
        Task taskForUpdate = taskRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);

        taskForUpdate.setDescription(taskDto.getDescription());
        taskForUpdate.setTitle(taskDto.getTitle());

        Task savedTask = taskRepository.save(taskForUpdate);

        return modelMapper.map(savedTask, TaskDto.class);
    }
}
