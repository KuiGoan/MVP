package com.ifi.kuirin.mvp.f1_connect_device;

import com.ifi.kuirin.mvp.base.IBasePresenter;
import com.ifi.kuirin.mvp.base.IBaseView;

/**
 * Created by ddquy on 7/14/2017.
 */

public interface IConnectDeviceContract {

    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<View> {

        void checkConnect();
    }

    interface View extends IBaseView {
        void onConnectDeviceSuccess();

        void onConnectDeviceFailed();
    }
}
