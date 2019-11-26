package com.marakana.yamba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called to lazily initialize the action bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items to the action bar.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // Called every time a user clicks on an action
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            case R.id.action_tweet:
//                startActivity(new Intent("com.marakana.yamba.action.tweet"));
                startActivity(new Intent(this, StatusActivity.class));
                return true;
            case R.id.action_refresh:
                startService(new Intent(this, RefreshService.class));
            case R.id.action_purge:
                int rows = getContentResolver().delete(StatusContract.CONTENT_URI,null, null);
                Toast.makeText(this,"Deleted " +rows+ " rows", Toast.LENGTH_LONG).show();
                return true;

            default:
                return false;
        }
    }
}
