package com.example.physicswalaapp;
//creating the model

public class model {

    String Name,Subject, Qualification,Profileimage;
    public model(String name, String subject, String qualification, String profileimage) {
        Name= name;
        Subject = subject;
        Qualification = qualification;
        Profileimage=profileimage;

    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getSubject() {
        return Subject;
    }
    public void setSubject(String subject) {
        Subject = subject;
    }
    public String getQualification() {
        return Qualification;
    }
    public void setQualification(String qualification) {
        Qualification = qualification;
    }
    public String getProfileimage() {
        return Profileimage;
    }
    public void setProfileimage(String profileimage) {
        Profileimage = profileimage;
    }

}
