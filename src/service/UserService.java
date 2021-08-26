package service;

import dao.User;

import java.util.List;

public interface UserService {
    public List findAll();
    public void addUser(User user);
    public void deleteUser(int uid);
    public void updateUser(int uid,User user);
}
