package models;

public class Users {
    private String name;
    private String position;
    private String roles;
    private int id;


    public Users(String name, String position, String roles) {
        this.name = name;
        this.position = position;
        this.roles = roles;
        this.id = id;
    }
    public static Users setUpNewUser(){
        return new Users("Peter","manager","managing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

