package edu.empleartec.clase3controls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ControlesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controles);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_controles, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up boton_rojo, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void imageButtonClick(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text);
    }

    public void buttonClick(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String userText = editText.getText().toString();
        Toast.makeText(this, getString(R.string.hola) + userText, Toast.LENGTH_SHORT).show();
    }

    public void toggleButtonClick(View view) {
        boolean on = ((ToggleButton) view).isChecked();

    }

    public void checkboxClick(View view) {
        boolean on = ((CheckBox) view).isChecked();
        Toast.makeText(this, "Checkbox "+(on?" checkeado":"no checkeado"), Toast.LENGTH_SHORT).show();
    }
}
