package com.SpringBootAPI.Teachers_Attendance.Controller;

import com.SpringBootAPI.Teachers_Attendance.Entity.Teachers;
import com.SpringBootAPI.Teachers_Attendance.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


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

}
