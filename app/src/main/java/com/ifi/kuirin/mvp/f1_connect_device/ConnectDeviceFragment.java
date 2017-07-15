package com.ifi.kuirin.mvp.f1_connect_device;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.f2_live_event.LiveEventFragment;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;
import com.ifi.kuirin.mvp.util.Logger;

import butterknife.BindView;

public class ConnectDeviceFragment extends BaseFragment implements IConnectDeviceContract.View, View.OnClickListener {

    public static final String TAG = ConnectDeviceFragment.class.getClass().getSimpleName();

    @BindView(R.id.tvHello)
    TextView mTvHello;
    @BindView(R.id.btnClick)
    Button mBtClick;

    private ConnectDevicePresenter mConnectDevicePresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f1_connect_devcie_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mTvHello.setOnClickListener(this);
        mBtClick.setOnClickListener(this);
        mConnectDevicePresenter = ConnectDevicePresenter.getInstance();
        mConnectDevicePresenter.attach(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mConnectDevicePresenter.detach();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnClick:
                mConnectDevicePresenter.checkConnect();
                break;
            default:
                break;
        }
    }

    @Override
    public void onConnectDeviceSuccess() {
        Logger.d(TAG, "onConnectDeviceSuccess()");
        CustomFragmentManager.build(getActivity())
                .replaceFragment(R.id.home_framelayout, new LiveEventFragment(), LiveEventFragment.TAG);
    }

    @Override
    public void onConnectDeviceFailed() {

    }
}
