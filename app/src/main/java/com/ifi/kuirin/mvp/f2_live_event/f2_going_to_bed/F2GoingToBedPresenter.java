package com.ifi.kuirin.mvp.f2_live_event.f2_going_to_bed;

import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2GoingToBedPresenter extends BasePresenter<IF2GoingToBedContract.View>
        implements IF2GoingToBedContract.Presenter {

    private static F2GoingToBedPresenter sInstanse = new F2GoingToBedPresenter();

    public static F2GoingToBedPresenter getInstance() {
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
