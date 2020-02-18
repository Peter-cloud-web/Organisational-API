package dao;

import models.News;

import java.util.List;

public interface departmentDao {
    void add( News news);

    List<News> getAll();

    void update(int id, String name, String address, String zipcode, String phone, String website, String email);

    void deleteById(int id);

    void clearAll();


}
