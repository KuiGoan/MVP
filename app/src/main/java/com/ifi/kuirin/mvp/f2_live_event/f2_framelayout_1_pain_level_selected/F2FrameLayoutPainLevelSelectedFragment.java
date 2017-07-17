package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_1_pain_level_selected;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.base.dialog.AlertDialogFragment;
import com.ifi.kuirin.mvp.base.view.RectangleView;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2FrameLayoutPainLevelSelectedFragment extends BaseFragment implements IF2FrameLayoutPainLevelSelectedContract.View {

    public static final String TAG = F2FrameLayoutPainLevelSelectedFragment.class.getSimpleName();
    @BindView(R.id.f2_frame_layout_title_text)
    TextView mF2FrameLayoutTitleText;
    @BindView(R.id.f2_a_meal_btn)
    RectangleView mF2AMealBtn;
    @BindView(R.id.f2_defeation_btn)
    RectangleView mF2DefeationBtn;
    @BindView(R.id.f2_sleep_btn)
    RectangleView mF2SleepBtn;
    @BindView(R.id.f2_framelayout_threeitems)
    LinearLayout mF2FramelayoutThreebox;

    private F2FrameLayoutPainLevelSelectedPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_framelayout_2_threeitems_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {

        mLiveEventPresenter = F2FrameLayoutPainLevelSelectedPresenter.getInstance();
        mLiveEventPresenter.attach(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mLiveEventPresenter.detach();
    }

    @OnClick({R.id.f2_a_meal_btn, R.id.f2_defeation_btn, R.id.f2_sleep_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.f2_a_meal_btn:
                if (true) {
                    mLiveEventPresenter.startAMealPressed();
                } else {
                    mLiveEventPresenter.endOfAMealPressed();
                }
                break;
            case R.id.f2_defeation_btn:
                mLiveEventPresenter.defecationBeginsPressed();
                break;
            case R.id.f2_sleep_btn:
                if (true) {
                    mLiveEventPresenter.goingToBedPressed();
                } else {
                    mLiveEventPresenter.wakeUp();
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void onStartAMeal() {
        CustomFragmentManager
                .build((AppCompatActivity) getActivity())
                .addDialogFragment(AlertDialogFragment
                        .getInstance("aaa", "bbbb"), AlertDialogFragment.TAG);
    }

    @Override
    public void onEndOfTheMeal() {

    }

    @Override
    public void onDefecationBegins() {

    }

    @Override
    public void onGoingToBed() {

    }

    @Override
    public void onWakeup() {

    }
}
