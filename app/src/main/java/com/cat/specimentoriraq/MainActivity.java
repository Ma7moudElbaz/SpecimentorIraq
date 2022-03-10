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
        btn_sec1.setOnClickListener(v -> navigateToSecDetailsActivity(1));
        btn_sec2.setOnClickListener(v -> navigateToSecDetailsActivity(2));
        btn_sec3.setOnClickListener(v -> navigateToSecDetailsActivity(3));
        btn_sec4.setOnClickListener(v -> navigateToSecDetailsActivity(4));
        btn_sec5.setOnClickListener(v -> navigateToSecDetailsActivity(5));
        btn_sec6.setOnClickListener(v -> navigateToSecDetailsActivity(6));
        btn_sec7.setOnClickListener(v -> navigateToSecDetailsActivity(7));
        btn_sec8.setOnClickListener(v -> navigateToSecDetailsActivity(8));
        btn_sec9.setOnClickListener(v -> navigateToSecDetailsActivity(9));
        btn_sec10.setOnClickListener(v -> navigateToSecDetailsActivity(10));
        btn_sec11.setOnClickListener(v -> navigateToSecDetailsActivity(11));
        btn_sec12.setOnClickListener(v -> navigateToSecDetailsActivity(12));
//        btn_sec1.setOnClickListener(v -> startActivity(new Intent(getBaseContext(),Sec1Activity.class)));
//        btn_sec2.setOnClickListener(v -> startActivity(new Intent(getBaseContext(),Sec2Activity.class)));
//        btn_sec3.setOnClickListener(v -> startActivity(new Intent(getBaseContext(),Sec3Activity.class)));
//        btn_sec4.setOnClickListener(v -> startActivity(new Intent(getBaseContext(),Sec4Activity.class)));
//        btn_sec5.setOnClickListener(v -> startActivity(new Intent(getBaseContext(),Sec5Activity.class)));
//        btn_sec6.setOnClickListener(v -> startActivity(new Intent(getBaseContext(),Sec6Activity.class)));
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
}