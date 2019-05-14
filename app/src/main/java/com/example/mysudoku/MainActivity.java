package com.example.mysudoku;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button myexitbutton;
    TextView SuDoKu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myexitbutton = findViewById(R.id.myexitbutton);
        myexitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        SuDoKu = findViewById(R.id.SuDoKu);
        String text = "<font color=#0019ff>G</font><font color=#f3ec19>o</font><font color=#98fffc>o</font><font color=#0e698b>d</font> <font color=#ff0001>L</font><font color=#544d75>u</font><font color=#2af4cd>c</font><font color=#f1e5bc>k</font>";
        SuDoKu.setText(Html.fromHtml(text));
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.activity_main);
    }
}
