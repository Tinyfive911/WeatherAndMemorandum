package com.tinyfive.weatherandmemorandum.ui.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tinyfive.weatherandmemorandum.R;
import com.tinyfive.weatherandmemorandum.model.User;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /**
     * UI
     */
    private EditText et_user;//登录名
    private EditText et_psw;//登录密码

    private Button bt_login;//登录按钮
    private Button bt_regist;//注册按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化UI
        init();
    }

    /**
     * UI 初始化
     */
    private void init(){
        this.et_user = (EditText) this.findViewById(R.id.et_user);
        this.et_psw = (EditText) this.findViewById(R.id.et_psw);

        this.bt_login = (Button) this.findViewById(R.id.btn_login);
        this.bt_regist = (Button) this.findViewById(R.id.btn_register);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btn_login://登录
                login();
                break;
            case R.id.btn_register://注册
                regist();
                break;
        }
    }

    /**
     * 注册
     */
    private void regist() {

    }

    /**
     * 登录
     */
    private void login() {
        //获取用户名和密码
        String loginName = this.et_user.getText().toString();
        String loginPsw = this.et_psw.getText().toString();
        //校验密码
        if("tiny".equalsIgnoreCase(loginName) && "941207".equals(loginPsw)){
            Snackbar.make(this.bt_login,"登录成功",Snackbar.LENGTH_SHORT);
            Intent intent = new Intent();
            User user = new User("tinyfive911","tiny","941207");
            intent.putExtra("userInfo",user);
            intent.setClass(MainActivity.this,FirstPageActivity.class);
            startActivity(intent);
        }else{
            Snackbar.make(this.bt_regist,"用户名或者密码不正确，请重新输入或者注册账号和密码",Snackbar.LENGTH_SHORT);
        }
    }
}
