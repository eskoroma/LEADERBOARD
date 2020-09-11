
package com.example.data_gads.data;

import java.util.List;

import retrofit2.Call;


public interface GadsDataSource<T,I> {


    void saveUserTime(T obj);

    void saveUserIq(I obj);

    void deleteUserTime(T obj);

    void deleteUserIq(I obj);

    void saveUserIqList(List<I> userIqList);

    void saveUserTimeList(List<T> userTimeList);

    void deleteUserHours();

    void deleteUserIqs();

    List<UserTime> getUserList();

    List<UserIq> getSkillIqList();

    Call<List<UserTime>> getUserHours();

    Call<List<UserIq>> getUserIqs();

}
