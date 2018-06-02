package com.example.shakil.oreo_5_github;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class ActivityLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int   id=item.getItemId();

        if (id == R.id.about)
        {
            Toast.makeText(this,"Clicked on setting",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.setting)
        {
            Toast.makeText(this,"Clicked on setting",Toast.LENGTH_SHORT).show();
        }
        else if(id== android.R.id.home)
        {
            Intent intent=new Intent(ActivityLifecycle.this,ProgressDialogActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
