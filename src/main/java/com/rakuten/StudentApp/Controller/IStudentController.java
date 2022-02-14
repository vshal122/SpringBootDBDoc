package com.rakuten.StudentApp.Controller;

import java.io.ByteArrayInputStream;
import java.util.List;

import com.rakuten.StudentApp.Helper.GeneratePdfReport;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rakuten.StudentApp.Model.Student;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RequestMapping("/student")
public interface IStudentController {
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student);
	
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Student> getbyId(@PathVariable("id") Long id);
	
	@PutMapping("/update/{id}")
	public Student studentUpdate(@PathVariable("id") Long id,@RequestBody Student student);
	
	@DeleteMapping("delete/{id}")
	public Boolean deleteStudent(@PathVariable("id") Long id);
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Student>> findAll();
	
	@GetMapping("/Name/{name}")
	public Long studentByName(@PathVariable("name") String name);
	
	@GetMapping("/filter/{contex}")
	public Long studentByValue(@PathVariable("contex")  String  contex); 
	// name/mobile/date



	@GetMapping(value = "/pdfreport",
			produces = MediaType.APPLICATION_PDF_VALUE)
	public String studentsReport();

}
