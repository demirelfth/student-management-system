package sms.example.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sms.example.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
