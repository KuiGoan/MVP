package com.ifi.kuirin.mvp.f1_connect_device;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.f2_live_event.LiveEventFragment;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;
import com.ifi.kuirin.mvp.util.Logger;

import butterknife.BindView;
import butterknife.OnClick;

public class ConnectDeviceFragment extends BaseFragment implements IConnectDeviceContract.View {

    public static final String TAG = ConnectDeviceFragment.class.getClass().getSimpleName();

    @BindView(R.id.f1_connect_btn)
    Button mConnectBtn;

    private ConnectDevicePresenter mConnectDevicePresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f1_connect_devcie_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mConnectDevicePresenter = ConnectDevicePresenter.getInstance();
        mConnectDevicePresenter.attach(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mConnectDevicePresenter.detach();
    }

    @OnClick(R.id.f1_connect_btn)
    public void onViewClicked() {
        mConnectDevicePresenter.checkConnect();
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
