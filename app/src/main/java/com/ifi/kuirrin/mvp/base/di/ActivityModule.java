package com.ifi.kuirrin.mvp.base.di;

import android.content.Context;

import com.ifi.kuirrin.mvp.f1_connect_device.IConnectDeviceContract;
import com.ifi.kuirrin.mvp.f1_connect_device.ConnectDevicePresenter;

//import javax.inject.Singleton;
//
//import dagger.Module;
//import dagger.Provides;

/**
 * Created by ddquy on 7/14/2017.
 */

//@Module
public class ActivityModule {
    private Context mContext;

    public ActivityModule(Context context) {
        mContext = context;
    }

//    @Provides
//    @Singleton
//    ChromeTabsWrapper providesChromeTabsWrapper() {
//        return new ChromeTabsWrapper(mContext);
//    }

//    @Provides
//    @Singleton
    IConnectDeviceContract.Presenter providesMainPresenter() {
        return new ConnectDevicePresenter();
    }
}
