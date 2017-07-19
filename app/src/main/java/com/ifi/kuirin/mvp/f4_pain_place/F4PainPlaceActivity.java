package com.ifi.kuirin.mvp.f4_pain_place;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseActivity;
import com.ifi.kuirin.mvp.f5_pain_level.F5PainLevelActivity;
import com.ifi.kuirin.mvp.util.Logger;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F4PainPlaceActivity extends BaseActivity implements IF4PainPlaceContract.View {

    public static final String TAG = F4PainPlaceActivity.class.getSimpleName();
    @BindView(R.id.f4_pain_level_title)
    TextView f4PainLevelTitle;
    @BindView(R.id.f4_pain_level_position_1)
    View mF4PainLevelPosition1;
    @BindView(R.id.f4_pain_level_position_2)
    View mF4PainLevelPosition2;
    @BindView(R.id.f4_pain_level_position_3)
    View mF4PainLevelPosition3;
    @BindView(R.id.f4_pain_level_position_4)
    View mF4PainLevelPosition4;
    @BindView(R.id.f4_pain_level_position_5)
    View mF4PainLevelPosition5;
    @BindView(R.id.f4_pain_level_position_6)
    View mF4PainLevelPosition6;
    @BindView(R.id.f4_pain_level_position_7)
    View mF4PainLevelPosition7;
    @BindView(R.id.f4_pain_level_position_8)
    View mF4PainLevelPosition8;
    @BindView(R.id.f4_pain_level_position_9)
    View mF4PainLevelPosition9;
    private F4PainPlacePresenter mF4PainPlacePresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f4_framelayout_pain_place;
    }

    @Override
    protected void init(@Nullable Bundle state) {
        Logger.d(TAG, "init()");
        mF4PainPlacePresenter = F4PainPlacePresenter.getInstance();
        mF4PainPlacePresenter.attach(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mF4PainPlacePresenter.detach();
    }

    @OnClick({R.id.f4_pain_level_position_1, R.id.f4_pain_level_position_2, R.id.f4_pain_level_position_3, R.id.f4_pain_level_position_4, R.id.f4_pain_level_position_5, R.id.f4_pain_level_position_6, R.id.f4_pain_level_position_7, R.id.f4_pain_level_position_8, R.id.f4_pain_level_position_9})
    public void onViewClicked(View view) {
        Logger.d(TAG, "onViewClicked#id = " + view.getId() );
        int position = -1;
        switch (view.getId()) {
            case R.id.f4_pain_level_position_1:
                position = 1;
                break;
            case R.id.f4_pain_level_position_2:
                position = 2;
                break;
            case R.id.f4_pain_level_position_3:
                position = 3;
                break;
            case R.id.f4_pain_level_position_4:
                position = 4;
                break;
            case R.id.f4_pain_level_position_5:
                position = 5;
                break;
            case R.id.f4_pain_level_position_6:
                position = 6;
                break;
            case R.id.f4_pain_level_position_7:
                position = 7;
                break;
            case R.id.f4_pain_level_position_8:
                position = 8;
                break;
            case R.id.f4_pain_level_position_9:
                position = 9;
                break;
            default:
                break;
        }
        if (position != -1) {
            mF4PainPlacePresenter.positionPress(position);
        }
    }

    @Override
    public void onPositionPressed(int position) {
        Intent intent = new Intent(this, F5PainLevelActivity.class);
        startActivity(intent);
    }
}
