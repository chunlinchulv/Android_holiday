package com.example.databinding.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.R;
import com.example.databinding.bean.UserBean;
import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.handler.OnClickHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);
        /*UserBean userBean = new UserBean("春林初绿",21);
        binding.setUser(userBean);*/

        /*在data中添加一些高级变量*/
        /*List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        binding.setList(list);

        HashMap<String,Object> map = new HashMap<>();
        map.put("key0","map_value0");
        map.put("key1","map_value1");
        binding.setMap(map);

        String[] arrays = {"安河桥北","春林初绿"};
        binding.setArray(arrays);*/

        /*使用alias设置别名*/
        /*UserBean userBean = new UserBean("春林初绿",21);
        binding.setUser(userBean);
        com.example.databinding.UserBean userBean2 = new com.example.databinding.UserBean(
                "安河桥北");
        binding.setUser2(userBean2);*/

        /**
         * 布局中引入OnClickListener变量
         */
        binding.setHandler(new OnClickHandler());
    }

    /*@Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_1) {
            Toast.makeText(this,"我是按钮1",Toast.LENGTH_SHORT).show();
        }else if(v.getId() == R.id.button_2){
            Toast.makeText(this,"我是按钮2",Toast.LENGTH_SHORT).show();
        }
    }*/
}
