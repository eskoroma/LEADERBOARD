
package com.example.data_gads.data;

import java.util.List;
import java.util.concurrent.Executor;

public interface GadsRepository {

    void updateUserHoursFromApi();
    void updateUserIqFromApi();
    void updateUserIqDb(List<UserIq> userIqList);
    void updateUserTimeDb(List<UserTime> userTimeList);
    List<UserTime> getUserHours();
    List<UserIq> getSkillIqs();
    Executor getExecutor();
    void setUpdateActionListener(DefaultRepository.UpdateDataActionListener listener);

}
