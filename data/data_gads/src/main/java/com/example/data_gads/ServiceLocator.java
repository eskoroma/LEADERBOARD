
package com.example.data_gads;

import android.content.Context;

import androidx.room.Room;

import com.example.data_gads.background.BackGroundExecutor;
import com.example.data_gads.data.DefaultRepository;
import com.example.data_gads.data.GadSubmitRepository;
import com.example.data_gads.data.GadsDataSource;
import com.example.data_gads.data.GadsRepository;
import com.example.data_gads.data.SubmitRepository;
import com.example.data_gads.data.UserIq;
import com.example.data_gads.data.UserTime;
import com.example.data_gads.data.source.local.GadsDatabase;
import com.example.data_gads.data.source.local.LocalDataSource;
import com.example.data_gads.data.source.remote.RemoteDataSource;
import com.example.data_gads.network.ApiFactory;

/**
 *  provide single instance object Instance
 */

public class ServiceLocator {

    private ServiceLocator(){}

    private static final String DATABASE_NAME = "com.example.data_gads.DB_NAME";
    private static final String TAG = ServiceLocator.class.getSimpleName();
    private static GadsDatabase gadsDatabase = null;
    private static GadsRepository repository = null;
    private static GadSubmitRepository submitRepository = null;

    public static GadsRepository provideGadsRepository(Context context){
        synchronized (ServiceLocator.class){
            if(repository != null)
                return repository;

            repository = new DefaultRepository(
                    createLocalGadsDataSource(context),
                    createRemoteGadsDataSource() ,
                    new BackGroundExecutor()
            );

            return repository;
        }
    }

    public static GadSubmitRepository provideSubmitRepository() {
        synchronized (ServiceLocator.class){
            if(submitRepository != null)
                return submitRepository;

            submitRepository = new SubmitRepository(ApiFactory.provideGadsSubmitApi());

            return submitRepository;
        }
    }

    public static GadsDatabase provideGadsDatabase(Context context){
        synchronized (ServiceLocator.class){
            if (gadsDatabase != null)
                return gadsDatabase;

            gadsDatabase = Room.databaseBuilder(
                    context.getApplicationContext() ,
                    GadsDatabase.class, DATABASE_NAME
            ).build();

            return gadsDatabase;
        }
    }

    private static GadsDataSource<UserTime, UserIq> createLocalGadsDataSource(Context context){
        return new LocalDataSource(provideGadsDatabase(context).userIQDao(), provideGadsDatabase(context).userTimeDao());
    }

    private static GadsDataSource<UserTime, UserIq> createRemoteGadsDataSource(){
        return new RemoteDataSource(ApiFactory.provideGadsApi());
    }

}
