package com.booboomx.wechatrongcloud.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by booboomx on 17/3/30.
 */

public  abstract class BaseActivity extends AppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

    }


    public abstract int getLayoutId();

    public abstract void init(Bundle savedInstanceState);

}
