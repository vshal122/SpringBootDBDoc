package com.rakuten.StudentApp.Controller;

import com.rakuten.StudentApp.Model.Student;
import com.rakuten.StudentApp.Service.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@Slf4j
public class StudentControllerImpl implements IStudentController {

	@Autowired
	public StudentServiceImpl serviceImpl;

	@Override
	public Student createStudent(Student student) {

		return serviceImpl.save(student);
	}

	@Override
	public List<Student> importMethod(MultipartFile file) throws IOException {
		return serviceImpl.importFile(file);
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

   public  List<Student>  getAllStudent()
   {
	   return serviceImpl.getAllStudents();
   }

	@Override
	public List<Student> getByName() {
		return  serviceImpl.getByName();
	}

	@Override
	public Page<Student> getByAge() {
		return serviceImpl.getByAge();
	}

	@Override
	public String getMapMethod(String filter) {
		//String query =filter.get("filter");

		//log.info("inside @class SiteJobController @method create @param Job", kv("job ", job));

		JSONObject jsonpObject = new JSONObject(filter);
		String value1=jsonpObject.getString("_s");

		System.out.println("Inside getMap Method :"+filter+"value  :"+value1);

		return filter;
	}


}
