
package com.example.data_gads.data.source.local;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import com.example.data_gads.data.UserTime;

@Dao
public abstract class UserTimeDao implements BaseDao<UserTime> {

    @Query("SELECT * FROM `com.example.data_gads.data.source.time_table_name` ORDER BY uid ASC")
    abstract public List<UserTime> getTimeList();

    @Query("DELETE FROM `com.example.data_gads.data.source.time_table_name`")
    abstract public void deleteAll();
}
