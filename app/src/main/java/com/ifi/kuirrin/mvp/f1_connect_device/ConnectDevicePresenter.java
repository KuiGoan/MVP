package com.ifi.kuirrin.mvp.f1_connect_device;

import com.ifi.kuirrin.mvp.base.BasePresenter;

/**
 * Created by ddquy on 7/14/2017.
 */

public class ConnectDevicePresenter extends BasePresenter<IConnectDeviceContract.View> implements IConnectDeviceContract.Presenter{

    private static ConnectDevicePresenter sInstanse = new ConnectDevicePresenter();

    public static ConnectDevicePresenter getInstance() {
        return sInstanse;
    }

    @Override
    public void checkConnect() {
        boolean status = true;
        if (status) {
            getView().onConnectDeviceSuccess();
        } else {
            getView().onConnectDeviceFailed();
        }
    }
}
