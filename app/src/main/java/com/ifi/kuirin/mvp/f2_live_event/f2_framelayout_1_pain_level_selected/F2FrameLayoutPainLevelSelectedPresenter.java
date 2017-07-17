package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_1_pain_level_selected;

import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2FrameLayoutPainLevelSelectedPresenter extends BasePresenter<IF2FrameLayoutPainLevelSelectedContract.View>
        implements IF2FrameLayoutPainLevelSelectedContract.Presenter {

    private static F2FrameLayoutPainLevelSelectedPresenter sInstanse = new F2FrameLayoutPainLevelSelectedPresenter();

    public static F2FrameLayoutPainLevelSelectedPresenter getInstance() {
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
