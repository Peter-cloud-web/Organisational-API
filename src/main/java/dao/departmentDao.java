package dao;

import models.Department;

import java.util.List;

public interface departmentDao {
    void add( Department department);

    Department findById(int id);

    List<Department> getAll();

    void deleteById(int id);

    void clearAll();


}
