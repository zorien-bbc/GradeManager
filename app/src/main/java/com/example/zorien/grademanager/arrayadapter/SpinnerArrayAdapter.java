package com.example.zorien.grademanager.arrayadapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nilso on 10.09.2016.
 */
public class SpinnerArrayAdapter extends ArrayAdapter<String> {
    public SpinnerArrayAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        View v = null;

        if (position == 0) {
            TextView tv = new TextView(getContext());
            tv.setHeight(0);
            tv.setVisibility(View.GONE);
            v = tv;
        } else {

            v = super.getDropDownView(position, null, parent);
        }

        return v;
    }
}

