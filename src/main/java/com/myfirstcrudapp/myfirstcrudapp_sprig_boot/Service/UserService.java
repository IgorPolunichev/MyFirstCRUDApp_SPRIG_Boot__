package com.myfirstcrudapp.myfirstcrudapp_sprig_boot.Service;

import com.myfirstcrudapp.myfirstcrudapp_sprig_boot.Model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> listUser();
    void editUser (User user);
    void removeUser(int id);
    User getUserById (int id);
}
