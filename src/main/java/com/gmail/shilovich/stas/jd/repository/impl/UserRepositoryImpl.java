package com.gmail.shilovich.stas.jd.repository.impl;

import com.gmail.shilovich.stas.jd.repository.UserRepository;
import com.gmail.shilovich.stas.jd.repository.model.User;

import javax.persistence.Query;

public class UserRepositoryImpl extends GenericRepositoryImpl<Long,User> implements UserRepository {

    @Override
    public User loadUserByUsername(String email) {
        String hql = "FROM User AS U WHERE U.email=:email";
        Query query = entityManager.createQuery(hql);
        query.setParameter("email", email);
        return (User) query.getSingleResult();
    }
}
