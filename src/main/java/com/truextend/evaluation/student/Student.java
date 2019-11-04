package com.truextend.evaluation.student;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import java.util.List;

@Document("students")
public class Student {

    @Id
    private String id;
    private String studentId;
    private String firstName;
    private String lastName;
    @DBRef(lazy = true)
    private List<com.truextend.evaluation.course.Class> classes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<com.truextend.evaluation.course.Class> getClasses() {
        return classes;
    }

    public void setClasses(List<com.truextend.evaluation.course.Class> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return String.format("Student[id=%s, firstName='%s', lastName='%s']", id, firstName, lastName);
    }
}
