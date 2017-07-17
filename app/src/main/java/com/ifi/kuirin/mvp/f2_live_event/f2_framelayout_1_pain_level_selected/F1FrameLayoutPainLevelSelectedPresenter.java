package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_1_pain_level_selected;

import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F1FrameLayoutPainLevelSelectedPresenter extends BasePresenter<IF1FrameLayoutPainLevelSelectedContract.View>
        implements IF1FrameLayoutPainLevelSelectedContract.Presenter {

    private static F1FrameLayoutPainLevelSelectedPresenter sInstanse = new F1FrameLayoutPainLevelSelectedPresenter();

    public static F1FrameLayoutPainLevelSelectedPresenter getInstance() {
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
