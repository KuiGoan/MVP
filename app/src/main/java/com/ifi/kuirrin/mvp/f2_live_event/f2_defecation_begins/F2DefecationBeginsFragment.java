package com.ifi.kuirrin.mvp.f2_live_event.f2_defecation_begins;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.ifi.kuirrin.mvp.R;
import com.ifi.kuirrin.mvp.base.BaseFragment;
import com.ifi.kuirrin.mvp.f2_live_event.ILiveEventContract;
import com.ifi.kuirrin.mvp.f2_live_event.LiveEventPresenter;
import com.ifi.kuirrin.mvp.util.Logger;

import butterknife.BindView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2DefecationBeginsFragment extends BaseFragment implements ILiveEventContract.View, View.OnClickListener {

    public static final String TAG = F2DefecationBeginsFragment.class.getSimpleName();

    @BindView(R.id.tvHello)
    TextView mTvHello;

    private LiveEventPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_live_event_defecation_begins_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mLiveEventPresenter = LiveEventPresenter.getInstance();
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
    public void onInitFragment() {

    }

    @Override
    public void onSymptomOccurrence() {
        Logger.d(TAG, "onSymptomOccurrence()");
    }
}
