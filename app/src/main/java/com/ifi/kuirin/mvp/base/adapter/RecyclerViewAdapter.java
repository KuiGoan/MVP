package com.ifi.kuirin.mvp.base.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;
import com.ifi.kuirin.mvp.base.model.RecyclerModel;

import java.util.List;

/**
 * Created by KuiRin on 7/17/2017 AD.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>{
    private List<RecyclerModel> mData;
    private int mLayoutId;
    private RecyclerViewListener mListener;

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        public TextView mTitle;
        public ImageView mImageView;

        public RecyclerViewHolder(View view) {
            super(view);
            mTitle = view.findViewById(R.id.rectangle_view_text);
            mImageView = view.findViewById(R.id.rectangle_view_small_icon);
        }
    }

//    public RecyclerViewAdapter(List<RecyclerModel> data) {
//        this.mData = data;
//    }

    public RecyclerViewAdapter(List<RecyclerModel> data, int layoutId) {
        this.mLayoutId = layoutId;
        this.mData = data;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(mLayoutId, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        RecyclerModel model = mData.get(position);
        holder.mTitle.setText(model.getTitle());
        holder.mImageView.setImageResource(model.getImageResourceId());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null) {
                    mListener.setOnItemClick(view, position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData != null ? mData.size() : 0;
    }

    public interface RecyclerViewListener{
        void setOnItemClick(View view, int position);
    }

    public void setListener(RecyclerViewListener listener) {
        this.mListener = listener;
    }
}
