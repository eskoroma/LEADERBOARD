
package com.example.data_gads.network;

import com.example.data_gads.data.SubmitDetails;
import com.example.data_gads.data.SubmitResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface GadsSubmitApiService {

    String ID = "1FAIpQLSf9d1TcNU6zc6KR8bSEM41Z1g1zl35cwZr2xyjIhaMAz8WChQ/formResponse";

    @POST(ID)
    Call<SubmitResponse> submit(@Body SubmitDetails submitDetails);
}
