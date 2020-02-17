package models;

public class Department {

    private String depName;
    private String depDescription;
    private int numberOfEmployees;
    private String depId;

    public Department (String depName, String depDescription, int numberOfEmployees, String depId){
        this.depDescription = depDescription;
        this.depId = depId;
        this.depName = depName;
        this.numberOfEmployees = numberOfEmployees;

    }
    public static Department setUpNewDepartment() {
        return new Department("Science","science and tech only ",3,"Abmi");
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

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }




}
