package com.ifi.kuirin.mvp;

import com.ifi.kuirin.mvp.base.IBasePresenter;
import com.ifi.kuirin.mvp.base.IBaseView;

/**
 * Created by ddquy on 7/14/2017.
 */

public interface IHomeContract {

    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<View> {

        void backButtonPressed();
    }

    interface View extends IBaseView {

        void onBackButton();
    }
}
