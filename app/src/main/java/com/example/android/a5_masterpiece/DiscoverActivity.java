package com.example.android.a5_masterpiece;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


/**
 * Created by koszojudit on 2017. 07. 02..
 */

public class DiscoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        // Find the toolbar view inside the activity layout
        // Set the Toolbar to act as the ActionBar for this Activity window
        // Make sure the toolbar exists in the activity and is not null

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        // Find the view pager that will allow the user to swipe between fragments
        // Create an adapter that knows which fragment should be shown on each page
        // Set the adapter onto the view pager
        DiscoverFragmentAdapter adapter = new DiscoverFragmentAdapter(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        //Find the tab layout
        // Connect the tab layout with the view pager.

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    // Code for inflation the main menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    // Handling the menu options selection in toolbar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                // User chose the "Search" action
                // Search dialog should open and search in the content of the screen
                // CODE TO BE PUT HERE
                return true;

            case R.id.action_subscription:
                // User chose the "Subscription" action
                //Create intent for SubscriptionActivity and start it
                Intent paymentIntent = new Intent(this, PaymentActivity.class);
                startActivity(paymentIntent);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
