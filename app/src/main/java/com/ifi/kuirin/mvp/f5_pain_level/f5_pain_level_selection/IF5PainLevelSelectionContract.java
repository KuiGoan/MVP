package com.ifi.kuirin.mvp.f5_pain_level.f5_pain_level_selection;

import com.ifi.kuirin.mvp.base.IBasePresenter;
import com.ifi.kuirin.mvp.base.IBaseView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public interface IF5PainLevelSelectionContract {
    // User actions. Presenter will implement
    interface Presenter extends IBasePresenter<View> {

        void checkDefecationHasSelected(boolean isSelected);

        void checkPainLevelHasSelected(boolean isSelected);
    }

    interface View extends IBaseView {

        void onDefecationDontSelect();

        void onDefecationHasSelected();

//        void onPainLevelDontSelect();

        void onPainLevelHasSelected();
    }
}
