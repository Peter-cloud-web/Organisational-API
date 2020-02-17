package models;

public class Department {

    private String depName;
    private String depDescription;
    private String numberOfEmployees;
    private String depId;

    public Department (String depName, String depDescription, String numberOfEmployees, String depId){
        this.depDescription = depDescription;
        this.depId = depId;
        this.depName = depName;
        this.numberOfEmployees = numberOfEmployees;

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

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }




}
