package com.ifi.kuirin.mvp.f2_live_event;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_1.F1FrameLayoutFragment;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_1_pain_level_selected.F1FrameLayoutPainLevelSelectedFragment;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2.F2FrameLayoutFragment;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2_defecation_begins.F2DefecationBeginsFragment;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;
import com.ifi.kuirin.mvp.util.Logger;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class LiveEventFragment extends BaseFragment implements ILiveEventContract.View {

    public static final String TAG = LiveEventFragment.class.getSimpleName();
    private LiveEventPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_live_event_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        Logger.d(TAG, "init()");
        mLiveEventPresenter = LiveEventPresenter.getInstance();
        mLiveEventPresenter.attach(this);

        //init framelayout 1
        mLiveEventPresenter.checkPainLevelHasSelected(false);

        //init framelayout 2
        mLiveEventPresenter.checkDefecationHasSelected(false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mLiveEventPresenter.detach();
    }

    @Override
    public void onDefecationDontSelect() {
        CustomFragmentManager.build((AppCompatActivity) getActivity())
                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout_2,
                        new F2FrameLayoutFragment(), F2FrameLayoutFragment.TAG);
    }

    @Override
    public void onDefecationHasSelected() {
        CustomFragmentManager.build((AppCompatActivity) getActivity())
                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout_2,
                        new F2DefecationBeginsFragment(), F2DefecationBeginsFragment.TAG);
    }

    @Override
    public void onPainLevelDontSelect() {
        CustomFragmentManager.build((AppCompatActivity) getActivity())
                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout_1,
                        new F1FrameLayoutFragment(), F1FrameLayoutFragment.TAG);
    }

    @Override
    public void onPainLevelHasSelected() {
        CustomFragmentManager.build((AppCompatActivity) getActivity())
                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout_1,
                        new F1FrameLayoutPainLevelSelectedFragment(),
                        F1FrameLayoutPainLevelSelectedFragment.TAG);
    }
}
