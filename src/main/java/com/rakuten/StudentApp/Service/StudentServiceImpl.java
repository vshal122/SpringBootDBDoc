package com.rakuten.StudentApp.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.StudentApp.DAO.StudentRepository;
import com.rakuten.StudentApp.Model.Student;
@Service
public class StudentServiceImpl implements IStudentService {

	
	 @Autowired
	 private StudentRepository studentRepository;
	
	@Override
	public Student save(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student update(Long id,Student student) {
		
		if(studentRepository.existsById(id))
		{
			student.setId(id);
			return studentRepository.save(student);
		}
		else {
			throw new BusinessException("Student Detail not Found for id :" +id);
		}
			 
		}

	@Override
	public Student findbyId(Long id) {
		
		if(studentRepository.existsById(id))
		{
			 return studentRepository.getById(id);
		 }
		else
		{
		throw new BusinessException("Given id is not our Table ..How to Search it"+id);
		}
	}
	

	@Override
	public Boolean deleteWithId(Long id)
	{
		Boolean b=false;
		if(studentRepository.existsById(id))
		{
		studentRepository.deleteById(id);
		b=true;
		return b;
		}
		else {
			  throw new  BusinessException("Given Id is not our Table...How Can I delete "+id);
		    }
		
	}

	@Override
	public List<Student> allStudentview() {
		
		return studentRepository.findAll();
	}

	@Override
	public Long getByNameStudent(String name) {
		boolean f= false;
		
		
		Long l= studentRepository.countByName(name);
		if(l>0)
		{
			return l;
		}
		else
		{
			throw new BusinessException("No Search Found..For Name:-"+name);
		}
		 
	}

	@Override
	public Long studentFilter(String context) {
		
		Long l = studentRepository.countBYValue(context);
		if(l>0)
		{
			return l;
		}
		else
		{
			throw new BusinessException("No Search Found For Context....For Context:-"+context);
		}
	
	}

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}


}
