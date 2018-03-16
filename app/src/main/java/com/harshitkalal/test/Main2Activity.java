package com.harshitkalal.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

  ListView list;
    String ar[]={"Forts","Wildlife"," Palaces","Lakes","Hotels","Religious Places"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        list = (ListView)findViewById(R.id.list);
        ArrayAdapter ada=new ArrayAdapter(getApplication(),android.R.layout.simple_spinner_dropdown_item,ar);
        list.setAdapter(ada);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             String q= ((TextView) view).getText().toString();
                if(i==0){
                    Intent in=new Intent(getApplication(), fort.class);
                    startActivity(in);
                }
               else if(i==1){
                    Intent in=new Intent(getApplication(), wildlife.class);
                    startActivity(in);
                }
                else if(i==2){
                    Intent in=new Intent(getApplication(), palace.class);
                    startActivity(in);
                }
               else if(i==3){
                    Intent in=new Intent(getApplication(), lake.class);
                    startActivity(in);
                }
               else if(i==4){
                    Intent in=new Intent(getApplication(), hotel.class);
                    startActivity(in);
                }

                if(i==5){
                    Intent in=new Intent(getApplication(), religious.class);
                    startActivity(in);
                }





            }
        });





    }
}
