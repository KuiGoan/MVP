package com.ifi.kuirin.mvp.f2_live_event;


import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class LiveEventPresenter extends BasePresenter<ILiveEventContract.View>
        implements ILiveEventContract.Presenter {

    private static LiveEventPresenter sInstanse = new LiveEventPresenter();

    public static LiveEventPresenter getInstance() {
        return sInstanse;
    }

    @Override
    public void symptomOccurrence() {
        getView().onSymptomOccurrence();
    }
}
