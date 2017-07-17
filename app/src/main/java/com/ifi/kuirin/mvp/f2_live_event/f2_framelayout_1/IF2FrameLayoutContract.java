package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_1;

import com.ifi.kuirin.mvp.base.IBasePresenter;
import com.ifi.kuirin.mvp.base.IBaseView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public interface IF2FrameLayoutContract {
    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<View> {

        void itemSymptonSelect(int position);

        void symptomOccurrence();
    }

    interface View extends IBaseView {

        void onSymptonSelected(int position);

        void onSymptomOccurrence();
    }
}
