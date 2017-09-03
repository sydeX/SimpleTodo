package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    int itemPos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        setTitle("Edit Item");

        String origItemContent = getIntent().getStringExtra("item_content");
        itemPos =  getIntent().getIntExtra("item_pos", 0);
        EditText etName = (EditText) findViewById(R.id.etItem);
        etName.setText(origItemContent);
    }

    public void onSaveItem(View v) {
        EditText etName = (EditText) findViewById(R.id.etItem);
        // Prepare data intent
        Intent data = new Intent();
        // Pass relevant data back as a result
        data.putExtra("new_item_content", etName.getText().toString());
        data.putExtra("item_pos", itemPos);
        // Activity finished ok, return the data
        setResult(RESULT_OK, data); // set result code and bundle data for response
        finish(); // closes the activity, pass data to parent
    }
}
