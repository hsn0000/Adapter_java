package com.example.tes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tes.AfterClass;
import com.example.tes.R;

import java.util.ArrayList;
import java.util.List;

public class ListDataSample extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_list2);
        ListView lv_sample = findViewById(R.id.lv_sample2);
        List<String> data = new ArrayList<>();
        data.add("Azi_hermawan");
        data.add("Ozan_fauzan");
        data.add("Jamaludin_tea");
        data.add("Imam_Solihat");
        data.add("Diki_permana");


        ArrayAdapter<String> adapterData = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,data
        );
        lv_sample.setAdapter(adapterData);
        registerForContextMenu(lv_sample);
        lv_sample.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Bundle b = new Bundle();
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                switch (i){
                    case 0 : {
                        b.putString("orang", "azi");
                        Intent intent = new Intent(ListDataSample.this, AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);
                    }break;
                    case 1:{
                        b.putString("orang", "ozan");
                        Intent intent = new Intent(ListDataSample.this,AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);

                    }break;
                    case 2:{
                        b.putString("orang", "jamal");
                        Intent intent = new Intent(ListDataSample.this,AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);

                    }break;
                    case 3:{
                        b.putString("orang", "imam");
                        Intent intent = new Intent(ListDataSample.this,AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);

                    }break;
                    case 4:{
                        b.putString("orang", "diki");
                        Intent intent = new Intent(ListDataSample.this,AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);


                    }break;
                }
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ctx_menu1: {
                Toast.makeText(getApplicationContext(),
                        "context menu", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.ctx_menu2: {
                Toast.makeText(getApplicationContext(),
                        "context menu", Toast.LENGTH_SHORT).show();
                return true;


            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}