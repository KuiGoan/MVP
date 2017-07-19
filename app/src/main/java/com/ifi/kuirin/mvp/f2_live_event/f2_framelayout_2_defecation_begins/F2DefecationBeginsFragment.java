package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2_defecation_begins;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.base.adapter.RecyclerViewAdapter;
import com.ifi.kuirin.mvp.base.model.RecyclerModel;
import com.ifi.kuirin.mvp.base.view.RectangleView;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2.F2FrameLayout_2_Fragment;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;
import com.ifi.kuirin.mvp.util.Logger;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2DefecationBeginsFragment extends BaseFragment implements IF2DefecationBeginsContract.View {

    public static final String TAG = F2DefecationBeginsFragment.class.getSimpleName();
    @BindView(R.id.f2_defecation_title_text)
    TextView f2DefecationTitleText;
    @BindView(R.id.f2_framelayout_defecatopn_1)
    RectangleView mF2FramelayoutDefecatopn1;
    @BindView(R.id.f2_framelayout_defecatopn_2)
    RectangleView mF2FramelayoutDefecatopn2;
    @BindView(R.id.f2_framelayout_defecatopn_3)
    RectangleView mF2FramelayoutDefecatopn3;
    @BindView(R.id.f2_framelayout_defecatopn_4)
    RectangleView mF2FramelayoutDefecatopn4;
    @BindView(R.id.f2_framelayout_defecatopn_5)
    RectangleView mF2FramelayoutDefecatopn5;
    @BindView(R.id.f2_framelayout_defecatopn_6)
    RectangleView mF2FramelayoutDefecatopn6;
    @BindView(R.id.f2_framelayout_defecatopn_7)
    RectangleView mF2FramelayoutDefecatopn7;
    @BindView(R.id.f2_framelayout_defecatopn_8)
    RectangleView mF2FramelayoutDefecatopn8;
    @BindView(R.id.f2_framelayout_eightitems)
    LinearLayout mF2FramelayoutEightitems;

    private List<RecyclerModel> mData = new ArrayList<>();
    private RecyclerViewAdapter mAdapter;

    private F2DefecationBeginsPresenter mDefecationBeginsPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_framelayout_2_eightitems_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mDefecationBeginsPresenter = F2DefecationBeginsPresenter.getInstance();
        mDefecationBeginsPresenter.attach(this);

//        mDefecationBeginsPresenter.loadData();
    }


    @OnClick({R.id.f2_framelayout_defecatopn_1, R.id.f2_framelayout_defecatopn_2, R.id.f2_framelayout_defecatopn_3, R.id.f2_framelayout_defecatopn_4, R.id.f2_framelayout_defecatopn_5, R.id.f2_framelayout_defecatopn_6, R.id.f2_framelayout_defecatopn_7, R.id.f2_framelayout_defecatopn_8})
    public void onViewClicked(View view) {
        Logger.d(TAG, "onViewClicked()# id = " + view.getId());
        int position = -1;
        switch (view.getId()) {
            case R.id.f2_framelayout_defecatopn_1:
                position = 1;
                break;
            case R.id.f2_framelayout_defecatopn_2:
                position = 2;
                break;
            case R.id.f2_framelayout_defecatopn_3:
                position = 3;
                break;
            case R.id.f2_framelayout_defecatopn_4:
                position = 4;
                break;
            case R.id.f2_framelayout_defecatopn_5:
                position = 5;
                break;
            case R.id.f2_framelayout_defecatopn_6:
                position = 6;
                break;
            case R.id.f2_framelayout_defecatopn_7:
                position = 7;
                break;
            case R.id.f2_framelayout_defecatopn_8:
                position = 8;
                break;
            default:
                break;
        }
        if (position != -1) {
            mDefecationBeginsPresenter.clickItem(position);
        }
    }

    @Override
    public void onClickItem(int position) {
        CustomFragmentManager.build((AppCompatActivity) getActivity())
                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout_2,
                        new F2FrameLayout_2_Fragment(), F2FrameLayout_2_Fragment.TAG);
    }

//    @Override
//    public void onLoadData() {
//
//    }
}
