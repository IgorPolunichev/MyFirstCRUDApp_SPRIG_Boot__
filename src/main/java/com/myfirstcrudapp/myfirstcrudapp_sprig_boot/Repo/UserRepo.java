package com.myfirstcrudapp.myfirstcrudapp_sprig_boot.Repo;

import com.myfirstcrudapp.myfirstcrudapp_sprig_boot.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {



}
