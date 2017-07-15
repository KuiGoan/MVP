package com.ifi.kuirin.mvp.f2_live_event.f2_going_to_bed;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;

import butterknife.BindView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2GoingToBedFragment extends BaseFragment implements IF2GoingToBedContract.View, View.OnClickListener {

    public static final String TAG = F2GoingToBedFragment.class.getSimpleName();

    @BindView(R.id.tvHello)
    TextView mTvHello;

    private F2GoingToBedPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_live_event_defecation_begins_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mLiveEventPresenter = F2GoingToBedPresenter.getInstance();
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
