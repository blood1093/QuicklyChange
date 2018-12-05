package com.test.demo.quicklychange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * 当前环境名称
     */
    private TextView mTvMainEnvName;
    /**
     * 当前环境代号
     */
    private TextView mTvMainEnvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        mTvMainEnvName = findViewById(R.id.tv_main_evn_name);
        mTvMainEnvNumber = findViewById(R.id.tv_main_evn_number);
    }

    private void initData() {
        //此处数据实际来源于配置文件
        mTvMainEnvName.setText("这是" + BuildConfig.envName + "环境");
        mTvMainEnvNumber.setText("环境代号" + BuildConfig.envNumber);
    }
}
