package com.example.modulemain;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    /**
     * toA
     * @param savedInstanceState
     */
    private Button mModulemainA;

    /**
     * toB
     * @param savedInstanceState
     */
    private Button mModulemainB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulemain_activity_main);
        initView();
        initEvent();
    }

    private void initEvent() {
        mModulemainA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(ARouterPath.PATH_MODULEA).navigation();
            }
        });
        mModulemainB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(ARouterPath.PATH_MODULE_B).withString("key","传递的数据").navigation();
            }
        });
    }

    private void initView() {
        mModulemainA = (Button)findViewById(R.id.modulemain_a);
        mModulemainB = (Button)findViewById(R.id.modulemain_b);
    }
}
