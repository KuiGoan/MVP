package com.ifi.kuirin.mvp.f5_pain_level.f5_pain_level_selection;


import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F5PainLevelSelectionPresenter extends BasePresenter<IF5PainLevelSelectionContract.View>
        implements IF5PainLevelSelectionContract.Presenter {

    private static F5PainLevelSelectionPresenter sInstanse = new F5PainLevelSelectionPresenter();

    public static F5PainLevelSelectionPresenter getInstance() {
        return sInstanse;
    }

    @Override
    public void checkPainLevelHasSelected(boolean isSelected) {
//        if (isSelected) {
        getView().onPainLevelHasSelected();
//        } else {
//            getView().onPainLevelDontSelect();
//        }
    }

    @Override
    public void checkDefecationHasSelected(boolean isSelected) {
        if (isSelected) {
            getView().onDefecationHasSelected();
        } else {
            getView().onDefecationDontSelect();
        }
    }
}
