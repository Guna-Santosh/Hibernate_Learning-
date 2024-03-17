package com.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Answer {
	
	@Id
	@Column(name = "Answer_Id")
	private int aId;
	
	@Column(name = "Answer")
	private String answer;
	
}
