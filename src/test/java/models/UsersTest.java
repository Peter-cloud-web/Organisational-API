package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {

    @Test
    public void getName() {
        Users users =  Users.setUpNewUser();
        assertEquals("Peter",users.getName());
    }

    @Test
    public void getPosition() {
        Users users = Users.setUpNewUser();
        assertEquals("manager",users.getPosition());
    }

    @Test
    public void getRoles() {
        Users users = Users.setUpNewUser();
        assertEquals("managing",users.getRole());
    }
}