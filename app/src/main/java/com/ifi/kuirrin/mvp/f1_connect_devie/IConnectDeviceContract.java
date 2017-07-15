package com.ifi.kuirrin.mvp.f1_connect_devie;

import com.ifi.kuirrin.mvp.base.IBasePresenter;
import com.ifi.kuirrin.mvp.base.IBaseView;

/**
 * Created by ddquy on 7/14/2017.
 */

public interface IConnectDeviceContract {

    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<IConnectDeviceContract.View> {

        void checkConnect();
    }

    interface View extends IBaseView {
        void onConnectDeviceSuccess();

        void onConnectDeviceFailed();
    }
}
