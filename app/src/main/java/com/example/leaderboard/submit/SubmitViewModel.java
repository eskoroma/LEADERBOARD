package com.example.leaderboard.submit;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.data_gads.data.GadSubmitRepository;
import com.example.data_gads.data.SubmitDetails;
import com.example.data_gads.utility.LogHelper;


public class SubmitViewModel extends ViewModel {

    private final GadSubmitRepository repository;
    private final String TAG =  SubmitViewModel.class.getSimpleName();

    public final MutableLiveData<String> firstName = new MutableLiveData<>();
    public final MutableLiveData<String> lastName = new MutableLiveData<>();
    public final MutableLiveData<String> emailAddress = new MutableLiveData<>();
    public final MutableLiveData<String> githubUrl = new MutableLiveData<>();

    public SubmitViewModel(GadSubmitRepository repository){
        super();
        this.repository = repository;
    }

    public void submit(){
        SubmitDetails submitDetails = new SubmitDetails(firstName.getValue(), lastName.getValue() ,
                "+232-79-XXXXXX", null, "Freetown, Sierra Leone", emailAddress.getValue(),
                "+232-79-XXXXXX", null, null);

        repository.submit(submitDetails);
        LogHelper.log(TAG, "First name is " + firstName.getValue() );
    }
}
