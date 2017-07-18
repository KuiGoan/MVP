package com.ifi.kuirin.mvp.f5_pain_level;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseActivity;
import com.ifi.kuirin.mvp.base.adapter.RecyclerViewAdapter;
import com.ifi.kuirin.mvp.base.model.RecyclerModel;
import com.ifi.kuirin.mvp.f5_pain_level.f5_pain_level_selection.F5PainLevelSelectionActivity;
import com.ifi.kuirin.mvp.util.Logger;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F5PainLevelActivity extends BaseActivity implements IF5PainLevelContract.View {

    public static final String TAG = F5PainLevelActivity.class.getSimpleName();
    @BindView(R.id.f5_pain_level_title)
    TextView mF5PainLevelTitle;
    @BindView(R.id.f5_pain_level_recyclerview)
    RecyclerView mF5Recyclerview;

    private List<RecyclerModel> mData = new ArrayList<>();
    private RecyclerViewAdapter mAdapter;

    private F5PainLevelPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f5_pain_level_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state) {
        mLiveEventPresenter = F5PainLevelPresenter.getInstance();
        mLiveEventPresenter.attach(this);
        mLiveEventPresenter.loadData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLiveEventPresenter.detach();
    }

    @Override
    public void onLoadData() {
        mAdapter = new RecyclerViewAdapter(mData, R.layout.base_rectangle_view_horizontal);
        mAdapter.setListener(new RecyclerViewAdapter.RecyclerViewListener() {
            @Override
            public void setOnItemClick(View view, int position) {
                mLiveEventPresenter.painLevelItemSelect(position);
            }
        });
        mF5Recyclerview.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mF5Recyclerview.setItemAnimator(new DefaultItemAnimator());
        mF5Recyclerview.setHasFixedSize(true);
        mF5Recyclerview.setAdapter(mAdapter);

        mData.add(new RecyclerModel(getString(R.string.f5_pain_level_item_1),
                R.mipmap.ic_launcher_round));
        mData.add(new RecyclerModel(getString(R.string.f5_pain_level_item_2),
                R.mipmap.ic_launcher_round));
        mData.add(new RecyclerModel(getString(R.string.f5_pain_level_item_3),
                R.mipmap.ic_launcher_round));
        mData.add(new RecyclerModel(getString(R.string.f5_pain_level_item_4),
                R.mipmap.ic_launcher_round));
        mData.add(new RecyclerModel(getString(R.string.f5_pain_level_item_5),
                R.mipmap.ic_launcher_round));
        mData.add(new RecyclerModel(getString(R.string.f5_pain_level_item_6),
                R.mipmap.ic_launcher_round));

        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onPainLevelItemSelected(int position) {
        Logger.d(TAG, "onPainLevelItemSelected()# pos = " + position);
//        CustomFragmentManager.build(this).clearBackStack();
        Intent intent = new Intent(this, F5PainLevelSelectionActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
