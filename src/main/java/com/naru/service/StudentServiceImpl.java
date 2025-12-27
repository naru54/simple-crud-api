package com.naru.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.naru.entity.Student;
import com.naru.repository.StudentRepository;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

	private final StudentRepository repository;
	
	@Override
	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public Student updateStudent(Long id, Student student) {
		Student stud = repository.findById(id).orElseThrow(()-> new RuntimeException("Student not found"));
		stud.setName(student.getName());
		stud.setEmail(student.getEmail());
		return repository.save(stud);
	}

	@Override
	public void deleteStudent(Long id) {
		repository.deleteById(id);
	}

}
