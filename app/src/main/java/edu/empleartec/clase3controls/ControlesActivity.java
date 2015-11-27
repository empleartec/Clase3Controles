package edu.empleartec.clase3controls;

import android.app.Activity;
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

public class ControlesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controles);
    }

    public void imageButtonClick(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text);
    }

    public void saludarClick(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String userText = editText.getText().toString();
        Toast.makeText(this, getString(R.string.hola) + " " +  userText, Toast.LENGTH_SHORT).show();
    }

    public void toggleButtonClick(View view) {
        boolean on = ((ToggleButton) view).isChecked();
        Toast.makeText(this, "Toggle button fue  "+(on?" encendido":"apagado"), Toast.LENGTH_SHORT).show();
    }

    public void checkboxClick(View view) {
        boolean on = ((CheckBox) view).isChecked();
        Toast.makeText(this, "Checkbox "+(on?" checkeado":"no checkeado"), Toast.LENGTH_SHORT).show();
    }
}
