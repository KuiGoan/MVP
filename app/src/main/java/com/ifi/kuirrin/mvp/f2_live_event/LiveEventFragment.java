package com.ifi.kuirrin.mvp.f2_live_event;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.ifi.kuirrin.mvp.R;
import com.ifi.kuirrin.mvp.base.BaseFragment;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class LiveEventFragment extends BaseFragment implements ILiveEventContract.View, View.OnClickListener{

    public static final String TAG = LiveEventFragment.class.getSimpleName();

    private LiveEventPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_live_event_fragment_layout;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mLiveEventPresenter = LiveEventPresenter.getInstance();
        mLiveEventPresenter.attach(this);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onConnectDeviceSuccess() {

    }

    @Override
    public void onConnectDeviceFailed() {

    }
}
