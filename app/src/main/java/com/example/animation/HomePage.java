package com.example.animation;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;

public class HomePage extends AppCompatActivity {
    ImageView profile_Image;
    TextView profile_Name, Email;
    Button signOut;
    int radius = getApplicationContext().getResources().getDimensionPixelSize(R.dimen.corner_radius);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        /*
        profile_Image = findViewById(R.id.profileImage);
        profile_Name = findViewById(R.id.profileName);
        Email = findViewById(R.id.emailAddress);   */

        signOut = findViewById(R.id.actionBtnLogout);
        signOut.setOnClickListener(v -> {
            FirebaseAuth.getInstance().signOut();
            finish();
        });
        /*
        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            String personName = acct.getDisplayName();
            String personEmail = acct.getEmail();
            Uri personPhoto = acct.getPhotoUrl();
            Glide.with(this)
                    .load(String.valueOf(personPhoto))
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .into(profile_Image);
            profile_Name.setText(personName);
            Email.setText(personEmail);   */
        }
    }

