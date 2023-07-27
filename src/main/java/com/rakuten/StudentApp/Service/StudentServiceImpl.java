package com.rakuten.StudentApp.Service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.rakuten.StudentApp.DAO.SearchCriteria;
import com.rakuten.StudentApp.Helper.SearchOperation;
import com.rakuten.StudentApp.Helper.StudentSpecification;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rakuten.StudentApp.DAO.StudentRepository;
import com.rakuten.StudentApp.Model.Student;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

@Service
@Slf4j
public class StudentServiceImpl implements IStudentService {


	@Autowired
	private StudentRepository studentRepository;

	@PersistenceContext
	private EntityManager entityManager;



	@Override
	public Student save(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public Student update(Long id, Student student) {

		if (studentRepository.existsById(id)) {
			student.setId(id);
			return studentRepository.save(student);
		} else {
			throw new BusinessException("Student Detail not Found for id :" + id);
		}

	}

	@Override
	public Student findbyId(Long id) {

		if (studentRepository.existsById(id)) {
			return studentRepository.getById(id);
		} else {
			throw new BusinessException("Given id is not our Table ..How to Search it" + id);
		}
	}


	@Override
	public Boolean deleteWithId(Long id) {
		Boolean b = false;
		if (studentRepository.existsById(id)) {
			studentRepository.deleteById(id);
			b = true;
			return b;
		} else {
			throw new BusinessException("Given Id is not our Table...How Can I delete " + id);
		}

	}

	@Override
	public List<Student> allStudentview() {

		return studentRepository.findAll();
	}

	@Override
	public Long getByNameStudent(String name) {
		boolean f = false;


		Long l = studentRepository.countByName(name);
		if (l > 0) {
			return l;
		} else {
			throw new BusinessException("No Search Found..For Name:-" + name);
		}

	}

	@Override
	public Long studentFilter(String context) {

		Long l = studentRepository.countBYValue(context);
		if (l > 0) {
			return l;
		} else {
			throw new BusinessException("No Search Found For Context....For Context:-" + context);
		}

	}

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

//
//	@Transactional
//	public List<Student> getAllStudents() {
//
//
//		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//		CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
//		Root<Student> studentRoot = criteriaQuery.from(Student.class);
//		criteriaQuery.select(studentRoot);
//		TypedQuery<Student> typedQuery = entityManager.createQuery(criteriaQuery);
//		List<Student> studentList = typedQuery.getResultList();
//		return studentList;
//	}

	@Transactional
	public List<Student> getAllStudents() {

		int i = 10;
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
		Root<Student> studentRoot = criteriaQuery.from(Student.class);

		criteriaQuery.select(studentRoot);
		//Predicate predicate = criteriaBuilder.notEqual(studentRoot.get("id"),42);
		criteriaQuery.where(toPredicate(studentRoot, criteriaQuery, criteriaBuilder));
		TypedQuery<Student> typedQuery = entityManager.createQuery(criteriaQuery);
		List<Student> studentList = typedQuery.getResultList();
		return studentList;
	}

	public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

		Predicate predicateRollNumber = criteriaBuilder.equal(root.get("rollNo"), 7588);
		return predicateRollNumber;
	}

	public List<Student> getByName() {
//		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//		CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
//		Root<Student> studentRoot = criteriaQuery.from(Student.class);

		StudentSpecification studentSpecification = new StudentSpecification();
		studentSpecification.add(new SearchCriteria("name", "ManojiKunar", SearchOperation.EQUAL));
		List<Student> students = studentRepository.findAll(studentSpecification);
		return students;
	}

	public Page<Student>  getByAge() {
//		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//		CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
//		Root<Student> studentRoot = criteriaQuery.from(Student.class);
//		StudentSpecification studentSpecification = new StudentSpecification();
//		studentSpecification.add(new SearchCriteria("age", 47, SearchOperation.GREATER_THAN));
//		Predicate predicate = studentSpecification.toPredicate(studentRoot,criteriaQuery,criteriaBuilder);
//		//List<Student> students =
//
//		criteriaQuery.select(studentRoot);
//		//Predicate predicate = criteriaBuilder.notEqual(studentRoot.get("id"),42);
//		criteriaQuery.where(predicate);
//		TypedQuery<Student> typedQuery = entityManager.createQuery(criteriaQuery);
//		List<Student> studentList = typedQuery.getResultList();
//		return studentList;

		StudentSpecification studentSpecification = new StudentSpecification();
		studentSpecification.add(new SearchCriteria("age", 57, SearchOperation.GREATER_THAN));
		Pageable pageable= PageRequest.of(0,3, Sort.by("rollNo").ascending());
		Page<Student>  students =  studentRepository.findAll(studentSpecification,pageable);
		return students;

	}
     public  Page<Student> getStudentByNameAndAge()
      {
		  StudentSpecification studentSpecification = new StudentSpecification();
		  studentSpecification.add(new SearchCriteria("age", 57, SearchOperation.GREATER_THAN));
		  Pageable pageable= PageRequest.of(0,3, Sort.by("rollNo").ascending());
		  Page<Student> students = studentRepository.findAll(studentSpecification,pageable);
		  return students;

	  }


      @Override
	  public List<Student> importFile(MultipartFile file) throws IOException {
		InputStream inputStream = file.getInputStream();
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
        List<Student> studentList = new ArrayList<>();
		while (rowIterator.hasNext())
		{
			Row curRow = rowIterator.next();
			Iterator<Cell> cIterator = curRow.cellIterator();
			Student student = new Student();
			while (cIterator.hasNext())
			{
				Cell curCell = cIterator.next();

				String name =curCell.getStringCellValue();
				int id = (int) curCell.getNumericCellValue();
				boolean status= curCell.getBooleanCellValue();
				student.setRollNo(id);
				student.setName(name);
			}


			studentList.add(student);
		}


		  return studentList;
	  }


}

