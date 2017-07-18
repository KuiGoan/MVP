package com.ifi.kuirin.mvp.f5_pain_level;

import com.ifi.kuirin.mvp.base.IBasePresenter;
import com.ifi.kuirin.mvp.base.IBaseView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public interface IF5PainLevelContract {
    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<View> {

//        void loadData();
    }

    interface View extends IBaseView {

//        void onLoadData();
    }
}
