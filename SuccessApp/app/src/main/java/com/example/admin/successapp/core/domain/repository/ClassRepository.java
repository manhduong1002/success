/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.domain.repository;

import core.domain.Class;

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
