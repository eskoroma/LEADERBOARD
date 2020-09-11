
package com.example.data_gads.data.source.local;


import android.content.Context;
import android.os.Build;

import androidx.test.core.app.ApplicationProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.data_gads.data.UserIq;
import com.example.data_gads.data.UserTime;
import com.example.data_gads.data.source.local.GadsDatabase;

import static com.google.common.truth.Truth.assertThat;


@RunWith(RobolectricTestRunner.class)
@Config(sdk = {Build.VERSION_CODES.P})
public class GadsDatabaseTest {

    private GadsDatabase db;

    @Before
   public void init(){
        Context context = ApplicationProvider.getApplicationContext();
        db = GadsDatabase.provideInMemoryDatabase(context);

   }

   @After
   public void reset(){
        db.close();
   }


}