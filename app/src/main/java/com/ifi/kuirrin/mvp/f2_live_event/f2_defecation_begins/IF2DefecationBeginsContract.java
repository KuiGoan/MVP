package com.ifi.kuirrin.mvp.f2_live_event.f2_defecation_begins;

import com.ifi.kuirrin.mvp.base.IBasePresenter;
import com.ifi.kuirrin.mvp.base.IBaseView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public interface IF2DefecationBeginsContract {
    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<IF2DefecationBeginsContract.View> {

        void defecationBeginsPressed();

        void goingToBedPressed();

        void startAMealPressed();

        void initFragment();
    }

    interface View extends IBaseView {

        void onDefecationBegins();

        void onGoingToBed();

        void onStartAMeal();

        void onInitFragment();
    }
}
