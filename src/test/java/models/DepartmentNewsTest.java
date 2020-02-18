package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentNewsTest {

    @Test
    public void getDepartmentId() {
        DepartmentNews departmentNews = DepartmentNews.setUpNewDepartmentNews();
        assertEquals("economic times", departmentNews.getTopic());
    }
}