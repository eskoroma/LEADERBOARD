package com.example.leaderboard;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.data_gads.data.GadsRepository;


public class SharedViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private final GadsRepository repository;

    public SharedViewModelFactory(GadsRepository repository) {
        super();
        this.repository = repository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new SharedViewModel(repository);
    }
}
