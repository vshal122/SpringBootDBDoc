package com.rakuten.StudentApp.Model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name="student")
@Data
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private Integer rollNo;
	@Column
	private  String name;
	@Column
	private Integer age;
	@Column
	private String moNumber;
	
	@Column
	private String joindate;
	
	@OneToMany(fetch= FetchType.EAGER,cascade= CascadeType.ALL,targetEntity = Subject.class)
	private List<Subject> subject;

	public Student(String name,Integer rollNo,String moNumber){
		this.name=name;
		this.rollNo= rollNo;
		this.moNumber=moNumber;
	}

	
	
	public List<Subject> getSubjectDetails() {
		return subject;
	}
	public void setSubjectDetails(List<Subject> subject) {
		this.subject = subject;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getMoNumber() {
		return moNumber;
	}
	public void setMoNumber(String moNumber) {
		this.moNumber = moNumber;
	}
	
	
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(Long id, Integer rollNo, String name, Integer age, String moNumber,String joindate, List<Subject> subject) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.moNumber = moNumber;
		this.joindate = joindate;
		this.subject = subject;
	}
	
	
	

}
