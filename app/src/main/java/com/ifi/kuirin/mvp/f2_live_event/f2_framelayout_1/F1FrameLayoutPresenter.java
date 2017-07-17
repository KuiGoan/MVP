package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_1;

import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F1FrameLayoutPresenter extends BasePresenter<IF1FrameLayoutContract.View>
        implements IF1FrameLayoutContract.Presenter {

    private static F1FrameLayoutPresenter sInstanse = new F1FrameLayoutPresenter();

    public static F1FrameLayoutPresenter getInstance() {
        return sInstanse;
    }


    @Override
    public void itemSymptonSelect(int position) {
        getView().onSymptonSelected(position);
    }

    @Override
    public void symptomOccurrence() {
        getView().onSymptomOccurrence();
    }
}
