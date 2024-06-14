package com.SpringBootAPI.Teachers_Attendance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@EnableR2dbcRepositories
@SpringBootApplication
public class TeachersAttendanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachersAttendanceApplication.class, args);
	}

}
