package com.ppang.angular4spring.taskjob.repository;

import org.springframework.data.repository.CrudRepository;

import com.ppang.angular4spring.taskjob.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
