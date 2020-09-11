
package com.example.data_gads.data;

import androidx.annotation.NonNull;

import com.example.data_gads.network.GadsSubmitApiService;
import com.example.data_gads.utility.LogHelper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SubmitRepository implements GadSubmitRepository {

    private final String TAG = SubmitRepository.class.getSimpleName();

    private final GadsSubmitApiService apiService;

    public SubmitRepository(GadsSubmitApiService apiService){
        this.apiService = apiService;
    }

    @Override
    public void submit(SubmitDetails submitDetails) {
        apiService.submit(submitDetails)
                .enqueue(new Callback<SubmitResponse>() {
                    @Override
                    public void onResponse(@NonNull Call<SubmitResponse> call, @NonNull Response<SubmitResponse> response) {
                        LogHelper.log(TAG, "The response was " + response.body() );
                    }

                    @Override
                    public void onFailure(@NonNull Call<SubmitResponse> call, @NonNull Throwable t) {
                        LogHelper.log(TAG, "Error submitting !!!!!! \n Error msg :  " + t.getMessage()  );
                    }
                });
    }
}
