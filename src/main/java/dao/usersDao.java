package dao;

import models.Users;

import java.util.List;

public interface usersDao {

    void add (Users users);



    List<Users> getAll();




    void deleteById(int id);

    void clearAll();


}
