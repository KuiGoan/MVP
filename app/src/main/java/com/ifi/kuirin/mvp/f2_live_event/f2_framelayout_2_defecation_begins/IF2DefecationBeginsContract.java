package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2_defecation_begins;

import com.ifi.kuirin.mvp.base.IBasePresenter;
import com.ifi.kuirin.mvp.base.IBaseView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public interface IF2DefecationBeginsContract {
    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<View> {

//        void loadData();
        void clickItem(int position);
    }

    interface View extends IBaseView {

//        void onLoadData();
        void onClickItem(int position);
    }
}
