package com.rakuten.StudentApp;

import com.rakuten.StudentApp.Service.ITableInfoService;
import com.rakuten.StudentApp.Service.TableInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.sql.DataSource;
import java.util.List;


@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);


	}

}
