package edu.westga.cs6242.jeffrichardsactivities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DisplayTwoMessagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_two_messages);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        TextView msg1Text = (TextView)findViewById(R.id.lblFirstMessage);
        msg1Text.setText(getIntent().getStringExtra(DisplayMessageActivity.FIRST_MESSAGE));
        TextView msg2Text = (TextView)findViewById(R.id.lblSecondMessage);
        msg2Text.setText(getIntent().getStringExtra(DisplayMessageActivity.SECOND_MESSAGE));
    }

}
