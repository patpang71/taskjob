package com.ppang.angular4spring.taskjob.service;

import org.springframework.stereotype.Service;

import com.ppang.angular4spring.taskjob.domain.Task;
import com.ppang.angular4spring.taskjob.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
	
	private TaskRepository taskRepository;
	
	public TaskServiceImpl(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@Override
	public Iterable<Task> list() {
		return this.taskRepository.findAll();
	}

	@Override
	public Task save(Task task) {
		return this.taskRepository.save(task);
	}

}
