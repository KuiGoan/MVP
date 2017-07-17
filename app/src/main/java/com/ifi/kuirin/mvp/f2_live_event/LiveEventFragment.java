package com.ifi.kuirin.mvp.f2_live_event;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.base.dialog.ListViewDialogFragment;
import com.ifi.kuirin.mvp.f2_live_event.f2_framelayout.F2FrameLayoutFragment;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;
import com.ifi.kuirin.mvp.util.Logger;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class LiveEventFragment extends BaseFragment implements ILiveEventContract.View {

    public static final String TAG = LiveEventFragment.class.getSimpleName();
    @BindView(R.id.f2_symptom_occurrence_text)
    TextView mF2SymptomOccurrenceText;
    @BindView(R.id.f2_symptom_occurrence_btn)
    RelativeLayout mF2SymptomOccurrenceBtn;
    @BindView(R.id.f2_live_event_framelayout)
    FrameLayout mF2LiveEventFramelayout;

    private LiveEventPresenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_live_event_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        Logger.d(TAG, "init()");
        mLiveEventPresenter = LiveEventPresenter.getInstance();
        mLiveEventPresenter.attach(this);

        CustomFragmentManager.build((AppCompatActivity) getActivity())
                .replaceFragmentNonAddStack(R.id.f2_live_event_framelayout, new F2FrameLayoutFragment(), F2FrameLayoutFragment.TAG);
    }

    @OnClick(R.id.f2_symptom_occurrence_btn)
    public void onViewClicked() {
        mLiveEventPresenter.symptomOccurrence();
    }

    @Override
    public void onSymptomOccurrence() {
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            data.add("Item " + i);
        }

        ListViewDialogFragment listViewDialogFragment = ListViewDialogFragment
                .getInstance(getString(R.string.f3_symptom_selection)).setData(data)
                .setListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        mLiveEventPresenter.itemSymptonSelect(i);
                    }
                });
        CustomFragmentManager
                .build((AppCompatActivity) getActivity())
                .addDialogFragment(listViewDialogFragment, ListViewDialogFragment.TAG);
    }

    @Override
    public void onSymptonSelected(int position) {
        Logger.d(TAG, "onSymptonSelected()# position = " + position);
        switch (position) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mLiveEventPresenter.detach();
    }
}
