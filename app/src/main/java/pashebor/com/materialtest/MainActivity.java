package pashebor.com.materialtest;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class MainActivity extends Activity implements View.OnClickListener{

    FloatingActionButton exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Typeface keys = Typeface.createFromAsset(getAssets(), getString(R.string.font_swamp_witch));
        Typeface keysSansThin = Typeface.createFromAsset(getAssets(), getString(R.string.font_helios_thin));
        TextView key = (TextView)findViewById(R.id.textLogo);
        TextView key2 = (TextView)findViewById(R.id.textLogo2);
        TextView key3 = (TextView)findViewById(R.id.textLogo3);
        TextView key4 = (TextView)findViewById(R.id.textLogo4);
        TextView key5 = (TextView)findViewById(R.id.textLogo5);
        TextView key6 = (TextView)findViewById(R.id.textLogo6);
        key.setTypeface(keys);
        key2.setTypeface(keys);
        key3.setTypeface(keysSansThin);
        key4.setTypeface(keysSansThin);
        key5.setTypeface(keysSansThin);
        key6.setTypeface(keysSansThin);
        exit = (FloatingActionButton) findViewById(R.id.exit);
        exit.setOnClickListener(this);

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
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.exit:
                finish();
                break;
        }
    }
}
