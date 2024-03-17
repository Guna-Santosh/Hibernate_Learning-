package com.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	@Column(name = "Question_Id")
	private int qId;
	
	@Column(name = "Questions")
	private String question;
	
	@Column(name = "Answers")
	private String answer;

	public Question(int qId, String question, String answer) {
		super();
		this.qId = qId;
		this.question = question;
		this.answer = answer;
	}


	public Question() {
		// TODO Auto-generated constructor stub
	}
}
