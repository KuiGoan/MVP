package com.ifi.kuirin.mvp.f4_pain_place;


import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F4PainPlacePresenter extends BasePresenter<IF4PainPlaceContract.View>
        implements IF4PainPlaceContract.Presenter {

    private static F4PainPlacePresenter sInstanse = new F4PainPlacePresenter();

    public static F4PainPlacePresenter getInstance() {
        return sInstanse;
    }

    @Override
    public void positionPress(int position) {
        getView().onPositionPressed(position);
    }
}
