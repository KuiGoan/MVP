package com.ifi.kuirrin.mvp.f2_live_event;

import com.ifi.kuirrin.mvp.base.IBasePresenter;
import com.ifi.kuirrin.mvp.base.IBaseView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public interface ILiveEventContract {
    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<ILiveEventContract.View> {

//        void defecationBeginsPressed();
//
//        void goingToBedPressed();
//
//        void startAMealPressed();
        void initFragment();

        void symptomOccurrence();
    }

    interface View extends IBaseView {

//        void onDefecationBegins();
//
//        void onGoingToBed();
//
//        void onStartAMeal();
        void onInitFragment();

        void onSymptomOccurrence();
    }
}
