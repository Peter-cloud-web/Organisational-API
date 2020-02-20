package models;

import java.util.Objects;

public class Department {

    private String depName;
    private String depDescription;
    private int numberOfEmployees;
    private int id;


    public Department (String depName, String depDescription, int numberOfEmployees){
        this.depDescription = depDescription;
        this.depName = depName;
        this.numberOfEmployees = numberOfEmployees;
        this.id = id;

    }
    public static Department setUpNewDepartment() {
        return new Department("Science","science and tech only ",3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return numberOfEmployees == that.numberOfEmployees &&
                id == that.id &&
                depName.equals(that.depName) &&
                depDescription.equals(that.depDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(depName, depDescription, numberOfEmployees, id);
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepDescription() {
        return depDescription;
    }

    public void setDepDescription(String depDescription) {
        this.depDescription = depDescription;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
