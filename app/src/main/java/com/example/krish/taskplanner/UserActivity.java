package com.example.krish.taskplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.login.LoginManager;


/**
 * Created by Krish on 16/04/2017.
 */

public class UserActivity extends AppCompatActivity{

    private TextView txtvinfo;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity);

        txtvinfo = (TextView)findViewById(R.id.txtvInfo);
        txtvinfo.setText("User has logged in");

        btnLogout = (Button)findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                //logout the user
                LoginManager.getInstance().logOut();

                Intent intent = new Intent(UserActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | intent.FLAG_ACTIVITY_CLEAR_TASK | intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });
    }

}
