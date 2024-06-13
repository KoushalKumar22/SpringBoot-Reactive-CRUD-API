package com.SpringBootAPI.Teachers_Attendance.Repository;

import com.SpringBootAPI.Teachers_Attendance.Entity.Teachers;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends ReactiveCrudRepository<Teachers,Integer> {
}
