package com.rakuten.StudentApp.Service;


import java.util.List;

import org.springframework.stereotype.Component;

import com.rakuten.StudentApp.Model.Student;

@Component
public interface IStudentService {
	
	public Student save(Student student);
	public Student update(Long id,Student student);
	public Student findbyId(Long id);
	public Boolean deleteWithId(Long id);
	public List<Student> allStudentview();
	public Long getByNameStudent(String name);
	
	public Long studentFilter(String context);

	   List<Student> findAll();

}
