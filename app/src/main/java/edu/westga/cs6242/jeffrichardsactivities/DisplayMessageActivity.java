package edu.westga.cs6242.jeffrichardsactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    public final static String FIRST_MESSAGE = "edu.westga.cs6242.jeffrichardsactivities.FIRST_MESSAGE";
    public final static String SECOND_MESSAGE = "edu.westga.cs6242.jeffrichardsactivities.SECOND_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
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
        TextView msgText = (TextView)findViewById(R.id.lblInitialMessage);
        msgText.setText(getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE));
    }

    public void onNext(View view) {
        Intent intent = new Intent(this, DisplayTwoMessagesActivity.class);
        TextView firstMessage = (TextView) findViewById(R.id.lblInitialMessage);
        String message1 = firstMessage.getText().toString();
        intent.putExtra(FIRST_MESSAGE, message1);
        EditText editText = (EditText) findViewById(R.id.txtSecondMessage);
        String message = editText.getText().toString();
        intent.putExtra(SECOND_MESSAGE, message);
        startActivity(intent);
    }
}
