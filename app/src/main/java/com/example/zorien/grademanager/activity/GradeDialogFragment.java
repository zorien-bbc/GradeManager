package com.example.zorien.grademanager.activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

import com.example.zorien.grademanager.R;

/**
 * Created by zascho on 09.09.2016.
 */
public class GradeDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(R.layout.grade_dialog);
        // Create the AlertDialog object and return it
        return builder.create();
    }
}
