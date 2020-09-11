
package com.example.data_gads.data.source.local;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

import java.util.List;

@Dao
public interface BaseDao<T> {

    @Insert
    void save(T obj);
    @Insert
    void saveAll(List<T> data);

    @Update
    int update(T obj);

    @Delete
    void delete(T obj);

}
