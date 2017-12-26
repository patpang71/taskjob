package com.ppang.angular4spring.taskjob.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Task {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@JsonFormat(pattern="MM/dd/yyyy")
	private LocalDate dueDate;
	private boolean completed;
	
	public Task() {}

	public Task(Long id, String name, LocalDate dueDate, boolean completed) {
		super();
		this.id = id;
		this.name = name;
		this.dueDate = dueDate;
		this.completed = completed;
	}

	
}
