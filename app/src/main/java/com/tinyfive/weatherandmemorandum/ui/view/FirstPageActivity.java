package com.tinyfive.weatherandmemorandum.ui.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tinyfive.weatherandmemorandum.R;
import com.tinyfive.weatherandmemorandum.model.User;

public class FirstPageActivity extends AppCompatActivity {

    private TextView tx_welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        //初始化UI
        initView();
        //获取传值
        Intent intent = this.getIntent();
        User user = (User) intent.getSerializableExtra("userInfo");
        //对前台数据处理
        this.tx_welcome.setText("您好，"+user.getName()+" 欢迎您");

    }

    private void initView() {
        this.tx_welcome = (TextView) this.findViewById(R.id.tx_welcome);
    }
}
