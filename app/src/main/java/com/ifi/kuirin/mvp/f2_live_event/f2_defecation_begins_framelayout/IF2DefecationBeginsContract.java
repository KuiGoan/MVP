package com.ifi.kuirin.mvp.f2_live_event.f2_defecation_begins_framelayout;

import com.ifi.kuirin.mvp.base.IBasePresenter;
import com.ifi.kuirin.mvp.base.IBaseView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public interface IF2DefecationBeginsContract {
    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<View> {

        void defecationBeginsPressed();

        void goingToBedPressed();

        void startAMealPressed();
    }

    interface View extends IBaseView {

        void onDefecationBegins();

        void onGoingToBed();

        void onStartAMeal();
    }
}
