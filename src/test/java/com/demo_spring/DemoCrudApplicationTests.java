package com.demo_spring;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.demo_spring.entities.Student;
import com.demo_spring.repository.StudentRepository;
@SpringBootTest
class DemoCrudApplicationTests {
@Autowired
private StudentRepository studentRepo;
@Test//insert or create a record
	void saveOneStudent() {
		Student s1=new Student();
		s1.setName("Abrar");
		s1.setFee(30000);
		s1.setCourse("chemical engineering");
		studentRepo.save(s1);
	}
@Test //delete a record
void deleteOneStudent() {
	studentRepo.deleteById(10L);
}
@Test
void getOneStudent() {//get all the record
Optional<Student> findById = studentRepo.findById(8L);
if (findById.isPresent()) {
Student stud=findById.get();
System.out.println(stud.getId());
System.out.println(stud.getName());
System.out.println(stud.getFee());
System.out.println(stud.getCourse());
}else {
	System.out.println("no record is found");
}
}
@Test//update a record
void updateOneStudent() {
	Optional<Student> findById = studentRepo.findById(7l);
	Student s2=findById.get();
	s2.setFee(25000);
	s2.setCourse("Information Technology");
	studentRepo.save(s2);
}
}


