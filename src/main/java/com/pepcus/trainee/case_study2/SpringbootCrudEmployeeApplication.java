package com.pepcus.trainee.case_study2;

import com.pepcus.trainee.case_study2.model.Employee;
import com.pepcus.trainee.case_study2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCrudEmployeeApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee1 = new Employee();
//		employee1.setFirstName("First");
//		employee1.setLastName("Name");
//		employee1.setEmailId("first@gmail.com");
//		employeeRepository.save(employee1);
//
//		Employee employee2 = new Employee();
//		employee2.setFirstName("Second");
//		employee2.setLastName("Name");
//		employee2.setEmailId("second@gmail.com");
//		employeeRepository.save(employee2);


	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudEmployeeApplication.class, args);
	}
}
