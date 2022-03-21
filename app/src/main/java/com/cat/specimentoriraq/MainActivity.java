package com.cat.specimentoriraq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView btn_sec1,btn_sec2,btn_sec3,btn_sec4,btn_sec5,btn_sec6,btn_sec7,btn_sec8
            ,btn_sec9,btn_sec10,btn_sec11,btn_sec12,btn_ref,btn_abb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFields();
        btn_abb.setOnClickListener(v -> startActivity(new Intent(getBaseContext(),AbbreviationsActivity.class)));
        btn_ref.setOnClickListener(v -> startActivity(new Intent(getBaseContext(), ReferencesActivity.class)));
        btn_sec1.setOnClickListener(v -> navigateToSecDetailsCustomActivity(1,1,false));
        btn_sec2.setOnClickListener(v -> navigateToSecDetailsCustomActivity(2,3,false));
        btn_sec3.setOnClickListener(v -> navigateToSecDetailsCustomActivity(3,3,false));
        btn_sec4.setOnClickListener(v -> navigateToSecDetailsCustomActivity(4,2,false));
        btn_sec5.setOnClickListener(v -> navigateToSecDetailsCustomActivity(5,2,false));
        btn_sec6.setOnClickListener(v -> navigateToSecDetailsCustomActivity(6,2,true));
        btn_sec7.setOnClickListener(v -> navigateToSecDetailsCustomActivity(7,2,true));
        btn_sec8.setOnClickListener(v -> navigateToSecDetailsCustomActivity(8,4,true));
        btn_sec9.setOnClickListener(v -> navigateToSecDetailsCustomActivity(9,4,true));
        btn_sec10.setOnClickListener(v -> navigateToSecDetailsCustomActivity(10,2,true));
        btn_sec11.setOnClickListener(v -> navigateToSecDetailsCustomActivity(11,1,true));
        btn_sec12.setOnClickListener(v -> navigateToSecDetailsCustomActivity(12,1,false));
    }

    private void initFields() {
        btn_sec1 = findViewById(R.id.btn_sec1);
        btn_sec2 = findViewById(R.id.btn_sec2);
        btn_sec3 = findViewById(R.id.btn_sec3);
        btn_sec4 = findViewById(R.id.btn_sec4);
        btn_sec5 = findViewById(R.id.btn_sec5);
        btn_sec6 = findViewById(R.id.btn_sec6);
        btn_sec7 = findViewById(R.id.btn_sec7);
        btn_sec8 = findViewById(R.id.btn_sec8);
        btn_sec9 = findViewById(R.id.btn_sec9);
        btn_sec10 = findViewById(R.id.btn_sec10);
        btn_sec11 = findViewById(R.id.btn_sec11);
        btn_sec12 = findViewById(R.id.btn_sec12);
        btn_ref = findViewById(R.id.btn_ref);
        btn_abb = findViewById(R.id.btn_abb);
    }

    private void navigateToSecDetailsActivity(int secNo){
        Intent i = new Intent(getBaseContext(), SecDetailsActivity.class);
        i.putExtra("sec_no",secNo);
        startActivity(i);
    }

    private void navigateToSecDetailsCustomActivity(int secNo,int slideLength,boolean hasReadMore){
        Intent i = new Intent(getBaseContext(), SecDetailsCustomActivity.class);
        i.putExtra("sec_no",secNo);
        i.putExtra("slider_length",slideLength);
        i.putExtra("hasReadMore",hasReadMore);
        startActivity(i);
    }

}