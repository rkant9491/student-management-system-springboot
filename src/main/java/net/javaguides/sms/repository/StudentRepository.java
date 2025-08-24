package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Student;

//@Repository annotation is not required as JpaRepostory is an implementation of SimpleJpaRepository which 
//which is already annotated with @Repository annotation
public interface StudentRepository extends JpaRepository<Student, Long>{

}
