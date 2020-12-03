package com.example.nikeshhbaskaran.academiccalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import mehdi.sakout.aboutpage.June2;

public class MainActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.detail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,com.amqtech.opensource.appintroexample.DefaultIntro.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.june).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,June2.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.july).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,mehdi.sakout.aboutpage.July.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.august).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,mehdi.sakout.aboutpage.August.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.september).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,mehdi.sakout.aboutpage.September.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.october).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,mehdi.sakout.aboutpage.October.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.november).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,mehdi.sakout.aboutpage.November.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.december).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,mehdi.sakout.aboutpage.December.class);
                startActivity(intent);
            }
        });


    }

}
