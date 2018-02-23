package com.example.mounikapathuri.customlist82;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mounikapathuri on 23-02-2018.
 */

public class CustomAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Data> mList;
    LayoutInflater mInflater;

    public CustomAdapter(Context context, ArrayList<Data> list) {
        mContext = context;
        mList = list;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = mInflater.inflate(R.layout.name_number, viewGroup, false);

        TextView textView = (TextView) view.findViewById(R.id.Name);
        TextView textView2 = (TextView) view.findViewById(R.id.Number);

        textView.setText(mList.get(i).getName());
        textView2.setText(mList.get(i).getNumber());

        return view;
    }
}
