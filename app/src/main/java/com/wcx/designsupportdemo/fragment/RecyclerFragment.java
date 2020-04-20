package com.wcx.designsupportdemo.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wcx.designsupportdemo.R;
import com.wcx.designsupportdemo.adapter.RecyclerViewAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerFragment extends Fragment {


    private RecyclerView mRecyclerView;
    public RecyclerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRecyclerView= (RecyclerView) inflater.inflate(R.layout.fragment_recycler, container, false);
        return mRecyclerView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext() ));
        mRecyclerView.setAdapter(new RecyclerViewAdapter(getActivity()));
    }
}
