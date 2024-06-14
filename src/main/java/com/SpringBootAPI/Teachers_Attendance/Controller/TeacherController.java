package com.SpringBootAPI.Teachers_Attendance.Controller;

import com.SpringBootAPI.Teachers_Attendance.Entity.Teachers;
import com.SpringBootAPI.Teachers_Attendance.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.annotation.Target;


@RestController
public class TeacherController {

    @Autowired
    TeacherRepository trepo;

    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }

    @PostMapping("/save")
    public Mono<Teachers> save(@RequestBody Teachers teachers){
        return trepo.save(teachers);
    }

    @GetMapping(value = "/all",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Teachers> findAll(){
        Flux<Teachers> flux=trepo.findAll().log();
        return flux;
    }

    @PutMapping("/update/{id}")
    public Mono<String> update(@PathVariable int id, @RequestBody Teachers updatedTeacher) {
        return trepo.findById(id)
                .flatMap(existingTeacher -> {
                    existingTeacher.setName(updatedTeacher.getName());
                    existingTeacher.setPrimarySub(updatedTeacher.getPrimarySub());
                    existingTeacher.setSecondarySub(updatedTeacher.getSecondarySub());
                    existingTeacher.setEntryTime(updatedTeacher.getEntryTime());
                    return trepo.save(existingTeacher);
                })
                .map(savedTeacher -> "Teacher updated successfully with ID: " + savedTeacher.getId())
                .defaultIfEmpty("Teacher not found with ID: " + id);
    }

    @DeleteMapping("/del/{id}")
    public Mono<String> deleteById(@PathVariable int id){
        return trepo.findById(id).flatMap(existingTeachers ->
                trepo.delete(existingTeachers)
                        .then(Mono.just("Data Deleted by Id: "+id))
        )
                .defaultIfEmpty("Teacher Data Not Found With Id: "+id);
    }

}
