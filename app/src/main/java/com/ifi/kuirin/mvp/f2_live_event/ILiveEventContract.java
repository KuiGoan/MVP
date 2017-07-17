package com.ifi.kuirin.mvp.f2_live_event;

import com.ifi.kuirin.mvp.base.IBasePresenter;
import com.ifi.kuirin.mvp.base.IBaseView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public interface ILiveEventContract {
    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<View> {

        void symptomOccurrence();

        void itemSymptonSelect(int position);
    }

    interface View extends IBaseView {

        void onSymptomOccurrence();

        void onSymptonSelected(int position);
    }
}
