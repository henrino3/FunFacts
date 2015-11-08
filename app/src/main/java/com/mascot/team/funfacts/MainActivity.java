package com.mascot.team.funfacts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Funbook mfactBook = new Funbook();
    private ColorWheel mcolorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare variables
        final TextView factlabel = (TextView) findViewById(R.id.factTextview);
        final Button showFactButton = (Button) findViewById(R.id.factButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fact =  mfactBook.getFact();
                int color = mcolorWheel.getColor();


                factlabel.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
    }


}
