package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2_test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.base.adapter.RecyclerViewAdapter;
import com.ifi.kuirin.mvp.base.model.RecyclerModel;
import com.ifi.kuirin.mvp.util.Logger;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2DefecationBeginsFragment extends BaseFragment implements IF2DefecationBeginsContract.View{

    public static final String TAG = F2DefecationBeginsFragment.class.getSimpleName();
    @BindView(R.id.f2_defecation_title_text)
    TextView mTitleText;
    @BindView(R.id.f2_defecation_recycler)
    RecyclerView mRecyclerView;

    private List<RecyclerModel> mData = new ArrayList<>();
    private RecyclerViewAdapter mAdapter;

    private F2DefecationBeginsPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_framelayout_test;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mLiveEventPresenter = F2DefecationBeginsPresenter.getInstance();
        mLiveEventPresenter.attach(this);

        mLiveEventPresenter.loadData();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mLiveEventPresenter.detach();
    }

    @Override
    public void onLoadData() {
        mAdapter = new RecyclerViewAdapter(mData, R.layout.base_rectangle_view_vertical);
        mAdapter.setListener(new RecyclerViewAdapter.RecyclerViewListener() {
            @Override
            public void setOnItemClick(View view, int position) {
                mLiveEventPresenter.itemPresedenceSelect(position);
            }
        });
        //set 4 column
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));

        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);

        //set data
        mData.add(new RecyclerModel(getString(R.string.f2_defecation_item_1),
                    R.mipmap.ic_launcher));
        mData.add(new RecyclerModel(getString(R.string.f2_defecation_item_2),
                R.mipmap.ic_launcher));
        mData.add(new RecyclerModel(getString(R.string.f2_defecation_item_3),
                R.mipmap.ic_launcher));
        mData.add(new RecyclerModel(getString(R.string.f2_defecation_item_4),
                R.mipmap.ic_launcher));
        mData.add(new RecyclerModel(getString(R.string.f2_defecation_item_5),
                R.mipmap.ic_launcher));
        mData.add(new RecyclerModel(getString(R.string.f2_defecation_item_6),
                R.mipmap.ic_launcher));
        mData.add(new RecyclerModel(getString(R.string.f2_defecation_item_7),
                R.mipmap.ic_launcher));
        mData.add(new RecyclerModel(getString(R.string.f2_defecation_item_8),
                R.mipmap.ic_launcher));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemPresedenceSelected(int position) {
        Logger.d(TAG, "onItemPresedenceSelected()#position = " + position);
    }
}
