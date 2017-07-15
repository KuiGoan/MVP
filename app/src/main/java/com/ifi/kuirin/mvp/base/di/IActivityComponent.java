package com.ifi.kuirin.mvp.base.di;

import com.ifi.kuirin.mvp.f1_connect_device.ConnectDeviceFragment;

/**
 * Created by ddquy on 7/14/2017.
 */

//@Singleton
//@Component(modules = {ActivityModule.class})
public interface IActivityComponent {

    void inject(ConnectDeviceFragment obj);

}
