package com.rakuten.StudentApp.Controller;

import java.io.ByteArrayInputStream;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.rakuten.StudentApp.Helper.GeneratePdfReport;
import com.rakuten.StudentApp.Service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.StudentApp.Model.Student;
import com.rakuten.StudentApp.Service.StudentServiceImpl;

@RestController
public class StudentControllerImpl implements IStudentController {

	@Autowired
	public StudentServiceImpl serviceImpl;

	@Override
	public Student createStudent(Student student) {

		return serviceImpl.save(student);
	}

	@Override
	public ResponseEntity<Student> getbyId(Long id) {

		     Student student = serviceImpl.findbyId(id);
		     return ResponseEntity.status(HttpStatus.OK).body(student);
	}

	@Override
	public Student studentUpdate(Long id, Student student) {

		return serviceImpl.update(id, student);
	}

	@Override
	public Boolean deleteStudent(Long id) {
		return serviceImpl.deleteWithId(id);

	}

	@Override
	public ResponseEntity<List<Student>> findAll() {
		
		 List<Student>  student= serviceImpl.allStudentview();
		return  ResponseEntity.status(HttpStatus.OK).body(student);
	}

	@Override
	public Long studentByName(String name) {
		
		return (Long) serviceImpl.getByNameStudent(name);
	}

	@Override
	public Long studentByValue(String context) {
		
		return serviceImpl.studentFilter(context);
	}



	@Override
	public String studentsReport() {

		var students = (List<Student>) serviceImpl.findAll();

		//ByteArrayInputStream bis = GeneratePdfReport.studentsReport(students);

		var headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=studentreport.pdf");

//		return ResponseEntity
//				.ok()
//				.headers(headers)
//				.contentType(MediaType.APPLICATION_PDF)
//				.body(new InputStreamResource(bis));
		return  "good";
	}






}
