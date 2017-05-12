/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.admin.successapp.core.domain.repository;

import com.example.admin.successapp.core.domain.Class;

/**
 *
 * @author admin
 */
public interface ClassRepository {
    public void add(Class classInfo);
    public void update(Class classInfo);
    public void delete(String classId);
    public Class find(String classId);
}
