package edu.nyu.scps.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.app.AlertDialog;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void visitLocation(View v) {
        // I know this is much more complicated Java code than this assignment calls for,
        // but I didn't want to create 7 different Toast events for each location on the Map
        String locationName = getResources().getResourceName(v.getId());
        String test[] = locationName.split("/");
        Toast toast = Toast.makeText(this, test[1], Toast.LENGTH_LONG);
        toast.show();
    }

    public void Quit(View v) {
        //The builder will build the dialog.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        //Tell the builder about the dialog we want it to create.
        builder.setTitle("Quit");
        builder.setMessage("Don't be a quitter, keep studying that map.");
        //null because we want the positive button to do nothing
        //except dismisss the dialog.
        builder.setPositiveButton("OK", null);

        //Now that we've finished describing the dialog,
        //tell the builder to create it.
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
