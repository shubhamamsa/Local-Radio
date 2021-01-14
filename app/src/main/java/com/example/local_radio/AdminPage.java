package com.example.local_radio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminPage extends AppCompatActivity {

    Button btn_home_design;
    Button btn_user_registration;
    Button btn_user_home_page;
    Button btn_user_profile;
    Button btn_music_player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);

        btn_home_design = (Button) findViewById(R.id.home_design);
        btn_user_registration = (Button) findViewById(R.id.user_registration);
        btn_user_home_page = (Button) findViewById(R.id.user_home_page);
        btn_user_profile = (Button) findViewById(R.id.user_profile);
        btn_music_player = (Button) findViewById(R.id.music_player);

/*------- Home Design Button --------*/

//        btn_home_design.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent activity_home_design = new Intent(AdminPage.this, HomeDesign.class);
//                startActivity(activity_home_design);
//            }
//        });

/*------- User Registration Button --------*/

//        btn_user_registration.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent activity_user_registration = new Intent(AdminPage.this, UserRegistration.class);
//                startActivity(activity_user_registration);
//            }
//        });

/*------- User Home Page Button --------*/

//        btn_user_home_page.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent activity_home_page = new Intent(AdminPage.this, HomePage.class);
//                startActivity(activity_home_page);
//            }
//        });

/*------- User Profile Button --------*/

//        btn_user_profile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent activity_user_profile = new Intent(AdminPage.this, UserProfile.class);
//                startActivity(activity_user_profile);
//            }
//        });

/*------- Music Player Button --------*/

//        btn_music_player.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent activity_music_player = new Intent(AdminPage.this, MusicPlayer.class);
//                startActivity(activity_music_player);
//            }
//        });

    }
}