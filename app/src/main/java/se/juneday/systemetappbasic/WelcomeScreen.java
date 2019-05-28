package se.juneday.systemetappbasic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);


        ImageView firstimage = (ImageView) findViewById(R.id.secondimage);
        int ImageResources = getResources().getIdentifier("drawable/systemmiljo", null, this.getPackageName());
        firstimage.setImageResource(ImageResources);




}}
