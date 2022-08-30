package sms.example.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sms.example.studentmanagementsystem.entity.Student;
import sms.example.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/**
		Student student1 = new Student("Fatih", "Demirel", "demirel-fth-93@outlook.com");
		studentRepository.save(student1);

		Student student2 = new Student("Furkan", "Demirel", "demirelfrkn@outlook.com");
		studentRepository.save(student2);

		Student student3 = new Student("Ahmet", "Demirel", "demirelahmt@outlook.com");
		studentRepository.save(student3);
		 */
	}
}
