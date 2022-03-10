package com.cat.specimentoriraq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class ReadMoreActivity extends AppCompatActivity {

    ImageView close,title;
    RecyclerView recycler;
    ArrayList<Read_more_item> read_more_items;
    int secNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_more);
        initFields();
        close.setOnClickListener(v -> onBackPressed());
    }

    private void initFields() {
        secNo = getIntent().getIntExtra("sec_no",0);
        close = findViewById(R.id.close);
        title = findViewById(R.id.title);
        recycler = findViewById(R.id.recycler);
        read_more_items= new ArrayList<>();

        if (secNo!=0){
            setTitleImage();
            setReadMoreItems(secNo);
        }
    }


    private void setTitleImage() {
        String variableValue = "sec"+secNo+"_title";
        title.setImageResource(getResources().getIdentifier(variableValue, "drawable", getPackageName()));
    }

    private void setReadMoreItems(int secNo) {
        switch (secNo){
            case 6:
                read_more_items.add(new Read_more_item(R.drawable.sec6_readmore_1));
                read_more_items.add(new Read_more_item(R.drawable.sec6_readmore_2));
                break;
            case 7:
                read_more_items.add(new Read_more_item(R.drawable.sec7_readmore_1));
                read_more_items.add(new Read_more_item(R.drawable.sec7_readmore_2));
                break;
            case 8:
                read_more_items.add(new Read_more_item(R.drawable.sec8_readmore_1));
                read_more_items.add(new Read_more_item(R.drawable.sec8_readmore_2));
                read_more_items.add(new Read_more_item(R.drawable.sec8_readmore_3));
                read_more_items.add(new Read_more_item(R.drawable.sec8_readmore_4));
                read_more_items.add(new Read_more_item(R.drawable.sec8_readmore_5));
                read_more_items.add(new Read_more_item(R.drawable.sec8_readmore_6));
                read_more_items.add(new Read_more_item(R.drawable.sec8_readmore_7));
                read_more_items.add(new Read_more_item(R.drawable.sec8_readmore_8));
                read_more_items.add(new Read_more_item(R.drawable.sec8_readmore_9));
                read_more_items.add(new Read_more_item(R.drawable.sec8_readmore_10));
                read_more_items.add(new Read_more_item(R.drawable.sec8_readmore_11));
                break;
            case 9:
                read_more_items.add(new Read_more_item(R.drawable.sec9_readmore_1));
                read_more_items.add(new Read_more_item(R.drawable.sec9_readmore_2));
                read_more_items.add(new Read_more_item(R.drawable.sec9_readmore_3));
                read_more_items.add(new Read_more_item(R.drawable.sec9_readmore_4));
                read_more_items.add(new Read_more_item(R.drawable.sec9_readmore_5));
                read_more_items.add(new Read_more_item(R.drawable.sec9_readmore_6));
                read_more_items.add(new Read_more_item(R.drawable.sec9_readmore_7));
                read_more_items.add(new Read_more_item(R.drawable.sec9_readmore_8));
                read_more_items.add(new Read_more_item(R.drawable.sec9_readmore_9));
                read_more_items.add(new Read_more_item(R.drawable.sec9_readmore_10));
                break;
            case 10:
                read_more_items.add(new Read_more_item(R.drawable.sec10_readmore_1));
                read_more_items.add(new Read_more_item(R.drawable.sec10_readmore_2));
                read_more_items.add(new Read_more_item(R.drawable.sec10_readmore_3));
                read_more_items.add(new Read_more_item(R.drawable.sec10_readmore_4));
                break;
            case 11:
                read_more_items.add(new Read_more_item(R.drawable.sec11_readmore_1));
                read_more_items.add(new Read_more_item(R.drawable.sec11_readmore_2));
                read_more_items.add(new Read_more_item(R.drawable.sec11_readmore_3));
                read_more_items.add(new Read_more_item(R.drawable.sec11_readmore_4));
                break;
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(getBaseContext(), LinearLayoutManager.VERTICAL, false);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(new Read_more_adapter(getBaseContext(),read_more_items));
    }
}