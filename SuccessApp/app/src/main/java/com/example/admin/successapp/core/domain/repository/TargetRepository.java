package com.example.admin.successapp.core.domain.repository;

import com.example.admin.successapp.core.domain.Target;
import com.example.admin.successapp.infra.http.Message;

/**
 * Created by Thanh Tung iTC on 5/27/2017.
 */

public interface TargetRepository {
    public Message add(Target target);
}
