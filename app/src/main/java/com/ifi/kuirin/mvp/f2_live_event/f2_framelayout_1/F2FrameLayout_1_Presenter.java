package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_1;

import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2FrameLayout_1_Presenter extends BasePresenter<IF2FrameLayout_1_Contract.View>
        implements IF2FrameLayout_1_Contract.Presenter {

    private static F2FrameLayout_1_Presenter sInstanse = new F2FrameLayout_1_Presenter();

    public static F2FrameLayout_1_Presenter getInstance() {
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
