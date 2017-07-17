package com.ifi.kuirin.mvp.f2_live_event;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
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
    @BindView(R.id.f2_symptom_occurrence_text)
    TextView mF2SymptomOccurrenceText;
    @BindView(R.id.f2_symptom_occurrence_btn)
    RelativeLayout mF2SymptomOccurrenceBtn;
    @BindView(R.id.f2_live_event_framelayout)
    FrameLayout mF2LiveEventFramelayout;

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
        mF2SymptomOccurrenceBtn.setOnClickListener(this);

        CustomFragmentManager.build((AppCompatActivity) getActivity())
                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout, new F2FrameLayoutFragment(), F2FrameLayoutFragment.TAG);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.f2_symptom_occurrence_btn:
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
