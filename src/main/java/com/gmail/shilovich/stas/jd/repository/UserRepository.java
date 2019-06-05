package com.gmail.shilovich.stas.jd.repository;

import com.gmail.shilovich.stas.jd.repository.model.User;

public interface UserRepository extends GenericRepository<Long, User> {
    User loadUserByUsername(String email);
}
