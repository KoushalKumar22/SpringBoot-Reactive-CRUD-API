package com.SpringBootAPI.Teachers_Attendance.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalTime;

@Table(name = "Teachers_Attendance")
public class Teachers {

    @Id
    @Column("ID")
    int id;

    @Column("Name")
    String name;

    @Column("Primary-sub")
    String psub;

    @Column("Secondary-sub")
    String ssub;

    @Column("Entry-Time")
    LocalTime etime;

    public Teachers() {
    }

    public Teachers(int id, String name, String psub, String ssub, LocalTime etime) {
        this.id = id;
        this.name = name;
        this.psub = psub;
        this.ssub = ssub;
        this.etime = etime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsub() {
        return psub;
    }

    public void setPsub(String psub) {
        this.psub = psub;
    }

    public String getSsub() {
        return ssub;
    }

    public void setSsub(String ssub) {
        this.ssub = ssub;
    }

    public LocalTime getEtime() {
        return etime;
    }

    public void setEtime(LocalTime etime) {
        this.etime = etime;
    }
}
