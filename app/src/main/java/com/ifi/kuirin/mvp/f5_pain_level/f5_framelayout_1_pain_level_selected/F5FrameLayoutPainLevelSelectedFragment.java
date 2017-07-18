package com.ifi.kuirin.mvp.f5_pain_level.f5_framelayout_1_pain_level_selected;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.base.dialog.AlertDialogFragment;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;

import butterknife.OnClick;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F5FrameLayoutPainLevelSelectedFragment extends BaseFragment implements IF5FrameLayoutPainLevelSelectedContract.View {

    public static final String TAG = F5FrameLayoutPainLevelSelectedFragment.class.getSimpleName();

    private F5FrameLayoutPainLevelSelectedPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f5_framelayout_1_pain_level_selected_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {

        mLiveEventPresenter = F5FrameLayoutPainLevelSelectedPresenter.getInstance();
        mLiveEventPresenter.attach(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mLiveEventPresenter.detach();
    }


    @Override
    public void onStartAMeal() {

    }

    @Override
    public void onEndOfTheMeal() {

    }

    @Override
    public void onDefecationBegins() {

    }

    @Override
    public void onGoingToBed() {

    }

    @Override
    public void onWakeup() {

    }
}
