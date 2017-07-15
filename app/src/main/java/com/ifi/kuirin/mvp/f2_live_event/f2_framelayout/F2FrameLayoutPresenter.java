package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout;

import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2FrameLayoutPresenter extends BasePresenter<IF2FrameLayoutContract.View>
        implements IF2FrameLayoutContract.Presenter {

    private static F2FrameLayoutPresenter sInstanse = new F2FrameLayoutPresenter();

    public static F2FrameLayoutPresenter getInstance() {
        return sInstanse;
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
    public void startAMealPressed() {
        getView().onStartAMeal();
    }

}
