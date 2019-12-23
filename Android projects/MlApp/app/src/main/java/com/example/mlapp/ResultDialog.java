package com.example.mlapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

class ResultDialog extends DialogFragment {
    private Button button;
    private TextView resultTv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment,container,false);
        String resultText="";
        button=view.findViewById(R.id.result_ok_button);
        resultTv=view.findViewById(R.id.result_text_view);
        Bundle bundle=getArguments();
        resultText=bundle.getString(LCOFaceDetection.Result_Text);
        resultTv.setText(resultText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        return view;
    }
}
