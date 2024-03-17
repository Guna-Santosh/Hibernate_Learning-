package com.embeddingObject;

import javax.persistence.Embeddable;

import lombok.Data;

/* @Data is create a automatic getter() , setter() 
 * @Embeddable is use to store multiply objects in a single table
*/
@Data
@Embeddable
public class Certificate {

	private String id;
	private String course;
	private String duration;
}
