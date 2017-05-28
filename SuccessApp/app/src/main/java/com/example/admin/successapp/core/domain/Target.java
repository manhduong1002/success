package com.example.admin.successapp.core.domain;

import java.io.Serializable;

/**
 * Created by admin on 5/12/2017.
 */

public class Target implements Serializable {


    private static final int STATUS_NEW = 0;

    private static final int STATUS_DOING = 1;

    private static final int STATUS_PENDING = 2;

    private static final int STATUS_FINISH = 3;

    // key
    private int id;
    // 0 year
    // 1 month
    // 2 week
    // 3 day
    private int level;

    // axpiry date => finish
    //18:30:00_13/04/2017
    private String expiryDate;

    // title
    private String title;

    private String name;

    // key parent
    private int parentId;

    private int status;

    public Target() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public boolean isNew() {
        return this.status == STATUS_NEW;
    }

    public boolean isDoing() {
        return this.status == STATUS_DOING;
    }

    public boolean isFinish() {
        return this.status == STATUS_FINISH;
    }

    public boolean isPending() {
        return this.status == STATUS_PENDING;
    }

    public void defailtStatus() {
        this.status = STATUS_NEW;
    }

    public boolean toDoing() {
        if (this.isNew() || this.isPending()) {
            this.status = STATUS_DOING;
            return true;
        }
        return false;
    }

    public boolean toPending() {
        if (this.isDoing()) {
            this.status = STATUS_PENDING;
            return true;
        }
        return false;
    }

    public boolean toFinish() {
        if (this.isDoing()) {
            this.status = STATUS_FINISH;
            return true;
        }
        return false;
    }
}
