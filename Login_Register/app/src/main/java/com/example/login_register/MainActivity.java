package com.example.login_register;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bLogout;
    EditText etName,etAge,etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById((R.id.etName));
        etAge = (EditText) findViewById((R.id.etAge));
        etUsername = (EditText) findViewById((R.id.etUsername));

        bLogout = (Button) findViewById((R.id.bLogout));

        bLogout.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.bLogout:
                startActivity(new Intent(this,Login.class));
                break;

        }

    }
}



