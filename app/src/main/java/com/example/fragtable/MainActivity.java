package com.example.fragtable;

import android.os.Bundle;

import com.example.fragtable.adapter.FragAdapter;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager ;
    private FragAdapter fragAdapter;
    private Button btnnext;
    private Button btnprev;
    int pos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.view01) ;
        fragAdapter = new FragAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragAdapter);

        final TabLayout tab = (TabLayout)findViewById(R.id.tab_layout);
        tab.setupWithViewPager(viewPager);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pos=tab.getPosition();
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) { }
            @Override
            public void onTabReselected(TabLayout.Tab tab) { }
        });

        btnnext = findViewById(R.id.btn_next);
        btnprev = findViewById(R.id.btn_prev);
        btnnext.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                viewPager.setCurrentItem(pos+1);
            }
        });
        btnprev.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                viewPager.setCurrentItem(pos-1);
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
