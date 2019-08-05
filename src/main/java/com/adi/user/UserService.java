package com.adi.user;

public interface UserService {
    public User findUser(String email);
    public int insertUser( String name, String email);
    public void RemoveUser(User u);
    public boolean findUserExistence(String email);
}
