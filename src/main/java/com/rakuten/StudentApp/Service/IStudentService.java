package com.rakuten.StudentApp.Service;


import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rakuten.StudentApp.Model.Student;
import org.springframework.web.multipart.MultipartFile;


public interface IStudentService {
	
	public Student save(Student student);

	public  List<Student> importFile(MultipartFile file) throws IOException;

	public Student update(Long id,Student student);
	public Student findbyId(Long id);
	public Boolean deleteWithId(Long id);
	public List<Student> allStudentview();
	public Long getByNameStudent(String name);
	
	public Long studentFilter(String context);

	   List<Student> findAll();


}
