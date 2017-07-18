package com.ifi.kuirin.mvp.f5_pain_level.f5_pain_level_selection;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseActivity;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_1.F2FrameLayout_1_Fragment;
import com.ifi.kuirin.mvp.f5_pain_level.f5_framelayout_1_pain_level_selected.F5FrameLayoutPainLevelSelectedFragment;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2.F2FrameLayout_2_Fragment;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2_defecation_begins.F2DefecationBeginsFragment;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;
import com.ifi.kuirin.mvp.util.Logger;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F5PainLevelSelectionActivity extends BaseActivity implements IF5PainLevelSelectionContract.View {

    public static final String TAG = F5PainLevelSelectionActivity.class.getSimpleName();
    private F5PainLevelSelectionPresenter mF5PainLevelSelectionPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_live_event_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state) {
        Logger.d(TAG, "init()");
        mF5PainLevelSelectionPresenter = F5PainLevelSelectionPresenter.getInstance();
        mF5PainLevelSelectionPresenter.attach(this);

        //init framelayout 1. Alway set true
        mF5PainLevelSelectionPresenter.checkPainLevelHasSelected(true);

        //init framelayout 2. Or true or false
        mF5PainLevelSelectionPresenter.checkDefecationHasSelected(true);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mF5PainLevelSelectionPresenter.detach();
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

//    @Override
//    public void onPainLevelDontSelect() {
//        CustomFragmentManager.build(this)
//                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout_1,
//                        new F2FrameLayout_1_Fragment(), F2FrameLayout_1_Fragment.TAG);
//    }

    @Override
    public void onPainLevelHasSelected() {
        CustomFragmentManager.build(this)
                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout_1,
                        new F5FrameLayoutPainLevelSelectedFragment(),
                        F5FrameLayoutPainLevelSelectedFragment.TAG);
    }
}
