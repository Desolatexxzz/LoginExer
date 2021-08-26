package service;

import dao.User;
import dao.UserDao;
import dao.UserDaoImpl;

import java.util.List;

public class UserServiceImpl implements UserService{
    public UserServiceImpl(){};
    @Override
    public List findAll() {
        UserDao userDao = new UserDaoImpl();
        List list = userDao.findAll();
        return list;
    }

    @Override
    public void addUser(User user) {
        UserDao userDao = new UserDaoImpl();
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(int uid) {
        UserDao userDao = new UserDaoImpl();
        userDao.deleteUser(uid);
    }

    @Override
    public void updateUser(int uid, User user) {
        UserDao userDao = new UserDaoImpl();
        userDao.updateUser(uid,user);
    }
}
