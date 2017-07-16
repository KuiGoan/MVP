package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.base.view.RectangleView;
import com.ifi.kuirin.mvp.util.Logger;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2FrameLayoutFragment extends BaseFragment implements IF2FrameLayoutContract.View, View.OnClickListener {

    public static final String TAG = F2FrameLayoutFragment.class.getSimpleName();
    @BindView(R.id.tvHello)
    TextView mTvHello;
    @BindView(R.id.box1)
    RectangleView mBox1;
    @BindView(R.id.threeboxs)
    LinearLayout mThreeboxs;
    Unbinder unbinder;
    @BindView(R.id.box2)
    RectangleView mBox2;
    @BindView(R.id.box3)
    RectangleView mBox3;

    private F2FrameLayoutPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_live_event_framelayout_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mLiveEventPresenter = F2FrameLayoutPresenter.getInstance();
        mLiveEventPresenter.attach(this);

        mBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logger.d("aaaaa", "box 1");
            }
        });

        mBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logger.d("aaaaa", "box 2");
            }
        });

        mBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logger.d("aaaaa", "box 3");
            }
        });
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
