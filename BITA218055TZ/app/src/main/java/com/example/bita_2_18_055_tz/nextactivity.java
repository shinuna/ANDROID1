package com.example.bita_2_18_055_tz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nextactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextactivity);

        Intent shinuna =getIntent();
        String km =shinuna.getStringExtra( name:"KM")
        String other =shinuna.getsString( name:"other");
        String measure = shinuna.getStringExtra(name:"spn");

     startActivity(shinuna);
        Button b2 =(Button) findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override


            public void  onClick(View view) {

                SharedPreferences share =getSharedPreference (name: "Mydata",MODE_PROVATE);
                String km = share.getString(key:"km",defValue:"");
                String other = share.getString(key:"other",defValue:"");
                String measure = share.getString(key:"spn",defValue:"");
            }


        }
    }
}
