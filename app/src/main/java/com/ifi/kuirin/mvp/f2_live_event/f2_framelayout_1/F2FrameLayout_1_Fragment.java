package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.BaseFragment;
import com.ifi.kuirin.mvp.base.dialog.ListViewDialogFragment;
import com.ifi.kuirin.mvp.f5_pain_level.F5PainLevelActivity;
import com.ifi.kuirin.mvp.f5_pain_level.F5PainLevelFragment;
import com.ifi.kuirin.mvp.util.CustomFragmentManager;
import com.ifi.kuirin.mvp.util.Logger;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2FrameLayout_1_Fragment extends BaseFragment implements IF2FrameLayout_1_Contract.View {

    public static final String TAG = F2FrameLayout_1_Fragment.class.getSimpleName();
    @BindView(R.id.f2_symptom_occurrence_text)
    TextView mF2SymptomOccurrenceText;
    @BindView(R.id.f2_symptom_occurrence_btn)
    RelativeLayout mF2SymptomOccurrenceBtn;

    private ListViewDialogFragment mListViewDialogFragment;

    private F2FrameLayout_1_Presenter mLiveEventPresenter;

    @Override
    protected int getContentResource() {
        return R.layout.f2_framelayout_1_normal_fragment;
    }

    @Override
    protected void init(@Nullable Bundle state, View view) {
        mLiveEventPresenter = F2FrameLayout_1_Presenter.getInstance();
        mLiveEventPresenter.attach(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mLiveEventPresenter.detach();
    }

    @Override
    public void onSymptomOccurrence() {
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            data.add("Item " + i);
        }

        mListViewDialogFragment = ListViewDialogFragment
                .getInstance(getString(R.string.f3_symptom_selection)).setData(data)
                .setListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        mLiveEventPresenter.itemSymptonSelect(i);
//                        mListViewDialogFragment.dismiss();
                    }
                });
        //Set Style DialogFragment. That will set show mTitle bar dialog fragment
        mListViewDialogFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.ListViewDialogFragment);
        CustomFragmentManager
                .build((AppCompatActivity) getActivity())
                .addDialogFragment(mListViewDialogFragment, ListViewDialogFragment.TAG);
    }

    @OnClick(R.id.f2_symptom_occurrence_btn)
    public void onViewClicked() {
        mLiveEventPresenter.symptomOccurrence();
    }

    @Override
    public void onSymptonSelected(int position) {
        Logger.d(TAG, "onSymptonSelected()# position = " + position);
        switch (position) {
            case 0:
            case 1:
                break;
            case 2:
            case 3:
            case 4:
//                CustomFragmentManager
//                        .build((AppCompatActivity) getActivity())
//                        .replaceFragment(R.id.home_framelayout,
//                                new F5PainLevelFragment(), F5PainLevelFragment.TAG);
                Intent intent = new Intent(getActivity(), F5PainLevelActivity.class);
                getActivity().startActivity(intent);
                break;
            default:
                break;
        }
    }


}
