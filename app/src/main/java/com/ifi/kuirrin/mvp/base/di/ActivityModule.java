package com.ifi.kuirrin.mvp.base.di;

import android.content.Context;

import com.ifi.kuirrin.mvp.home.IMainContract;
import com.ifi.kuirrin.mvp.home.MainPresenter;

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
    IMainContract.Presenter providesMainPresenter() {
        return new MainPresenter();
    }
}
