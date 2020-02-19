package models;

public class Users {
    private String name;
    private String position;
    private String roles;
    private int depId;
    private int id;


    public Users(String name, String position, String roles, int depId) {
        this.name = name;
        this.position = position;
        this.roles = roles;
        this.depId = depId;
    }
    public static Users setUpNewUser(){
        return new Users("Peter","manager","managing",54);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
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

