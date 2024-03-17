package com.test;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name = "Emplopees_Details")
public class Employees {

	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int empId;

	@Column(name = "first_name")
	public String firstName;

	@Column(name = "last_name")
	public String lastName;

	@Column(name = "email")
	public String email;

	@Column(name = "phone_number")
	public int phNumber;

	@Column(name = "hire_date")
	@Temporal(TemporalType.DATE)
	public Date hireDate;

	@Column(name = "job_id")
	public int jobId;

	@Column(name = "salary")
	public int salary;

	@Column(name = "manager_id")
	public int managerId;

	@Column(name = "department_id")
	public int departmentId;

	@Lob
	@Column(name = "Profile_pic")
	public byte[] image;

	@Transient
	public String workPlace;

	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(int empId, String firstName, String lastName, String email, int phNumber, Date hireDate, int jobId,
			int salary, int managerId, int departmentId, byte[] image, String workPlace) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phNumber = phNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.managerId = managerId;
		this.departmentId = departmentId;
		this.image = image;
		this.workPlace = workPlace;
	}

}
