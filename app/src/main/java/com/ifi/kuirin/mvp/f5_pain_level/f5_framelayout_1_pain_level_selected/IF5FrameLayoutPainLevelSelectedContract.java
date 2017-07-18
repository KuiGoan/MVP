package com.ifi.kuirin.mvp.f5_pain_level.f5_framelayout_1_pain_level_selected;

import com.ifi.kuirin.mvp.base.IBasePresenter;
import com.ifi.kuirin.mvp.base.IBaseView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public interface IF5FrameLayoutPainLevelSelectedContract {
    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<View> {

        void startAMealPressed();

        void endOfAMealPressed();

        void defecationBeginsPressed();

        void goingToBedPressed();

        void wakeUp();
    }

    interface View extends IBaseView {

        void onStartAMeal();

        void onEndOfTheMeal();

        void onDefecationBegins();

        void onGoingToBed();

        void onWakeup();
    }
}
