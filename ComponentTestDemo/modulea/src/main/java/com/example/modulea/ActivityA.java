package com.example.modulea;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.modulemain.R;
@Route(path = ARouterPath.PATH_MODULE_A)
public class ActivityA extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulea_activity_main);
    }
}
