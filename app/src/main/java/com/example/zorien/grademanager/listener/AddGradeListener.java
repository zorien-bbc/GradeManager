package com.example.zorien.grademanager.listener;

import android.view.View;
import android.widget.Toast;

import com.example.zorien.grademanager.activity.GradeDialogFragment;

/**
 * Created by nilso on 11.09.2016.
 */
public class AddGradeListener implements View.OnClickListener {
    private GradeDialogFragment gradeDialogFragment;

    public AddGradeListener(GradeDialogFragment gradeDialogFragment) {
        this.gradeDialogFragment = gradeDialogFragment;
    }

    @Override
    public void onClick(View v) {
        if (gradeDialogFragment.getSpinner().getSelectedItem().toString().equals("Fach wählen")) {
            Toast.makeText(v.getContext(), "Wählen Sie bitte ein Fach aus", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(v.getContext(), "Grade: " + gradeDialogFragment.getSeekArcText().getText() + " Fach: " + gradeDialogFragment.getSpinner().getSelectedItem().toString() + " Gewichtung: " + gradeDialogFragment.getSeekArcTextW().getText(), Toast.LENGTH_SHORT).show();
            gradeDialogFragment.dismiss();
        }
    }
}
