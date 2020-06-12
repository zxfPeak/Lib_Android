package com.zxf.lib_android.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;

import com.zxf.lib_android.R;
import com.zxf.lib_android.utils.ConnectionUtils;
import com.zxf.lib_android.utils.StatusBarUtils;


/**
 * activity的基类示例
 * Created by zxf on 2018/9/10.
 */
public abstract class BaseActivity extends FragmentActivity {

    public static String TAG = "BaseActivity";
    public boolean isConnected;// 判断网络是否连接
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        StatusBarUtils.with(this).setColor(getResources().getColor(R.color.bg_statusBar)).init();
        super.onCreate(savedInstanceState);
        checkConnected();
        initUI();
        initData();
        initListener();
        setView();
    }

    private void checkConnected() {
        isConnected = ConnectionUtils.isConnected(getApplication());
    }

    public abstract void initUI();

    public abstract void initData();

    public abstract void initListener();

    public abstract void setView();

    public static Context getContext() {
        return context;
    }
}
