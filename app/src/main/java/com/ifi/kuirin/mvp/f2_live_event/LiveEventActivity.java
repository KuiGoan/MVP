package com.ifi.kuirin.mvp.f2_live_event;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseActivity;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_1.F2FrameLayout_1_Fragment;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2.F2FrameLayout_2_Fragment;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2_defecation_begins.F2DefecationBeginsFragment;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;
import com.ifi.kuirin.mvp.util.Logger;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class LiveEventActivity extends BaseActivity implements ILiveEventContract.View {

    public static final String TAG = LiveEventActivity.class.getSimpleName();
    private LiveEventPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_live_event_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state) {
        Logger.d(TAG, "init()");
        mLiveEventPresenter = LiveEventPresenter.getInstance();
        mLiveEventPresenter.attach(this);

        //init framelayout 1: alway set false
        mLiveEventPresenter.checkPainLevelHasSelected(false);

        //init framelayout 2: can set true or false
        mLiveEventPresenter.checkDefecationHasSelected(false);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLiveEventPresenter.detach();
    }

    @Override
    public void onDefecationDontSelect() {
        CustomFragmentManager.build(this)
                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout_2,
                        new F2FrameLayout_2_Fragment(), F2FrameLayout_2_Fragment.TAG);
    }

    @Override
    public void onDefecationHasSelected() {
        CustomFragmentManager.build(this)
                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout_2,
                        new F2DefecationBeginsFragment(), F2DefecationBeginsFragment.TAG);
    }

    @Override
    public void onPainLevelDontSelect() {
        CustomFragmentManager.build(this)
                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout_1,
                        new F2FrameLayout_1_Fragment(), F2FrameLayout_1_Fragment.TAG);
    }

    @Override
    public void onPainLevelHasSelected() {
//        CustomFragmentManager.build(this)
//                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout_1,
//                        new F5FrameLayoutPainLevelSelectedFragment(),
//                        F5FrameLayoutPainLevelSelectedFragment.TAG);
    }
}
