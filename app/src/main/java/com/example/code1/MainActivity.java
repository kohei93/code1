package com.example.code1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getScore(View view){
        EditText myEditText = (EditText)  findViewById(R.id.myEditText);

        //Edit Textの中身を取得
        String myName = myEditText.getText().toString().trim();


        //中身を見て条件分岐
        if(myName.equals("")){
            //error 処理

            /*error1*/
//            myEditText.setError("Please enter your name");
            /*error2*/
//            Toast.makeText(
//                    this,
//                    "Please enter your name",
//                    Toast.LENGTH_LONG
//            ).show();
            /*error3*/
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder
                    .setTitle("Error")
                    .setMessage("Please enter your name")
                    .setPositiveButton("OK",null);
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }else{

            myEditText.setError("Please enter your name");
        }
    }


}