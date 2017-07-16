package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2FrameLayoutFragment extends BaseFragment implements IF2FrameLayoutContract.View, View.OnClickListener {

    public static final String TAG = F2FrameLayoutFragment.class.getSimpleName();

    private F2FrameLayoutPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_live_event_framelayout_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mLiveEventPresenter = F2FrameLayoutPresenter.getInstance();
        mLiveEventPresenter.attach(this);
    }

    @Override
    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.btn_symptom_occurrence:
//                mLiveEventPresenter.symptomOccurrence();
//                break;
//            default:
//                break;
//        }
    }

    @Override
    public void onDefecationBegins() {

    }

    @Override
    public void onGoingToBed() {

    }

    @Override
    public void onStartAMeal() {

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mLiveEventPresenter.detach();
    }
}
