package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2;

import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2FrameLayout_2_Presenter extends BasePresenter<IF2FrameLayout_2_Contract.View>
        implements IF2FrameLayout_2_Contract.Presenter {

    private static F2FrameLayout_2_Presenter sInstanse = new F2FrameLayout_2_Presenter();

    public static F2FrameLayout_2_Presenter getInstance() {
        return sInstanse;
    }

    @Override
    public void startAMealPressed() {
        getView().onStartAMeal();
    }

    @Override
    public void endOfAMealPressed() {

    }

    @Override
    public void defecationBeginsPressed() {
        getView().onDefecationBegins();
    }

    @Override
    public void goingToBedPressed() {
        getView().onGoingToBed();
    }

    @Override
    public void wakeUp() {

    }
}
