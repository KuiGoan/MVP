package com.ifi.kuirin.mvp.f5_pain_level;

import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F5PainLevelPresenter extends BasePresenter<IF5PainLevelContract.View>
        implements IF5PainLevelContract.Presenter {

    private static F5PainLevelPresenter sInstanse = new F5PainLevelPresenter();

    public static F5PainLevelPresenter getInstance() {
        return sInstanse;
    }

    @Override
    public void loadData() {
        getView().onLoadData();
    }

    @Override
    public void painLevelItemSelect(int position) {
        getView().onPainLevelItemSelected(position);
    }
}
