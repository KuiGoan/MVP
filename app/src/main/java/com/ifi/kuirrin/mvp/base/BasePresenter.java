package com.ifi.kuirrin.mvp.base;

/**
 * Created by ddquy on 7/14/2017.
 */

public class BasePresenter<V extends IBaseView> implements IBasePresenter<V>{

    private V mView;

    @Override
    public void attach(V view) {
        mView = view;
    }

    @Override
    public void detach() {
        mView = null;
    }

    @Override
    public boolean isAttached() {
        return mView != null;
    }

    public V getView() {
        return mView;
    }
}
