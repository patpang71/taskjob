package com.ppang.angular4spring.taskjob.service;

import com.ppang.angular4spring.taskjob.domain.Task;

public interface TaskService {
	public Iterable<Task> list();
	public Task save(Task task);
}
