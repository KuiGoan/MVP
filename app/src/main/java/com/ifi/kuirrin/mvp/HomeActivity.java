package com.ifi.kuirrin.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ifi.kuirrin.mvp.base.BaseActivity;
import com.ifi.kuirrin.mvp.f1_connect_device.ConnectDeviceFragment;
import com.ifi.kuirrin.mvp.util.CustomFragmentManager;
import com.ifi.kuirrin.mvp.util.Logger;
//import butterknife.ButterKnife;
//import butterknife.OnClick;
//import butterknife.OnItemClick;

public class HomeActivity extends BaseActivity implements IHomeContract.View {

    public static final String TAG = HomeActivity.class.getSimpleName();

    private HomePresenter mHomePresenter;

    @Override
    protected int getContentResource() {
        return R.layout.home_activity;
    }

    @Override
    protected void init(@Nullable Bundle state) {
        mHomePresenter = HomePresenter.getInstance();
        mHomePresenter.attach(this);
        mHomePresenter.initFragment();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHomePresenter.detach();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mHomePresenter.backButtonPressed();
    }

    @Override
    public void onInitFragment() {
        Logger.d(TAG, "onInitFragment()");
        CustomFragmentManager
                .build(this)
                .addFragment(R.id.home_framelayout,
                        new ConnectDeviceFragment(), ConnectDeviceFragment.TAG);
    }

    @Override
    public void onBackButton() {
        Logger.d(TAG, "onBackButton()#before back: "
                + getFragmentManager().getBackStackEntryCount());
        if (getFragmentManager().getBackStackEntryCount() > 0) {
//            getFragmentManager().popBackStack();
        } else {
//            finish();
        }
    }
}
