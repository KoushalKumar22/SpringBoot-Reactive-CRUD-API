package com.SpringBootAPI.Teachers_Attendance.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalTime;
@Table(name = "Teachers_Attendance")
public class Teachers {

    @Id
    @Column("ID")
    private int id;

    @Column("Name")
    private String name;

    @Column("Primarysub")
    private String primarySub;

    @Column("Secondarysub")
    private String secondarySub;

    @Column("EntryTime")
    private LocalTime entryTime;

    public Teachers() {
    }

    public Teachers(int id, String name, String primarySub, String secondarySub, LocalTime entryTime) {
        this.id = id;
        this.name = name;
        this.primarySub = primarySub;
        this.secondarySub = secondarySub;
        this.entryTime = entryTime;
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

    public String getPrimarySub() {
        return primarySub;
    }

    public void setPrimarySub(String primarySub) {
        this.primarySub = primarySub;
    }

    public String getSecondarySub() {
        return secondarySub;
    }

    public void setSecondarySub(String secondarySub) {
        this.secondarySub = secondarySub;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalTime entryTime) {
        this.entryTime = entryTime;
    }
}
