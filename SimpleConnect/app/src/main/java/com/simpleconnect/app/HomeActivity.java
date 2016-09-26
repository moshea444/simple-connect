package com.simpleconnect.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toast.makeText(this, "HELLO!", Toast.LENGTH_SHORT).show();

        Button bEvent = (Button)findViewById(R.id.b_events);
        bEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eventsIntent = new Intent(getApplicationContext(), EventsActivity.class);
                startActivity(eventsIntent);
            }
        });

    }
}
