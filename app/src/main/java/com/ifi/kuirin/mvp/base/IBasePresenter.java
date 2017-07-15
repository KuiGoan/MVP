package com.ifi.kuirin.mvp.base;

/**
 * Created by ddquy on 7/14/2017.
 */

public interface IBasePresenter<V extends IBaseView> {
    /**
     * Called when view attached to presenter
     *
     * @param view
     */
    void attach(V view);

    /**
     * Called when view is detached from presenter
     */
    void detach();

    /**
     * @return true if view is attached to presenter
     */
    boolean isAttached();
}
