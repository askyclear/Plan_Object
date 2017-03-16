package com.example.daeseon.plan_object.core.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.daeseon.plan_object.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main_activity extends Activity {


    @BindView(R.id.txt_1)
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);
        ButterKnife.bind(this);
    }
}
