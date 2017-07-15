package com.ifi.kuirrin.mvp.f2_live_event;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ifi.kuirrin.mvp.R;
import com.ifi.kuirrin.mvp.base.BaseFragment;
import com.ifi.kuirrin.mvp.f2_live_event.f2_defecation_begins.F2DefecationBeginsFragment;
import com.ifi.kuirrin.mvp.util.CustomFragmentManager;
import com.ifi.kuirrin.mvp.util.Logger;

import butterknife.BindView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class LiveEventFragment extends BaseFragment implements ILiveEventContract.View, View.OnClickListener {

    public static final String TAG = LiveEventFragment.class.getSimpleName();

    @BindView(R.id.tvHello)
    TextView mTvHello;
    @BindView(R.id.f2_live_event_framelayout)
    FrameLayout mFramelayout;
    @BindView(R.id.btn_symptom_occurrence)
    RelativeLayout mBtnSymptomOccurrence;

    private LiveEventPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_live_event_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mLiveEventPresenter = LiveEventPresenter.getInstance();
        mLiveEventPresenter.attach(this);
        mLiveEventPresenter.initFragment();
        mBtnSymptomOccurrence.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_symptom_occurrence:
                mLiveEventPresenter.symptomOccurrence();
                break;
            default:
                break;
        }
    }

    @Override
    public void onInitFragment() {
        CustomFragmentManager.build(getActivity())
                .addFragment(mFramelayout.getId(), new F2DefecationBeginsFragment(), TAG);
    }

    @Override
    public void onSymptomOccurrence() {
        Logger.d(TAG, "onSymptomOccurrence()");
    }
}
