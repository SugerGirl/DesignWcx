package com.wcx.designsupportdemo.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wcx.designsupportdemo.R;
import com.wcx.designsupportdemo.activity.DouBanTopActivity;


/**
 * @author 王彩霞
 * @data 2018/8/26
 * @describe
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;

    public RecyclerViewAdapter(Context context){
        this.mContext=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final View view=holder.mView;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(mContext,"这里是测试代码",Toast.LENGTH_SHORT).show();
                mContext.startActivity(new Intent(mContext, DouBanTopActivity.class));
//                mContext.startActivity(new Intent(mContext, DetailsActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public final View mView;
        public ViewHolder(View itemView) {
            super(itemView);
            mView=itemView;
        }
    }
}
