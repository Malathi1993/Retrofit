package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.security.auth.callback.Callback;

import retrofit.RetrofitError;

public class MainActivity extends AppCompatActivity {
        //SignUpResponse signUpResponsesData;
        EditText mobilenumber, password;
        Button submit;
        TextView response;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            // init the EditText and Button
            response = (TextView) findViewById(R.id.submit);
            mobilenumber = (EditText) findViewById(R.id.ed_password);
            password = (EditText) findViewById(R.id.ed_password);

            submit = (Button) findViewById(R.id.submit);
            // implement setOnClickListener event on sign up Button
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // validate the fields and call sign method to implement the api
                    if ( validate(mobilenumber) && validate(password)) {
                        signUp();
                    }
                }
            });
        }

        private boolean validate(EditText editText) {
            // check the lenght of the enter data in EditText and give error if its empty
            if (editText.getText().toString().trim().length() > 0) {
                return true; // returs true if field is not empty
            }
            editText.setError("Please Fill This");
            editText.requestFocus();
            return false;
        }

        private void signUp() {
            // display a progress dialog
//            final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
//            progressDialog.setCancelable(false); // set cancelable to false
//            progressDialog.setMessage("Please Wait"); // set message
//            progressDialog.show(); // show progress dialog

            // Api is a class in which we define a method getClient() that returns the API Interface class object
            // registration is a POST request type method in which we are sending our field's data
            Api.getClient().registration(mobilenumber.getText().toString().trim(),
                    mobilenumber.getText().toString().trim(),
                    password.getText().toString().trim(),
                    "mobilenumber", new Callback<device_model>() {
                        @Override
                        public void success(device_model device_model, device_model response) {
                            // in this method we will get the response from API
                           // progressDialog.dismiss(); //dismiss progress dialog
                            device_model = device_model;
                            // display the message getting from web api
                            Toast.makeText(MainActivity.this, device_model.getMessage(), Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void failure(RetrofitError error) {
                            // if error occurs in network transaction then we can get the error in this method.
                            Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_LONG).show();
                            //progressDialog.dismiss(); //dismiss progress dialog

                        }
                    });
        }
    }

