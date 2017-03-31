package com.codeclan.example.persistentdataexample;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sandy on 10/08/2016.
 */
public class MainActivity extends AppCompatActivity {
    EditText textToSave;
    Button saveButton;
    TextView savedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textToSave = (EditText)findViewById(R.id.text_to_save);
        saveButton = (Button)findViewById(R.id.save_button);
        savedText = (TextView)findViewById(R.id.saved_text);
//        savedText.setVisibility(View.INVISIBLE);

        String returnedText = SavedTextPreferences.getStoredText(this);
        if (returnedText != null && !returnedText.isEmpty()) {
//            saveButton.setVisibility(View.INVISIBLE);
//            textToSave.setVisibility(View.INVISIBLE);
//            savedText.setVisibility(View.VISIBLE);
            savedText.setText(returnedText);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_hello) {
            Log.d(getClass().toString(), "HIYA");
            Toast.makeText(this, R.string.menu_toast_hello, Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.action_goodbye) {
            Toast.makeText(this, R.string.menu_toast_goodbye, Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.action_greeting){
            Toast.makeText(this, R.string.menu_toast_greeting, Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.action_crash){
        throw new RuntimeException("THANKS FOR CRASHING");
        } else if (item.getItemId() == R.id.action_colour){
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        }else if (item.getItemId() == R.id.action_greeting){
        Toast.makeText(this, R.string.menu_toast_greeting, Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }



    public void onSaveButtonClick(View view) {
        String stringToSave = textToSave.getText().toString();
        Log.d("PersistenceExample:", "Save Button Clicked!");
        Log.d("PersistenceExample:", "The text to save is: '" + textToSave + "'");
//        saveButton.setVisibility(View.INVISIBLE);
//        textToSave.setVisibility(View.INVISIBLE);
//        savedText.setVisibility(View.VISIBLE);
        savedText.setText(stringToSave);

        Context context = view.getContext();
        SavedTextPreferences.setStoredText(context, stringToSave);
    }

}
