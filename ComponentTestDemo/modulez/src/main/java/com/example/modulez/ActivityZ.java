package com.example.modulez;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.modulemain.R;

public class ActivityZ extends AppCompatActivity {
    @Autowired(name = "key")
    String data;

    /**
     * TextView
     * @param savedInstanceState
     */
    private TextView mTextViewB;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulez_activity_main);
        ARouter.getInstance().inject(this);
        initView();
    }
    private void initView() {
        mTextViewB = (TextView)findViewById()
    }

}
