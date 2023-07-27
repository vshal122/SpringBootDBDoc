package com.rakuten.StudentApp.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rakuten.StudentApp.Model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {

	@Query(value="SELECT count(id) FROM student Where name LIKE %:sname%",nativeQuery = true)
	 public Long countByName(@Param("sname") String sname);
	
	@Query(value="SELECT count(id) FROM student s where s.joindate=:context or s.name=:context",nativeQuery=true)
	public Long countBYValue(@Param("context") String context);

}
