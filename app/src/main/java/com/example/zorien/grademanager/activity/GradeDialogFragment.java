package com.example.zorien.grademanager.activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.zorien.grademanager.R;
import com.example.zorien.grademanager.arrayadapter.SpinnerArrayAdapter;
import com.example.zorien.grademanager.listener.AddGradeListener;
import com.example.zorien.grademanager.listener.SeekArcListener;
import com.triggertrap.seekarc.SeekArc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zascho on 09.09.2016.
 */
public class GradeDialogFragment extends DialogFragment {
    private SeekArc seekArc, seekArcW;
    private TextView seekArcText;
    private TextView seekArcTextW;
    private Spinner spinner;
    private Button addButton, addButton2;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        grades = fillGrades();
        weightings = fillWeightnings();
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.grade_dialog, null);
        TabHost tabHost = (TabHost) view.findViewById(R.id.gradeTabHost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("First Tab");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Second Tab");
        tab1.setIndicator("Grade");
        tab1.setContent(R.id.linearLayout);
        tab2.setIndicator("Weighting");
        tab2.setContent(R.id.linearLayout2);
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        addButton = (Button) view.findViewById(R.id.addButtonTab1);
        addButton2 = (Button) view.findViewById(R.id.addButtonTab2);
        addButton.setOnClickListener(new AddGradeListener(this));
        addButton2.setOnClickListener(new AddGradeListener(this));
        seekArc = (SeekArc) view.findViewById(R.id.seekArc);
        seekArcText = (TextView) view.findViewById(R.id.seekArcProgress);
        seekArcW = (SeekArc) view.findViewById(R.id.weightingArk);
        seekArcTextW = (TextView) view.findViewById(R.id.weightingProgress);
        spinner = (Spinner) view.findViewById(R.id.spinner2);
        String[] myResArray = getResources().getStringArray(R.array.planets_array);
        SpinnerArrayAdapter spinnerArrayAdapter = new SpinnerArrayAdapter(getActivity().getApplicationContext(), android.R.layout.simple_dropdown_item_1line, Arrays.asList(myResArray));
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(spinnerArrayAdapter);
        spinner.setSelection(0);
        seekArc.setOnSeekArcChangeListener(new SeekArcListener(seekArcText, grades));
        seekArcW.setOnSeekArcChangeListener(new SeekArcListener(seekArcTextW, weightings));
        builder.setView(view);
        return builder.create();
    }

    public List<String> fillGrades() {
        List<String> list = new ArrayList<>();
        for (int i = 10; i < 61; i += 1) {
            list.add(String.valueOf(i).substring(0, 1) + "." + String.valueOf(i).substring(1, 2));
            if (String.valueOf(i).substring(1, 2).equals("2") || String.valueOf(i).substring(1, 2).equals("7")) {
                list.add(String.valueOf(i).substring(0, 1) + "." + String.valueOf(i).substring(1, 2) + "5");
            }
        }
        return list;
    }


    public List<String> fillWeightnings() {
        List<String> list = new ArrayList<>();
        double[] values = {0.25, 0.5, 1.0, 1.5, 2.0};
        for (int i = 0; i < values.length; i++) {
            list.add(String.valueOf(values[i]) + "x");
        }
        return list;
    }

    public TextView getSeekArcText() {
        return seekArcText;
    }

    public Spinner getSpinner() {
        return spinner;
    }

    public void setSpinner(Spinner spinner) {
        this.spinner = spinner;
    }

    private List<String> grades, weightings;

    public TextView getSeekArcTextW() {
        return seekArcTextW;
    }
}
