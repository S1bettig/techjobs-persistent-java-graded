package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.List;
import javax.persistence.ManyToMany;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;
    @ManyToMany
    private List <Skill> skills;

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> skills) {
        super();
        this.employer = anEmployer;
        this.skills = skills;
    }

    // Getters and setters.
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List getSkills() {
        return skills;
    }

    public void setSkills(List skills) {
        this.skills = skills;
    }
}
