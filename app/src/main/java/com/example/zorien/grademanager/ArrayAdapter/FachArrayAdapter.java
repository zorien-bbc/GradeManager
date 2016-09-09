package com.example.zorien.grademanager.arrayadapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.zorien.grademanager.R;
import com.example.zorien.grademanager.model.Fach;

import java.util.List;

/**
 * Created by zorien on 08.09.2016.
 */
public class FachArrayAdapter extends ArrayAdapter<Fach> {
    private List<Fach> items;
    private LayoutInflater inflater;

    public FachArrayAdapter(Context context, LayoutInflater inflater, List<com.example.zorien.grademanager.model.Fach> objects) {
        super(context, -1, objects);
        this.items = objects;
        this.inflater = inflater;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.fach_adapter, null);
        Fach actualFach = items.get(pos);
        ((TextView) convertView.findViewById(R.id.fachName)).setText(actualFach.getBezeichnung());
        ((TextView) convertView.findViewById(R.id.fachSchnitt)).setText("" + actualFach.getSchnitt());
        return convertView;
    }
}
