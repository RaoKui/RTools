package com.raokui.rtools.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RaoKui on 2017/8/13.
 */

public abstract class BaseRecyclerViewAdapter<T, H extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<H> {

    private Context mContext;

    private List<T> mDataList = new ArrayList<>();

    public  void setData(List<T> dataList) {
      this.mDataList = dataList;
        notifyDataSetChanged();
    }

    public List<T> getData() {
        return mDataList;
    }

    public BaseRecyclerViewAdapter(Context context) {
        mContext = context;
    }

    @Override
    public H onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(getLayoutId(), parent, false);
        H mHolder = getViewHolder(view);
        return mHolder;
    }

    @Override
    public void onBindViewHolder(H holder, int position) {
        T data = mDataList.get(position);
        setBindViewHolder(holder,data, position);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    protected abstract H getViewHolder(View view);

    protected abstract int getLayoutId();

    protected abstract void setBindViewHolder(H holder, T data, int position);


}
