package dao;
import models.Department;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class Sql2oDepartmentDaoTest {
    private static Connection conn;
    private Sql2oDepartmentDao departmentDao;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "sean", "access");
        Sql2oDepartmentDao departmentDao= new Sql2oDepartmentDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test
    public void addDepartmentsSetsId() throws Exception{
        Department department1 = new Department("Science","Science",3,"ABMI");
        departmentDao.add(department1);
        assertNotEquals(1,department1.getId());
    }

    @Test
    public void getAll() throws Exception {
        Department department1 = new Department("Science","Science",3,"ABMI");
        Department department =new  Department("Social","culture",3,"rere");
        departmentDao.add(department);
        departmentDao.add(department1);
        assertEquals(2,departmentDao.getAll().size());
    }

    @Test
    public void deleteById() {
        Department department1 = new Department("Science","Science",3,"ABMI");
        Department department =new  Department("Social","culture",3,"rere");
        assertEquals(2,departmentDao.getAll().size());
        departmentDao.deleteById(department.getId());
        assertEquals(1,departmentDao.getAll().size());
    }
    @Test
    public void findUserById() throws Exception{
        Department department1 = new Department("Science","Science",3,"ABMI");
        departmentDao.add(department1);
        Department findDepartments = departmentDao.findById(department1.getId());
        assertEquals(findDepartments,departmentDao.findById(department1.getId()));
    }

    @Test
    public void clearAll() {
        Department department = Department.setUpNewDepartment();
        Department department1 = Department.setUpNewDepartment();
        departmentDao.clearAll();
        assertEquals(0,departmentDao.getAll().size());

    }
}