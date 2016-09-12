package com.example.zorien.grademanager.listener;

import android.widget.TextView;

import com.triggertrap.seekarc.SeekArc;

import java.util.List;

/**
 * Created by nilso on 12.09.2016.
 */
public class SeekArcListener implements SeekArc.OnSeekArcChangeListener {
    private TextView textView;
    private List<String> list;

    public SeekArcListener(TextView textView, List<String> list) {
        this.textView = textView;
        this.list = list;
    }

    @Override
    public void onProgressChanged(SeekArc seekArc, int i, boolean b) {
        textView.setText(String.valueOf(list.get(i)));
    }

    @Override
    public void onStartTrackingTouch(SeekArc seekArc) {

    }

    @Override
    public void onStopTrackingTouch(SeekArc seekArc) {

    }
}
