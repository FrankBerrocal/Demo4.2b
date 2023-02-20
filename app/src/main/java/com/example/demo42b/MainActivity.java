package com.example.demo42b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {
        // Check to see if a button has been clicked.
        boolean checked = ((RadioButton) view).isChecked();

        String radio_button_text ="";

        // Check which radio button was clicked.
        switch(view.getId()) {
            case R.id.sameday:
                if (checked)
                // Do something with spinner_item string.
                    radio_button_text = ((RadioButton) view).getText().toString();
                    displayToast(radio_button_text);
                    break;
            case R.id.nextday:
                if (checked)
                    radio_button_text = ((RadioButton) view).getText().toString();
                    displayToast(radio_button_text);
                    break;
            case R.id.pickup:
                if (checked)
                    radio_button_text = ((RadioButton) view).getText().toString();
                    displayToast(radio_button_text);
                    break;
        }
    }


}
