package se.juneday.systemetappbasic;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstScreen extends AppCompatActivity {

    private static final String TAG = "My Activity ";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);

        ImageView firstimage = (ImageView) findViewById(R.id.firstimage);
        int ImageResources = getResources().getIdentifier("drawable/system2", null, this.getPackageName());
        firstimage.setImageResource(ImageResources);

        Button Gmainpage = (Button) findViewById(R.id.gotomainpage);
        Gmainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "View " + v);
                Intent intent = new Intent(FirstScreen.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }

}