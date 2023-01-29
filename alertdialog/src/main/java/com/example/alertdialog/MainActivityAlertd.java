package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityAlertd extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alertd);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog();
            }

            private void OpenDialog() {
                ExampleDialog  exampleDialog=new ExampleDialog();
                exampleDialog.show(getSupportFragmentManager(),"Example AlertDialog");
            }
        });
    }
}