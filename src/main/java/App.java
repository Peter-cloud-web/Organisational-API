import dao.Sql2oDepartmentDao;
import dao.Sql2oNewsDao;
import dao.Sql2oUsersDao;
import models.Department;
import models.News;
import models.Users;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import com.google.gson.Gson;
import static spark.Spark.*;


public class App {
    public static void main (String[] args){
        Sql2oDepartmentDao departmentDao;
        Sql2oNewsDao newsDao;
        Sql2oUsersDao usersDao;
        Connection conn;
        Gson gson = new Gson();

        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString,"sean","access");

        departmentDao = new Sql2oDepartmentDao(sql2o);
        usersDao = new Sql2oUsersDao(sql2o);
        newsDao = new Sql2oNewsDao(sql2o);

        post("/department/new","application/json",(req,res)-> {
            Department department = gson.fromJson(req.body(),Department.class);
            departmentDao.add(department);
            res.status(201);
            res.type("application/json");
            return gson.toJson(department);
        });
        get("/department","application/json",(req,res)->{
            res.type("application/json");
            return gson.toJson(departmentDao.getAll());
        });

        post("/users/new","application/json",(req,res)-> {
            Users users = gson.fromJson(req.body(),Users.class);
            usersDao.add(users);
            res.status(201);
            res.type("application/json");
            return gson.toJson(users);
        });
        get("/users","application/json",(req,res)->{
            res.type("application/json");
            return gson.toJson(usersDao.getAll());
        });

        post("/news/new","application/json",(req,res)-> {
            News news = gson.fromJson(req.body(),News.class);
            newsDao.add(news);
            res.status(201);
            res.type("application/json");
            return gson.toJson(news);
        });
        get("/news","application/json",(req,res)->{
            res.type("application/json");
            return gson.toJson(newsDao.getAll());
        });
        get("/restaurants/:id", "application/json", (req, res) -> { //accept a request in format JSON from an app
            res.type("application/json");
            int restaurantId = Integer.parseInt(req.params("id"));
            res.type("application/json");
            return gson.toJson(restaurantDao.findById(restaurantId));
        });


    }



}
