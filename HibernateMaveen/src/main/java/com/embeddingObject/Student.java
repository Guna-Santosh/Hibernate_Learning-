package com.embeddingObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "School_Students")
public class Student {

	@Id
	@Column(name = "Stu_Id")
	private int id;

	@Column(name = "Stu_name")
	private String name;

	private Certificate cert;

	private Address address;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public Student() {
	}

}
