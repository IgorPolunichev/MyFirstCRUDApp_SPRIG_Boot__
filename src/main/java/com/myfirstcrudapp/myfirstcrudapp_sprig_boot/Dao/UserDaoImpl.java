package com.myfirstcrudapp.myfirstcrudapp_sprig_boot.Dao;

import com.myfirstcrudapp.myfirstcrudapp_sprig_boot.Model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUser() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void editUser(User user) {
        entityManager.merge(user);

    }

    @Override
    public void removeUser(int id) {
        entityManager.remove(getUserById(id));

    }

    @Override
    public User getUserById(int id) {
        return  entityManager.find(User.class, id);
    }
}
