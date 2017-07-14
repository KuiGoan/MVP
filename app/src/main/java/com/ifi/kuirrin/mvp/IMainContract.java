package com.ifi.kuirrin.mvp;

import com.ifi.kuirrin.mvp.base.IBasePresenter;
import com.ifi.kuirrin.mvp.base.IBaseView;

/**
 * Created by ddquy on 7/14/2017.
 */

public interface IMainContract {

    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<IMainContract.View> {
        void loadHelloText();

        void setClickHere();
    }

    interface View extends IBaseView {
        void onTextLoaded(String text);

        void onClicked();
    }
}
