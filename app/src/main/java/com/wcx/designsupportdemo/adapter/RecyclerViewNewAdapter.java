package com.wcx.designsupportdemo.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * @author 王彩霞
 * @data 2018/8/26
 * @describe
 */
public class RecyclerViewNewAdapter extends BaseQuickAdapter<String,BaseViewHolder> {
    public RecyclerViewNewAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

    }
}
