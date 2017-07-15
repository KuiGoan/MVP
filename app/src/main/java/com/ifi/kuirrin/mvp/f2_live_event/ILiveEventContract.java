package com.ifi.kuirrin.mvp.f2_live_event;

import com.ifi.kuirrin.mvp.base.IBasePresenter;
import com.ifi.kuirrin.mvp.base.IBaseView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public interface ILiveEventContract {
    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<ILiveEventContract.View> {
        void connectDevice(boolean status);
    }

    interface View extends IBaseView {
        void onConnectDeviceSuccess();

        void onConnectDeviceFailed();
    }
}
