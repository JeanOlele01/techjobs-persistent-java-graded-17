package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {

@NotBlank(message = "Location is required.")
@Size(min=1, max=100, message = "location field should not exceed 100 characters")
    private String location;

        //Task 3 part 1
    /////////////////////////////////////////////

    @OneToMany
    @JoinColumn(name="employer_id")

    private  List<Job> jobs = new ArrayList<>();

    public List<Job> getJobs() {
        return jobs;
    }

    ////////////////////////////////////////////
public Employer(){}

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }


}


