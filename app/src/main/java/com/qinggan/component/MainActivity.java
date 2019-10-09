package com.qinggan.component;

import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ARouter.getInstance().build("/first/FirstMainActivity").navigation();

//        Intent intent = new Intent(MainActivity.this, FirstMainActivity.class);
//        startActivity(intent);
    }
}
