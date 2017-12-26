/**
 * 
 */
package com.ppang.angular4spring.taskjob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ppang.angular4spring.taskjob.domain.Task;
import com.ppang.angular4spring.taskjob.service.TaskService;

/**
 * @author kaitaipang
 *
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	
	private TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping(value = {"", "/"} )
	public Iterable<Task> listTasks() {
		return this.taskService.list();
	}
	
	@PostMapping("/save")
	public Task saveTask(@RequestBody Task task) {
		return this.taskService.save(task);
	}
}
