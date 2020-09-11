package com.example.leaderboard;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.data_gads.data.GadSubmitRepository;
import com.example.leaderboard.submit.SubmitViewModel;

public class SubmitViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private final GadSubmitRepository repository;

    public SubmitViewModelFactory(GadSubmitRepository repository){
        super();
        this.repository = repository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new SubmitViewModel(repository);
    }
}
