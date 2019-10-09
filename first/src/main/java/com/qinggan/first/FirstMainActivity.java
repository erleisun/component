package com.qinggan.first;

import android.app.Activity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.qinggan.first.R;

import androidx.annotation.Nullable;

@Route(path = "/first/FirstMainActivity")
public class FirstMainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_main);
    }
}
