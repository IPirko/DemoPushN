package com.push.iprun.demopushnotification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView messageTextView = findViewById(R.id.messageTextView);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            messageTextView.setText(extras.getString("NotificationMessage"));
        }

    }
}
