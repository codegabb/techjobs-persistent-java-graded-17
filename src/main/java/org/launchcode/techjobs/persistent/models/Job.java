package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {


    @ManyToOne
    private Employer employer;

//    private Skill skills;

    @ManyToMany
    private List<Skill> skills;


    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer anEmployer, List<Skill> skills) {
        super();
        this.employer = anEmployer;
        this.skills = skills;
    }

    // Getters and setters.

    public List<Skill> getSkills() {
        return skills;
    }


//    public String getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(String employer) {
//        this.employer = employer;
//    }


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

public void setSkills(List<Skill> skills) {
        this.skills = skills;
}

}


//    public Skill getSkills() {
//        return skills;
//    }
//
//    public void setSkills(Skill skills) {
//        this.skills = skills;
//    }


//    public Skill getSkills() {
//        return skills;
//    }

//    public void setSkills(Skill skills) {
//        this.skills = skills;
//    }
//
//    public List<Skill> getSkillList() {
//        return skillList;
//    }

    //    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }
//
//    public List<Skill> getSkillList() {
//        return skillList;
//    }

