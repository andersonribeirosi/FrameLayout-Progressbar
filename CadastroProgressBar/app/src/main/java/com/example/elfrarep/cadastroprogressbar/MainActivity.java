package com.example.elfrarep.cadastroprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarFormulario(View view){
        FrameLayout fl = (FrameLayout) findViewById(R.id.fl);

        fl.setVisibility(View.VISIBLE);
    }
}
