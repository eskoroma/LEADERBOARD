package com.example.leaderboard;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.data_gads.ServiceLocator;
import com.example.leaderboard.databinding.ActivitySubmitBinding;
import com.example.leaderboard.submit.SubmitViewModel;

import java.util.Objects;



public class SubmitActivity extends AppCompatActivity {

    private ActivitySubmitBinding binding;
    private SubmitViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_submit);
        binding.setLifecycleOwner(this);
        viewModel = new ViewModelProvider(this, new SubmitViewModelFactory(ServiceLocator.provideSubmitRepository()) )
                .get(SubmitViewModel.class);
        binding.setViewModel(viewModel);

        setSupportActionBar(binding.toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home )
            finish();

        return super.onOptionsItemSelected(item);
    }
}