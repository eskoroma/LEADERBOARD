
package com.example.data_gads.data.source.remote;

import java.util.List;

import com.example.data_gads.data.GadsDataSource;
import com.example.data_gads.data.UserIq;
import com.example.data_gads.data.UserTime;
import com.example.data_gads.network.GadsApiService;
import retrofit2.Call;

public class RemoteDataSource implements GadsDataSource<UserTime, UserIq> {

    private GadsApiService apiService;

    public RemoteDataSource(GadsApiService apiService){
        this.apiService = apiService;
    }

    @Override
    public List<UserTime> getUserList() {
        return null;
    }

    @Override
    public List<UserIq> getSkillIqList() {

        return null;
    }

    @Override
    public Call<List<UserTime>> getUserHours() {
        return apiService.getUserHours();
    }

    @Override
    public Call<List<UserIq>> getUserIqs() {
        return apiService.getUserIqs();
    }

    @Override
    public void saveUserTime(UserTime obj) {
    }

    @Override
    public void saveUserIq(UserIq obj) {
    }

    @Override
    public void deleteUserTime(UserTime obj) {
    }

    @Override
    public void deleteUserIq(UserIq obj) {
    }

    @Override
    public void saveUserIqList(List<UserIq> userIqList) {
    }

    @Override
    public void saveUserTimeList(List<UserTime> userTimeList) {
    }

    @Override
    public void deleteUserHours() {
    }

    @Override
    public void deleteUserIqs() {
    }

}
