/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.admin.successapp.core.domain.repository;

import com.example.admin.successapp.core.domain.User;

/**
 *
 * @author admin
 */
public interface UserRepository {
    public void add (User user);
    public void update(User user);
    public void remove(String userId);
    public boolean checkLogin(String username, String password);
    public User find(String username, String password);
    
    
}
