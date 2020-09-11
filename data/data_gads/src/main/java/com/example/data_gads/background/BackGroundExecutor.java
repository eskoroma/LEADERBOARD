package com.example.data_gads.background;

import java.util.concurrent.Executor;

public class BackGroundExecutor implements Executor {

    @Override
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
