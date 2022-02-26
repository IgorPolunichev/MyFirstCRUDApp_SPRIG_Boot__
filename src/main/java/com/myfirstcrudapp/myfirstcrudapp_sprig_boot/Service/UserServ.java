package com.myfirstcrudapp.myfirstcrudapp_sprig_boot.Service;

import com.myfirstcrudapp.myfirstcrudapp_sprig_boot.Model.User;
import com.myfirstcrudapp.myfirstcrudapp_sprig_boot.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record UserServ(UserRepo userRepo) {

    @Autowired
    public UserServ {
    }

    public void addUser(User user) {
        userRepo.save(user);
    }

    public List<User> listUser() {

        return userRepo.findAll();
    }


    public void editUser(User user) {
        userRepo.deleteById(user.getId());
        userRepo.save(user);

    }


    public void removeUser(int id) {
        userRepo.deleteById(id);

    }


    public User getUserById(int id) {
        return userRepo.getById(id);
    }
}
