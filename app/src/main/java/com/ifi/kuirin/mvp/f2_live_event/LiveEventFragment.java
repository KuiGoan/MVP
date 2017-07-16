package com.ifi.kuirin.mvp.f2_live_event;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout.F2FrameLayoutFragment;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;
import com.ifi.kuirin.mvp.util.Logger;

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
        mBtnSymptomOccurrence.setOnClickListener(this);

        CustomFragmentManager.build(getActivity())
                .addFragment(mFramelayout.getId(), new F2FrameLayoutFragment(), F2FrameLayoutFragment.TAG);
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
    public void onSymptomOccurrence() {
        Logger.d(TAG, "onSymptomOccurrence()");
    }
}
