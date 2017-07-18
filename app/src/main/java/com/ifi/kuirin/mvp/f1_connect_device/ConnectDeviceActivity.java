package com.ifi.kuirin.mvp.f1_connect_device;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseActivity;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.f2_live_event.LiveEventActivity;
import com.ifi.kuirin.mvp.f2_live_event.LiveEventFragment;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;
import com.ifi.kuirin.mvp.util.Logger;

import butterknife.BindView;
import butterknife.OnClick;

public class ConnectDeviceActivity extends BaseActivity implements IConnectDeviceContract.View {

    public static final String TAG = ConnectDeviceActivity.class.getClass().getSimpleName();

    @BindView(R.id.f1_connect_btn)
    Button mConnectBtn;

    private ConnectDevicePresenter mConnectDevicePresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f1_connect_devcie_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state) {
        mConnectDevicePresenter = ConnectDevicePresenter.getInstance();
        mConnectDevicePresenter.attach(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mConnectDevicePresenter.detach();
    }

    @OnClick(R.id.f1_connect_btn)
    public void onViewClicked() {
        mConnectDevicePresenter.checkConnect();
    }

    @Override
    public void onConnectDeviceSuccess() {
        Logger.d(TAG, "onConnectDeviceSuccess()");
//        CustomFragmentManager.build((AppCompatActivity) getActivity())
//                .replaceFragment(R.id.home_framelayout, new LiveEventFragment(), LiveEventFragment.TAG);
        Intent intent = new Intent(this, LiveEventActivity.class);
        startActivity(intent);
    }

    @Override
    public void onConnectDeviceFailed() {

    }
}
