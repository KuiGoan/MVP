package com.ifi.kuirin.mvp.f5_pain_level.f5_framelayout_1_pain_level_selected;

import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F5FrameLayoutPainLevelSelectedPresenter extends BasePresenter<IF5FrameLayoutPainLevelSelectedContract.View>
        implements IF5FrameLayoutPainLevelSelectedContract.Presenter {

    private static F5FrameLayoutPainLevelSelectedPresenter sInstanse = new F5FrameLayoutPainLevelSelectedPresenter();

    public static F5FrameLayoutPainLevelSelectedPresenter getInstance() {
        return sInstanse;
    }

    @Override
    public void emojiPressed() {
        getView().onEmojiPressed();
    }

    @Override
    public void deleteBtnPressed() {
        getView().onDeleteBtnPressed();
    }
}
