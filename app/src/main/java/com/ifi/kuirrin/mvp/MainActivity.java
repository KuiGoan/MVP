package com.ifi.kuirrin.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ifi.kuirrin.mvp.base.BaseActivity;

public class MainActivity extends BaseActivity implements IMainContract.View, View.OnClickListener {

    private TextView mTextHello;
    private Button mBtClick;

    private MainPresenter mMainPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(@Nullable Bundle state) {
        mTextHello = (TextView) findViewById(R.id.tvHello);
        mTextHello.setOnClickListener(this);
        mBtClick = (Button) findViewById(R.id.btClick);
        mBtClick.setOnClickListener(this);

        mMainPresenter = MainPresenter.getInstance();
        mMainPresenter.attach(this);
        mMainPresenter.loadHelloText();
    }

    @Override
    public void onTextLoaded(String text) {
        mTextHello.setText(text);
    }

    @Override
    public void onClicked() {
        mBtClick.setText("Clicked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMainPresenter.detach();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvHello:
                mMainPresenter.loadHelloText();
                break;
            case R.id.btClick:
                mMainPresenter.setClickHere();
                break;
            default:
                break;
        }
    }
}
