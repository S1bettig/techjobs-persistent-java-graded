package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    public Skill() {

    }

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    private String description;

    public List<Job> getJobs() {
        return jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }





}