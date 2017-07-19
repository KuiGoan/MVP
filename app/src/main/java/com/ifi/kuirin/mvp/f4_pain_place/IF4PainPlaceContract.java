package com.ifi.kuirin.mvp.f4_pain_place;

import com.ifi.kuirin.mvp.base.IBasePresenter;
import com.ifi.kuirin.mvp.base.IBaseView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public interface IF4PainPlaceContract {
    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<View> {

        void positionPress(int position);
    }

    interface View extends IBaseView {

        void onPositionPressed(int position);
    }
}
