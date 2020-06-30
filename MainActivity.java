package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText im1,im2,ans;
    Button zero,cc,one,two,three,four,five,six,seven,eight,nine,plus,minus,times,division,equal;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans = (EditText) findViewById(R.id.result);
        plus = (Button) findViewById(R.id.butplus);
        minus = (Button) findViewById(R.id.butsub);
        times = (Button) findViewById(R.id.butmul);
        division = (Button) findViewById(R.id.butdiv);
        seven = (Button) findViewById(R.id.but7);
        eight = (Button) findViewById(R.id.but8);
        nine = (Button) findViewById(R.id.but9);
        zero = (Button) findViewById(R.id.result);
        cc = (Button) findViewById(R.id.calc);
        one = (Button) findViewById(R.id.but1);
        two = (Button) findViewById(R.id.but2);
        three = (Button) findViewById(R.id.but3);
        four = (Button) findViewById(R.id.but4);
        five = (Button) findViewById(R.id.but5);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "1");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "9");

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "0");

            }
        });
        int jibu = 0;

        plus.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        int val1 = Integer.parseInt(ans.getText().toString());
                                        int val2 = Integer.parseInt(ans.getText().toString());
                                        int jibu = val1 + val2;
                                        ans.setText(Integer.toString(jibu));


                                    }

                                }

        );
        minus.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         int val1 = Integer.parseInt(ans.getText().toString());
                                         int val2 = Integer.parseInt(ans.getText().toString());
                                         int jibu = val1 - val2;
                                         ans.setText(Integer.toString(jibu));
                                     }
                                 }
        );
        times.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         int val1 = Integer.parseInt(ans.getText().toString());
                                         int val2 = Integer.parseInt(ans.getText().toString());
                                         int jibu = val1 * val2;
                                         ans.setText(Integer.toString(jibu));
                                     }
                                 }
        );

        division.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            int val1 = Integer.parseInt(ans.getText().toString());
                                            int val2 = Integer.parseInt(ans.getText().toString());
                                            int jibu = val1 / val2;
                                            ans.setText(Integer.toString(jibu));
                                        }



                                    }
        );
        cc.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {

                                      int val1 = Integer.parseInt(ans.getText().toString());
                                      int val2 = Integer.parseInt(ans.getText().toString());
                                      ans.setText(Integer.toString(0));
                                  }
                              }
        );
    }}









      }

   }

);
        cc.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        int val1 = Integer.parseInt(ans.getText().toString());
                                        int val2 = Integer.parseInt(ans.getText().toString());
                                        int jibu = val1 + val2;
                                        ans.setText(Integer.toString(jibu));

                                    }

                                }

        );






