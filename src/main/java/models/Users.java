package models;

public class Users {
    private String name;
    private String position;
    private String role;
    private int depId;
    private int id;


    public Users(String name, String position, String role, int depId) {
        this.name = name;
        this.position = position;
        this.role = role;
        this.depId = depId;
        this.id = id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

