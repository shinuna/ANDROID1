package com.example.bita_2_18_055_tz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2, tv3;
    EditText ed1, ed2;
    Button btn;
    Spinner spn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.Id.text01);
        tv2 = (TextView) findViewById(R.Id.text02);
        tv3 = (TextView) findViewById(R.Id.text03);
        ed1 = (EditText) findViewById(R.Id.edit01);
        ed2 = (EditText) findViewById(R.Id.edit02);
        btn = (Button) findViewById(R.Id.btn1);
        spn = (Spinner) findViewById(R.Id.spin);
        String[]measure={"km_mile", "km_cm","km_m"};
        ArrayAdapter<String> Adapter =new ArrayAdapter<String>( context: this,android.R.layout.simple_spinner_dropdown_item,measure);
        spn.setAdapter(adapter) ;



btn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        SharedPreferences share = getSharedPreferences( name: "filedata", MODE_PRIVATE);


        SharedPreferences.Editor EDT1  = share.edit();
        EDT1.putString( S: "KM",ed1.getText().toString());
        EDT1.putString( S: "OTHER",ed2.getText().toString());
        EDT1.putString( S: "measure",spn);
        EDT1.commit();


        Intent shinuna = new Intent(this, Activity.class);
        String km =ed1.getText().toString();
        String other =ed2.getText().toString();

        Toast.makeText(this,"login succsefull...welcom ", Toast.LENGTH_LONG).show();
        sanha.putExtra("username",name);
        sanha.putExtra("password",pass);

        startActivity(sanha);

        }
        }