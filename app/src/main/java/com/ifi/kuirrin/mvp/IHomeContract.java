package com.ifi.kuirrin.mvp;

import com.ifi.kuirrin.mvp.base.IBasePresenter;
import com.ifi.kuirrin.mvp.base.IBaseView;

/**
 * Created by ddquy on 7/14/2017.
 */

public interface IHomeContract {

    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<IHomeContract.View> {

        void initFragment();

        void backButtonPressed();
    }

    interface View extends IBaseView {

        void onInitFragment();

        void onBackButton();
    }
}
