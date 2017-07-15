package com.ifi.kuirrin.mvp.base.di;

import com.ifi.kuirrin.mvp.f1_connect_devie.ConnectDeviceFragment;

/**
 * Created by ddquy on 7/14/2017.
 */

//@Singleton
//@Component(modules = {ActivityModule.class})
public interface IActivityComponent {

    void inject(ConnectDeviceFragment obj);

}
