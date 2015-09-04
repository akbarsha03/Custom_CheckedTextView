package in.shaapps.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import in.shaapps.preferencecheckbox.CustomCheckedTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomCheckedTextView customCheckedTextView = (CustomCheckedTextView) findViewById(R.id.customCheckedTextView);
        customCheckedTextView.setTitleText("Title typeface from coding");
        customCheckedTextView.setSubTitleText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        customCheckedTextView.setCheckBoxCheckedState(true);
        customCheckedTextView.setDividerVisibility(false);
        customCheckedTextView.setTitleTextTypeface("fonts/TravelingTypewriter.ttf");
        customCheckedTextView.setSubTitleTextTypeface("fonts/TravelingTypewriter.ttf");

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
}
