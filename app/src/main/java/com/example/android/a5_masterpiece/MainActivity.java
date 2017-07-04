package com.example.android.a5_masterpiece;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the toolbar view inside the activity layout
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar_main);
        // Set the Toolbar to act as the ActionBar for this Activity window
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(myToolbar);
        myToolbar.setTitle(R.string.app_name);

        // Find the views that show the main options
        RelativeLayout discover = (RelativeLayout) findViewById(R.id.discover);
        RelativeLayout favorites = (RelativeLayout) findViewById(R.id.favorites);
        RelativeLayout selections = (RelativeLayout) findViewById(R.id.selections);

        // Set onClickListener on Discover layout
        discover.setOnClickListener(new View.OnClickListener()

        {
            // Create a new intent and start activity when the view is clicked
            @Override
            public void onClick(View view) {
                Intent discoverIntent = new Intent(MainActivity.this, DiscoverActivity.class);
                startActivity(discoverIntent);
            }
        });

        // Set onClickListener to Favorites layout
        favorites.setOnClickListener(new View.OnClickListener()

        {
            // Create a new intent and start activity when the view is clicked
            @Override
            public void onClick(View view) {
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(favoritesIntent);
            }
        });

        // Set onClickListener to Selection layout
        selections.setOnClickListener(new View.OnClickListener()

        {
            // Create a new intent and start activity when the view is clicked
            @Override
            public void onClick(View view) {
                Intent selectionsIntent = new Intent(MainActivity.this, SelectionsActivity.class);
                startActivity(selectionsIntent);
            }
        });

    }

    // Code to inflate menu icons in toolbar just as they were with actionbar
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
