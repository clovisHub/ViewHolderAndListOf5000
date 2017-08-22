package com.example.user.listviewwithviewholder;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

class TheAdapter extends ArrayAdapter<String>{
    List<String> myList;
    Context myContext;


    public TheAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<String> objects) {
        super(context, resource, objects);

        myList = objects;
        myContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder myVvHld = new ViewHolder();

        LayoutInflater adapInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

         convertView = adapInflater.inflate(R.layout.row_layout,parent,false);

        myVvHld.vhName = (TextView) convertView.findViewById(R.id.rowText);

        myVvHld.vhName.setText(myList.get(position));

        convertView.setTag(myVvHld);

        return convertView;
    }

    static class ViewHolder{
        TextView vhName;
    }


}
