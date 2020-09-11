package com.example.data_gads.data.source.local;


import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import com.example.data_gads.data.UserIq;

@Dao
public abstract class UserIQDao implements BaseDao<UserIq> {

    @Query("SELECT * FROM `com.example.data_gads.data.source.iq_table_name` ORDER BY uid ASC ")
    abstract public List<UserIq> getIqList();

    @Query("DELETE FROM `com.example.data_gads.data.source.iq_table_name`")
    abstract public void deleteAll();
}
