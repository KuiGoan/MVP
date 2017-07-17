package com.ifi.kuirin.mvp.f2_live_event.f2_defecation_begins_framelayout;

import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2DefecationBeginsPresenter extends BasePresenter<IF2DefecationBeginsContract.View>
        implements IF2DefecationBeginsContract.Presenter {

    private static F2DefecationBeginsPresenter sInstanse = new F2DefecationBeginsPresenter();

    public static F2DefecationBeginsPresenter getInstance() {
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
