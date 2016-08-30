package com.example.innovate.switchscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

public class FirstScreenActivity extends AppCompatActivity {
    EditText inputname;
    EditText inputemail;
    Button btnNextScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);
        final EditText inputname = (EditText) findViewById(R.id.name);
        final EditText inputemail = (EditText) findViewById(R.id.email);
        Button btnNextScreen = (Button) findViewById(R.id.btnNextScreen);

        btnNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextScreen = new Intent(getApplicationContext(), SecondScreenActivity.class);

                //Sending data to another Activity
                nextScreen.putExtra("name", inputname.getText().toString());
                nextScreen.putExtra("email", inputemail.getText().toString());

                Log.e("n", inputname.getText()+"."+ inputemail.getText());

                startActivity(nextScreen);

            }
        });




    }
}
