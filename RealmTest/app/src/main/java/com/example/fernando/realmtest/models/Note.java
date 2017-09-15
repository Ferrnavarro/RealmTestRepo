package com.example.fernando.realmtest.models;

import com.example.fernando.realmtest.app.MyApplication;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by Fernando on 8/24/2017.
 */

public class Note extends RealmObject {

    @PrimaryKey
    private int id;
    @Required
    private String description;
    @Required
    private Date createdAt;


    public Note(){

    }
    public Note(String description){
        this.id= MyApplication.NoteID.incrementAndGet();
        this.description=description;
        this.createdAt=new Date();

    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }


}
