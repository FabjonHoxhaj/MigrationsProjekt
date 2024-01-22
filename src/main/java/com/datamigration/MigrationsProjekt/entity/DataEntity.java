package com.datamigration.MigrationsProjekt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "hashtags")
public class DataEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int hashtag_ID;    //primary key

    private String hashtagName;

    public int getHashtag_ID() {
        return hashtag_ID;
    }

    public void setHashtag_ID(int hashtag_ID) {
        this.hashtag_ID = hashtag_ID;
    }
}