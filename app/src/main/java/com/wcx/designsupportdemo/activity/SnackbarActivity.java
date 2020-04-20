package com.wcx.designsupportdemo.activity;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.wcx.designsupportdemo.R;

public class SnackbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);

        Button btn_sb=findViewById(R.id.btn_sb);
        btn_sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Here's a Snackbar!",Snackbar.LENGTH_LONG)
                        .setAction("Acfion",null)
                        .show();
            }
        });
    }
}
