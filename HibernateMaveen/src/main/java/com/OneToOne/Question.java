package com.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Question {
	
	@Id
	@Column(name = "Question_Id")
	private int qId;
	
	@Column(name = "Questions")
	private String question;
	
	private Answer answer;

	public Question(int qId, String question) {
		super();
		this.qId = qId;
		this.question = question;
	}


	public Question() {
		// TODO Auto-generated constructor stub
	}
}
