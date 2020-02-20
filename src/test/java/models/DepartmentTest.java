package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {

    @Test
    public void getDepName() {
        Department department = Department.setUpNewDepartment();
        assertEquals("Science",department.getDepName());
    }

    @Test
    public void getDepDescription() {
        Department department = Department.setUpNewDepartment();
        assertEquals("science and tech only ",department.getDepDescription());
    }

    @Test
    public void getNumberOfEmployees() {
        Department department = Department.setUpNewDepartment();
        assertEquals(3,department.getNumberOfEmployees());
    }


}