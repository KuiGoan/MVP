package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2_defecation_begins;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.base.RecyclerViewAdapter;
import com.ifi.kuirin.mvp.base.model.RecyclerModel;
import com.ifi.kuirin.mvp.base.view.RectangleView;
import com.ifi.kuirin.mvp.util.Logger;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

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
    Unbinder unbinder;

    private List<RecyclerModel> mData = new ArrayList<>();
    private RecyclerViewAdapter mAdapter;

    private F2DefecationBeginsPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_framelayout_2_eightitems_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mLiveEventPresenter = F2DefecationBeginsPresenter.getInstance();
        mLiveEventPresenter.attach(this);

//        mLiveEventPresenter.loadData();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mLiveEventPresenter.detach();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.f2_framelayout_defecatopn_1, R.id.f2_framelayout_defecatopn_2, R.id.f2_framelayout_defecatopn_3, R.id.f2_framelayout_defecatopn_4, R.id.f2_framelayout_defecatopn_5, R.id.f2_framelayout_defecatopn_6, R.id.f2_framelayout_defecatopn_7, R.id.f2_framelayout_defecatopn_8})
    public void onViewClicked(View view) {
        Logger.d(TAG, "onViewClicked()# id = " + view.getId());
        switch (view.getId()) {
            case R.id.f2_framelayout_defecatopn_1:
                break;
            case R.id.f2_framelayout_defecatopn_2:
                break;
            case R.id.f2_framelayout_defecatopn_3:
                break;
            case R.id.f2_framelayout_defecatopn_4:
                break;
            case R.id.f2_framelayout_defecatopn_5:
                break;
            case R.id.f2_framelayout_defecatopn_6:
                break;
            case R.id.f2_framelayout_defecatopn_7:
                break;
            case R.id.f2_framelayout_defecatopn_8:
                break;
            default:
                break;
        }
    }

//    @Override
//    public void onLoadData() {
//
//    }
}
