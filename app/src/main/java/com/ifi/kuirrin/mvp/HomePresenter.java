package com.ifi.kuirrin.mvp;

import com.ifi.kuirrin.mvp.base.BasePresenter;

/**
 * Created by ddquy on 7/14/2017.
 */

public class HomePresenter extends BasePresenter<IHomeContract.View> implements IHomeContract.Presenter {

    private static HomePresenter sInstanse = new HomePresenter();

    public static HomePresenter getInstance() {
        return sInstanse;
    }

    @Override
    public void initFragment() {
        getView().onInitFragment();
    }

    @Override
    public void backButtonPressed() {
        getView().onBackButton();
    }
}
