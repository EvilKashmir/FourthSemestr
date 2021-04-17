package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.itis.dto.TaskDto;
import ru.itis.services.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<List<TaskDto>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskDto> getTask(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getTask(id));
    }

    @PostMapping(consumes = "application/x-www-form-urlencoded")
    public ResponseEntity<TaskDto> saveTaskHttp(TaskDto taskDto) {
        return ResponseEntity.ok(taskService.saveTask(taskDto));
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<TaskDto> saveTaskJson(@RequestBody TaskDto taskDto) {
        return ResponseEntity.ok(taskService.saveTask(taskDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTasks(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskDto> updateTasks(@PathVariable Long id, @RequestBody TaskDto taskDto) {
        return ResponseEntity.ok(taskService.updateTask(id, taskDto));
    }
}
