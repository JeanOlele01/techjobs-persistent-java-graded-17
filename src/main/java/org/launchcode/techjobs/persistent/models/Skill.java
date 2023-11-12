package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity

public class Skill extends AbstractEntity {

    @Size(min = 2, max = 250, message = "Description cannot exceed 250 characters")
    public String description;

@ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill(){}
    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }




    public String  getDescription() {
        return description;
    }
    public void setDescription(String Description) {
        this.description = description;
    }

}
