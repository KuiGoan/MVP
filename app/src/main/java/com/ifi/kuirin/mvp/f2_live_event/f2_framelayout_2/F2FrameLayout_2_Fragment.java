package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.base.dialog.AlertDialogFragment;
import com.ifi.kuirin.mvp.base.dialog.CameraDialogFragment;
import com.ifi.kuirin.mvp.base.view.RectangleView;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2_defecation_begins.F2DefecationBeginsFragment;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;
import com.ifi.kuirin.mvp.util.Logger;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2FrameLayout_2_Fragment extends BaseFragment implements IF2FrameLayout_2_Contract.View {

    public static final String TAG = F2FrameLayout_2_Fragment.class.getSimpleName();
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

    private F2FrameLayout_2_Presenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_framelayout_2_threeitems_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {

        mLiveEventPresenter = F2FrameLayout_2_Presenter.getInstance();
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
        AlertDialogFragment alertDialogFragment = AlertDialogFragment
                .getInstance("aaa", "bbbb")
                .setOnClickListener(new AlertDialogFragment.AleartDiaglogOnClickListener() {
                    @Override
                    public void onClickNeutralButton() {
                        mLiveEventPresenter.startCamera();
                    }
                });
        CustomFragmentManager
                .build((AppCompatActivity) getActivity())
                .addDialogFragment(alertDialogFragment, AlertDialogFragment.TAG);
    }

    @Override
    public void onEndOfTheMeal() {

    }

    @Override
    public void onDefecationBegins() {
        CustomFragmentManager.build((AppCompatActivity) getActivity())
                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout_2,
                        new F2DefecationBeginsFragment(), F2DefecationBeginsFragment.TAG);
    }

    @Override
    public void onGoingToBed() {

    }

    @Override
    public void onWakeup() {

    }

    @Override
    public void onStartCamera() {
        CameraDialogFragment cameraDialogFragment = new CameraDialogFragment()
                .setCameraListener(new CameraDialogFragment.CameraListener() {
            @Override
            public void onTakePhotoFinish() {
                Logger.d(TAG, "onTakePhotoFinish");
            }

            @Override
            public void onTakePhotoFailed() {
                Logger.d(TAG, "onTakePhotoFailed");
            }
        });
        CustomFragmentManager
                .build((AppCompatActivity) getActivity())
                .addDialogFragment(cameraDialogFragment, CameraDialogFragment.TAG);
    }
}
