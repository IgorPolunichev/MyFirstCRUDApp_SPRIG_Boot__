package com.myfirstcrudapp.myfirstcrudapp_sprig_boot.Service;

import com.myfirstcrudapp.myfirstcrudapp_sprig_boot.Dao.UserDao;
import com.myfirstcrudapp.myfirstcrudapp_sprig_boot.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServ implements UserService {


    private UserDao userDao;

    public UserServ(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public List<User> listUser() {

        return userDao.listUser();
    }

    @Transactional
    @Override
    public void editUser(User user) {
        userDao.editUser(user);

    }

   @Transactional
    @Override
    public void removeUser(int id) {
        userDao.removeUser(id);

    }


    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

}
