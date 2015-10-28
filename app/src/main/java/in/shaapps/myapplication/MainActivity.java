package in.shaapps.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;

import in.shaapps.preferencecheckbox.CustomCheckedTextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    private SharedPreferences.Editor editor;
    private SharedPreferences sharedpreferences;
    private CustomCheckedTextView customCheckedTextView;
    private boolean temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedpreferences = getSharedPreferences("MyPreference", Context.MODE_PRIVATE);


        customCheckedTextView = (CustomCheckedTextView) findViewById(R.id.customCheckedTextView);
        customCheckedTextView.setTitleText("Title typeface from coding");
        customCheckedTextView.setSubTitleText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        customCheckedTextView.setChecked(true);
        customCheckedTextView.setDividerVisibility(false);
        customCheckedTextView.setTitleTextTypeface("fonts/TravelingTypewriter.ttf");
        customCheckedTextView.setSubTitleTextTypeface("fonts/TravelingTypewriter.ttf");

//        customCheckedTextView.setOnClickListener(this);
        /**
         * Use Checked change listener
         */
        customCheckedTextView.setOnCheckedChangeListener(this);

        loadPreference();

    }

    private void loadPreference() {
        temp = sharedpreferences.getBoolean("VALUE", false);
        customCheckedTextView.setChecked(temp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Log.d("SHA", "Checking");
        editor = sharedpreferences.edit();
        editor.putBoolean("VALUE", isChecked);
        editor.apply();
    }

    @Override
    public void onClick(View v) {

        Log.d("SHA", "Clicking");

        editor = sharedpreferences.edit();

        if (temp) {
            editor.putBoolean("VALUE", false);
            customCheckedTextView.setChecked(false);
            temp = false;
        } else {
            editor.putBoolean("VALUE", true);
            customCheckedTextView.setChecked(true);
            temp = true;
        }

        editor.apply();
    }
}
