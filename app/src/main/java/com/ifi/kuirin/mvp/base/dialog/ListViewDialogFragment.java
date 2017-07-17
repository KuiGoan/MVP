package com.ifi.kuirin.mvp.base.dialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ddquy on 7/17/2017.
 */

public class ListViewDialogFragment extends DialogFragment {
    public static final String TAG = ListViewDialogFragment.class.getSimpleName();

    private static final String KEY_TITLE = "title";

    private static ListViewDialogFragment sInstance;

    private AdapterView.OnItemClickListener mListener;

    private ArrayAdapter<String> mAdapter;

    private ListView mListView;

    private ArrayList<String> mData;

    private String mTitle;

    public static ListViewDialogFragment getInstance(String title) {
        if (sInstance == null) {
            sInstance = new ListViewDialogFragment();
        }
        Bundle args = new Bundle();
        args.putString(KEY_TITLE, title);
        sInstance.setArguments(args);
        return sInstance;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return new ListView(getContext());
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTitle = getArguments().getString(KEY_TITLE);
        if (mTitle != null) {
            getDialog().setTitle(mTitle);
        } else {
            getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        }

        mAdapter = new ArrayAdapter<>
                (getContext(), android.R.layout.simple_list_item_1, mData);
        mListView = (ListView) view;
        mListView.setDivider(null);
        mListView.setDividerHeight(0);

        mListView.setAdapter(mAdapter);

        if (mListener != null) {
            mListView.setOnItemClickListener(mListener);
        }
    }

    public AdapterView.OnItemClickListener getListener() {
        return mListener;
    }

    public ListViewDialogFragment setListener(AdapterView.OnItemClickListener mListener) {
        this.mListener = mListener;
        return this;
    }

    public ListViewDialogFragment setData(ArrayList<String> data) {
        this.mData = data;
        if (mAdapter != null) {
            mAdapter.notifyDataSetChanged();
        }
        return this;
    }

    public ListViewDialogFragment setTitle(String mTitle) {
        this.mTitle = mTitle;
        return this;
    }
}
