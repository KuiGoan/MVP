package com.ifi.kuirin.mvp.f5_pain_level.f5_framelayout_1_pain_level_selected;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.f2_live_event.LiveEventActivity;
import com.ifi.kuirin.mvp.util.Logger;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F5FrameLayoutPainLevelSelectedFragment extends BaseFragment implements IF5FrameLayoutPainLevelSelectedContract.View {

    public static final String TAG = F5FrameLayoutPainLevelSelectedFragment.class.getSimpleName();
    @BindView(R.id.f5_pain_level_selected_title)
    TextView mF5PainLevelSelectedTitle;
    @BindView(R.id.f5_pain_level_selected_desc)
    TextView mF5PainLevelSelectedDesc;
    @BindView(R.id.f5_pain_level_selected_image)
    ImageView mF5PainLevelSelectedImage;
    @BindView(R.id.f5_pain_level_selected_status)
    TextView mF5PainLevelSelectedStatus;
    @BindView(R.id.f5_pain_level_delete_btn)
    Button mF5PainLevelDeleteBtn;

    private F5FrameLayoutPainLevelSelectedPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f5_framelayout_1_pain_level_selected_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mLiveEventPresenter = F5FrameLayoutPainLevelSelectedPresenter.getInstance();
        mLiveEventPresenter.attach(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mLiveEventPresenter.detach();
    }

    @OnClick({R.id.f5_pain_level_selected_image, R.id.f5_pain_level_delete_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.f5_pain_level_selected_image:
                mLiveEventPresenter.emojiPressed();
                break;
            case R.id.f5_pain_level_delete_btn:
                mLiveEventPresenter.deleteBtnPressed();
                break;
        }
    }

    @Override
    public void onEmojiPressed() {
        getActivity().finish();
    }

    @Override
    public void onDeleteBtnPressed() {
        Logger.d(TAG, "onDeleteBtnPressed()");
        Intent intent = new Intent(getContext(), LiveEventActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
